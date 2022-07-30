/**
 * 
 */
package com.schedule.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Govin
 *
 */
@Component
public class SchedulerDelay {

	@Scheduled(fixedDelay = 1000, initialDelay = 10000)
	public void fixedDelaySch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Fixed Delay scheduler:: " + strDate);
	}

}
