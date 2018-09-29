package com.example.apollo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


//@ConfigurationProperties(prefix = "a.b")
//@Component("testBean2")
//@RefreshScope
public class TestBean2 {
	  @Value("${timeout:100}") //100是默认值
	  private int timeout;
	  @Value("${batch:200}")
	  private int batch;
	  @Value("${num:200}")
	  private int num;
	  
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
}
	  