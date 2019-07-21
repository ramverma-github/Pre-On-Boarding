package com.yash.preonboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yash.preonboard.bean.Test;
import com.yash.preonboard.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	
	@RequestMapping(value="/create", method=RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE )
	public String createTest1() {
		
		return testService.createTest(new Test(101,"RAMBABUVERMA"));
	}
	
	@RequestMapping(value="/create/{test}", method=RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE )
	public String createTest(@RequestBody Test test) {
		
		
		return testService.createTest(test);
	}
	
	@RequestMapping(value="/update/{test}", method=RequestMethod.PUT, produces= MediaType.APPLICATION_JSON_VALUE)
	public String updateTest(@RequestBody Test test) {
		return testService.updateTest(test);
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_VALUE)
	public String deleteTest(@PathVariable int id) {
		return testService.deleteTest(id);
	}

	@RequestMapping(value="/getTest/{id}", method=RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public Test getTest(@PathVariable int id) {
		return testService.getTest(id);
	}
	
}
