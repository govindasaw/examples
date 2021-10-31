/**
 * 
 */
package com.saw.ActiveMQ.message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Govin
 *
 */
@Component
public class MessageReceiver {

	@JmsListener(destination = "ActiveMQ.queue")
	public void receiveQueue(String text) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Message Received: " + text);
	}

}
