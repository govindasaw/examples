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
public class ActiveMQRoutes extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
//		LocalTime myObj = LocalTime.now();
		from("timer:active-MQ?period=30000")
		.routeId("MQProducer")
		.transform().constant("My Active MQ message - "+LocalTime.now())
		.log("${body}")
		.to("activemq:TEST");
	}

}
