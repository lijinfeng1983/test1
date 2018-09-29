package com.example.apollo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.scope.refresh.RefreshScope;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;

public class TestApolloAnnotationBean {
	  @ApolloConfig("TEST1.T2")
	  private Config config_T2; //inject config for namespace FX.apollo	  
	  
	  
	  @Autowired
	  private RefreshScope refreshScope;
	  
	  
	  @ApolloConfigChangeListener({"TEST1.T2"})
	  public void onChange(ConfigChangeEvent changeEvent) {
	    boolean changed = false;
	    for (String changedKey : changeEvent.changedKeys()) {
	      if (changedKey.startsWith("a.b")) {
	    	  System.out.println("--------------------------------------------");
	    	  System.out.println(changedKey);
	    	  System.out.println(config_T2.getIntProperty(changedKey, 100));
	    	  System.out.println("--------------------------------------------");
	    	  refreshScope.refresh("testBean2");
	    	  changed = true;
	        break;
	      }
	    }
	    if (!changed) {
	      return;
	    }
	}

	}
