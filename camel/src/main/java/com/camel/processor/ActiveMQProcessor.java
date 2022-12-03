/**
 * 
 */
package com.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Govin
 *
 */
@Component("activeMQProcessor")
@Slf4j
public class ActiveMQProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		log.info("In ActiveMQProcessor");
		log.info(exchange.getExchangeId());
		log.info(exchange.getFromRouteId());
		log.info("", exchange.getAllProperties());
		log.info("", exchange.getMessage());
		
	}

}
