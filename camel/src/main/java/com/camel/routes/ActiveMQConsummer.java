/**
 * 
 */
package com.camel.routes;

import java.time.LocalTime;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author Govin
 *
 */
@Component
public class ActiveMQConsummer extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("activemq:TEST")
		.routeId("MQConsumer")
		.process("activeMQProcessor");
	}

}
