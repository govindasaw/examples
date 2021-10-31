/**
 * 
 */
package com.saw.ActiveMQ.message;

import java.util.Arrays;
import java.util.List;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Govin
 *
 */
@Component
public class MessageCreator implements CommandLineRunner {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private Queue queue;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.jmsMessagingTemplate.convertAndSend(this.queue, "Hi ActiveMQ!!");
		System.out.println("Message has been put to queue by sender");
		Integer[] no = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(no);
		list.forEach(n -> {
			try {
				Thread.sleep(5000);
				this.jmsMessagingTemplate.convertAndSend(this.queue, "ActiveMQ No.: "+n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

}
