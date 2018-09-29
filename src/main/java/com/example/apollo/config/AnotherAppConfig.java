package com.example.apollo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

//这个是最复杂的配置形式，指示Apollo注入"TEST1.T2 namespace的配置到Spring环境中，并且顺序在AppConfig前面,
//所以即使在AppConfig中定义了value = {"TEST1.T1"}也是没用的，在AppConfig中定义的bean同名的参数（例如batch）也都是用TEST1.T2
@Configuration
@EnableApolloConfig(value = {"TEST1.T2"}, order = 1)
public class AnotherAppConfig {
	
	  @Bean("testBean2")
	  @RefreshScope
     @ConfigurationProperties(prefix = "a.b")
	  public TestBean2 testBean2() {
		  return new TestBean2();
	  }
}
