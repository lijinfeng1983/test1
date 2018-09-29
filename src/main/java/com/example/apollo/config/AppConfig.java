package com.example.apollo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;


//虽然这里用了TEST1.T1，但是他的order是2，所以还是会用AnotherAppConfig中的value值（即TEST1.T2）
@Configuration
@EnableApolloConfig(value = {"TEST1.T1"},order = 2)

public class AppConfig {
	
  @Bean
  public TestApolloAnnotationBean testApolloAnnotationBean() {
    return new TestApolloAnnotationBean();
  }
  
  @Bean
  public TestApolloSpringBean testApolloSpringBean() {
	  return new TestApolloSpringBean();
  }
  
  
  

  
}