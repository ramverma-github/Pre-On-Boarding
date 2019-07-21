package com.yash.preonboard.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yash.preonboard.bean.CandidateDetailsBean;
import com.yash.preonboard.bean.CandidateFormBean;
import com.yash.preonboard.bean.PDFReaderBean;
import com.yash.preonboard.dao.BusinessGroupDAO;
import com.yash.preonboard.dao.BusinessUnitDAO;
import com.yash.preonboard.dao.CandidateDetailsDao;
import com.yash.preonboard.domain.CandidateDetails;
import com.yash.preonboard.helper.BeanToDomainHelper;
import com.yash.preonboard.helper.DomainToBeanHelper;
import com.yash.preonboard.service.CandidateDetailsService;
import com.yash.preonboard.service.PDFServiceHelper;

@Service
public class CandidateDetailsServiceImpl extends PDFServiceHelper implements CandidateDetailsService {

	@Autowired
	private CandidateDetailsDao pdfDao;

	@Autowired
	BusinessUnitDAO businessUnitDAO;

	@Autowired
	BusinessGroupDAO businessGroupDAO;

	@Override
	public void readPDF() {

		String[] lines = null;

		try {

			File file = new File("src/main/resources/OfferLetter.pdf");

			PDDocument pdDocument = PDDocument.load(file);

			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			String pdfText = pdfTextStripper.getText(pdDocument);
			lines = pdfText.split(System.getProperty("line.separator"));
			StringBuilder strBuilder = new StringBuilder();
			for (String line : lines) {
				if (!line.startsWith("https:") && !line.contains("Offer Approval Print Preview")
						&& !line.contains("Offer Details") && !line.isEmpty() && !line.equals(" ")
						&& !line.contains("Approver") && !line.contains("NA")) {
					strBuilder.append(line.trim() + " ");
				}
			}

			pdDocument.close();
			Map<String, String> resultMap = null;
			Map<Integer, String> mapOfKeys =null;
			Map<String, String> keyValueMap=null;

			if (strBuilder.toString().contains("Trainee Positions Offer Detail Template")) {
				 mapOfKeys = populateHashMapForTraineePositions();
				 keyValueMap = populateKeyValueMapforTraineePositions();
			}else if (strBuilder.toString().contains("Full Time Positions Offer Detail Template")) {
				mapOfKeys = populateHashMap();
				keyValueMap = populateKeyValueMap();
			}else if(strBuilder.toString().contains("Contract Positions Offer Detail Template")){
				mapOfKeys = populateHashMapForContractor();
				keyValueMap = populateKeyValueMapforContractor();
			}
			
			resultMap = extractValues(strBuilder, mapOfKeys, keyValueMap);

			CandidateDetails candidateDetails = BeanToDomainHelper.convertPDFBeanToCandidateDomain(
					setBeanFromPDF(resultMap), businessUnitDAO.getAllBusinessUnits(),
					businessGroupDAO.getAllBusinessGroups());
			if (null != candidateDetails) {
				pdfDao.savdPDFDetails(candidateDetails);
			}

		} catch (Exception exception) {

			exception.printStackTrace();
		}
	}

	private PDFReaderBean setBeanFromPDF(Map<String, String> resultMap)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		PDFReaderBean pdfReaderBean = new PDFReaderBean();
		Class<? extends PDFReaderBean> pdfBeanClass = pdfReaderBean.getClass();

		for (String key : resultMap.keySet()) {
			String value = resultMap.get(key);
			Method method = pdfBeanClass.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1),
					String.class);
			method.invoke(pdfReaderBean, value);
		}
		return pdfReaderBean;

	}

	private Map<String, String> extractValues(StringBuilder strBuilder, Map<Integer, String> mapOfKeys,
			Map<String, String> keyValueMap) {

		Map<String, String> resultMap = new HashMap<>();

		Integer end = 0;
		String strToRemove;
		String actualKey;
		String value;

		for (int i = 0; i <= mapOfKeys.size(); i++) {

			String valueToCompare = mapOfKeys.get(i);
			String nextKey = mapOfKeys.get(i + 1);

			if (nextKey != null) {
				if (strBuilder.toString().contains(valueToCompare)) {

					actualKey = keyValueMap.get(valueToCompare);

					value = strBuilder.toString().trim().substring(valueToCompare.trim().length() + 1,
							strBuilder.toString().trim().indexOf(nextKey)).trim();

					System.out.println(actualKey + " :: " + value);

					resultMap.put(actualKey, value);

					strToRemove = resultMap.get(actualKey);

					if (strToRemove == null || strToRemove.isEmpty()) {
						end = strBuilder.indexOf(valueToCompare) + valueToCompare.length();
					} else {
						end = strBuilder.indexOf(resultMap.get(actualKey)) + resultMap.get(actualKey).length();
					}

					strBuilder = strBuilder.replace(0, end, "");

					// System.out.println("end of string");

				}
			}
		}
		return resultMap;
	}

	@Override
	public void createPDFfromMultipartFile(MultipartFile multipartFile) {

		if (multipartFile.isEmpty()) {
			System.out.println("empty File");
		} else {
			byte[] bytes;
			try {
				bytes = multipartFile.getBytes();
				FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/OfferLetter.pdf");
				fileOutputStream.write(bytes);
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		readPDF();
	}

	@Override
	public CandidateDetailsBean getCandidateDetails(String cndId) {
		CandidateDetailsBean candidateDtlsBean = null;
		CandidateDetails candidateDtlsDomain = pdfDao.getCandidateDetails(cndId);
		if (null != candidateDtlsDomain) {
			candidateDtlsBean = DomainToBeanHelper.convertDomainToBean(candidateDtlsDomain);
		}
		return candidateDtlsBean;
	}

	@Override
	public Boolean updateCandidateDtls(CandidateFormBean candidateFormBean) {
		CandidateDetails CandidateDetailsDomain = BeanToDomainHelper
				.convertCandidateFormBeanToDomain(candidateFormBean);
		return pdfDao.updateCandidateDtls(CandidateDetailsDomain);
	}

}
