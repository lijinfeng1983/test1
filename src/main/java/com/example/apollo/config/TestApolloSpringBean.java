package com.example.apollo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;

//@Component("testApolloSpringBean")
//@RefreshScope
public class TestApolloSpringBean {
	  @Value("${timeout:100}") //100是默认值
	  private int timeout;
	  private int batch;
	 
	  @Value("${batch:200}")
	  public void setBatch(int batch) {
	    this.batch = batch;
	  }
	 
	  public int getTimeout() {
	    return timeout;	
	  }
	 
	  public int getBatch() {
	    return batch;
	  }
}
