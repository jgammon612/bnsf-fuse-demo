package com.bnsf.examples.messaging;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.apache.camel.ExchangePattern;



import com.bnsf.examples.railyard.RailyardData;

@Component
public class CamelConfiguration extends RouteBuilder {

  private static final Logger log = LoggerFactory.getLogger(CamelConfiguration.class);


  @Autowired
  private ProcessorProperties props;
  
  @Override
  public void configure() throws Exception {
	
	  from("cxf:/railyard?serviceClass=com.bnsf.examples.railyard.RailyardPortType&loggingFeatureEnabled=true&dataFormat=PAYLOAD")
	  .to(ExchangePattern.InOnly, "jms://queue:raildata-xml?connectionFactory=#pooledJmsConnectionFactory");
	  
  }
  
}
