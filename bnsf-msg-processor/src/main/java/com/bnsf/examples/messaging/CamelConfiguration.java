package com.bnsf.examples.messaging;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CamelConfiguration extends RouteBuilder {

  private static final Logger log = LoggerFactory.getLogger(CamelConfiguration.class);


  @Autowired
  private ProcessorProperties props;
  
  @Override
  public void configure() throws Exception {
	  from("cxf:/railyard?serviceClass=com.bnsf.examples.railyard.RailyardPortType&loggingFeatureEnabled=true")
	   .log("Picked up message: [${body}]");
	  
  }
  
}
