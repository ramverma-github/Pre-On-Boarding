package com.yash.preonboard.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yash.preonboard.dao.impl.CandidateDetailsDaoImpl;
import com.yash.preonboard.domain.CandidateDetails;



@Service
public class PDFReaderService {
	
	public static final String rrf ="Requisition ID";
	public static final String name ="Candidate Full Name";
	
	@Autowired
	private CandidateDetailsDaoImpl pdfDaoImpl;
	
	static String[] lines;
	
	List<String> key=new LinkedList<String>();
	
	Map<String, String> offerDetails;

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

		readPDFText();
//		readPDF();

	}

	public void readPDFText() {

		File file = new File("src/main/resources/OfferLetter.pdf");
		try {

			PDDocument pdDocument = PDDocument.load(file);
			
			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			String pdfText = pdfTextStripper.getText(pdDocument);
			lines = pdfText.split(System.getProperty("line.separator"));
			StringBuilder strBuilder = new StringBuilder();
			for (String line : lines) {
				if(!line.startsWith("https:") && 
				   !line.contains("Offer Approval Print Preview")) {
					strBuilder.append(line);
				}
				
			}
			
			pdDocument.close();

			key.add("Language");
			key.add("Select Offer Template");
			key.add("Requisition ID");
			key.add("Candidate Full Name");
			key.add("Email Address");
			key.add("Primary Skill");
			key.add("Proposed Designation");
			key.add("Proposed Job Grade");
			key.add("Primary Location");
			key.add("Reporting/Joining Location");
			key.add("Business Group BG");
			key.add("Business Unit BU");
			key.add("Proposed Date of Joining");
			key.add("Business Unit Head");
			
			key.add("Business Group Head");
			key.add("BGH");
			
			key.add("Total Annual CTC In Rs.");
			
			key.add("Total Annual CTC In");
			key.add("Words");
			key.add("xyxyxyx");
			
			key.add("Gross Annual Salary");
			key.add("Fixed In Rs.");
			
			key.add("Gross Annual Salary");
			key.add("Fixed In Rs. In Words");
			key.add("xyxyxyx");
			
			key.add("Gross Annual Salary");
			key.add("Variable In Rs.");
			
			key.add("Gross Annual Salary");
			key.add("Variable In Rs. In");
			key.add("Words");
			key.add("NA");
			
			key.add("Salary Increase %");
			key.add("Variable Payout Mode");
			key.add("Payroll Organization");
			
			key.add("Joining Bonus/Sign-on");
			key.add("Bonus Amount In Rs.");
			
			key.add("Joining Bonus/Sign-on");
			key.add("Bonus Amount In Rs. In");
			key.add("Words");
			
			key.add("No. of equal Instalments");
			key.add("in one year");
			
			key.add("Notice Period Buyout");
			key.add("Amount in Rs.");
			
			key.add("Terms of Payment");
			key.add("Service Agreement");
			key.add("Duration");
			
			key.add("Service Agreement");
			key.add("Amount in Rs.");
			
			key.add("Referee Employee ID");
			key.add("Referral Amount in Rs.");
			key.add("Referral Terms of Payment");
			key.add("Approved From BGH");
			key.add("Remark For any");
			key.add("exceptional case");

			
			
			

			offerDetails = new LinkedHashMap<String, String>();

		

			// for loop run till map size
			int i=0;
			int skip=0;
				for (String line : lines) {
					line=line.replaceAll("[(),:]", "");
				if(skip>2)
					{
						if(i<=14){ //36
						String keyToFindData=key.get(i);
						String[] keyAndValue=line.split(keyToFindData);
						if(keyAndValue.length!=0)
						{
							offerDetails.put(keyToFindData, keyAndValue[1]);
						}
						else{
							offerDetails.put(keyToFindData, "");
						}
						
						//System.out.println(line);
				      	i++;	
						}
					}
                 skip++;
				}
				
				
			//	pdfDaoImpl.insertPDF(offerDetails);
			
			

			// System.out.println(pdfText.substring(50, 500));


		} catch (IOException e) {

			e.printStackTrace();
		}
	
	
	
	
	}
	
	
	/*private void readPDF() {
		StringBuffer sb = new StringBuffer();
		try {
			PdfReader reader = new PdfReader("src/main/resources/OfferLetter.pdf");
			PdfReaderContentParser parser = new PdfReaderContentParser(reader);
			
			TextExtractionStrategy strategy;
			
			for (int i = 1; i <= reader.getNumberOfPages(); i++) {
				strategy = parser.processContent(i, new SimpleTextExtractionStrategy());
				sb.append(strategy.getResultantText());
			}
			reader.close();
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}*/
	
public void insertCandidateData(){
		
	CandidateDetails candidateDtls = new CandidateDetails();
	
	candidateDtls.setCndName(offerDetails.get(name));
	
		
	}

}
