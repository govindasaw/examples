package com.saw.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuartzApplication {

	private static final Logger log = LoggerFactory.getLogger(QuartzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(QuartzApplication.class, args);
		
		log.info("Main Method");
		
		QuartzConfig quartzScheduler = new QuartzConfig();
		quartzScheduler.quartzJobConfig();
		
	}

}
