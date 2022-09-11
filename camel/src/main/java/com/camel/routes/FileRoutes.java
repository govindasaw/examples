/**
 * 
 */
package com.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author Govin
 *
 */

//File Based Routes
@Component
public class FileRoutes extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("file:files/input")
		.log("${body}")
		.to("file:files/output");
		
	}

}
