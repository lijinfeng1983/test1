package com.example.apollo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apollo.config.TestApolloAnnotationBean;
import com.example.apollo.config.TestApolloSpringBean;
import com.example.apollo.config.TestBean2;


@RestController
public class mainController {
	
	@Autowired
	  private TestApolloAnnotationBean conf;
	
	@Autowired
	  private TestApolloSpringBean testApolloSpringBean;
	
	@Autowired
     private TestBean2  testBean2;
	
	@GetMapping("/test2")
	  public int test2() {
		return testApolloSpringBean.getBatch();
	  }
	
	@GetMapping("/test3")
	  public int test3() {
		return testBean2.getBatch();
	  }
	
	@GetMapping("/test4")
	  public int test4() {
		return testBean2.getNum();
	  }

	
	
}
