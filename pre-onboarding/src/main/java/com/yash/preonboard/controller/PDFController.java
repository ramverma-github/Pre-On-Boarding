package com.yash.preonboard.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.yash.preonboard.service.CandidateDetailsService;

@RestController
public class PDFController {

	@Autowired
	CandidateDetailsService pdfService;
	
	@RequestMapping(value = "/PDF", method = RequestMethod.POST, headers = "Accept=*/*")
	public String receivePDFFromFrontEnd(@RequestParam("userFile") MultipartFile multipartFile) throws IOException {
		pdfService.createPDFfromMultipartFile(multipartFile);
		return "Received";
	}
	
	@RequestMapping(value = "/readPDF", method = RequestMethod.POST, headers = "Accept=*/*")
	public String receivePDFFromFrontEnd() throws IOException {
		pdfService.readPDF();
		return "Received";
	}

}
