/**
 * 
 */
package com.schedule.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Govin
 *
 */

@Component
@Slf4j
public class SchedulerFixed {

	@Scheduled(fixedRate = 10000)
	public void fixedRateSch() {
		log.info("Fixed Scheduler");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Fixed Rate scheduler:: " + strDate);
	}

}
