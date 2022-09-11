/**
 * 
 */
package com.camel.routes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Govin
 *
 */

// Timer Based Routes
//@Component
public class TimerRoutes extends RouteBuilder {
	
	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;
	
//	@Autowired
//	private SimpleLoggingProcessor simpleLoggingProcessor;

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:first-timer")
		.log("${body}")
		.bean(getCurrentTimeBean,"getCurrentDate")
		.log("${body}")
		//.bean(simpleLoggingProcessor)
		.log("${body}")
		.process(new SimpleLoggingProcessor())
		.to("log:First-Timer");

	}

}

@Component
class GetCurrentTimeBean {
	public String getCurrentTime() {
		return "Current Date Time " + LocalDateTime.now();
	}
	
	public String getCurrentDate() {
		return "Current Date " + LocalDate.now();
	}
}


class SimpleLoggingProcessor implements Processor{
	
	private Logger log = LoggerFactory.getLogger(SimpleLoggingProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("SimpleLoggingProcessor {}",exchange.getMessage());
		
	}
	
}
