/**
 * 
 */
package com.saw.quartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saw.quartz.job.MyJob;

/**
 * @author Govin
 *
 */
public class QuartzConfig {

	private static final Logger log = LoggerFactory.getLogger(QuartzConfig.class);

	private SchedulerFactory schedulerFactory;
	private Scheduler scheduler;
	private JobDetail job;
	private Trigger trigger;

	private static final String NAME_OF_JOB     = "Job01";
	private static final String NAME_OF_GROUP   = "group01";
	private static final String NAME_OF_TRIGGER = "triggerStart";
	private static final int    TIME_IN_SEC     = 30;

	// quartz configuration and job scheduler
	public void quartzJobConfig() {

		log.info("Scheduler Factory to instantiate Scheduler");
		schedulerFactory = new StdSchedulerFactory();

		try {

			scheduler = schedulerFactory.getScheduler();

			log.info(" The name of the QuartzScheduler main thread is: " + Thread.currentThread().getName());

			// Scheduler start
			scheduler.start();			

		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			log.error("SchedulerException: {}", e.getMessage());
		}
				
		
		// Schedule Job
		try {
			
			scheduler.scheduleJob(jobInstance(), triggerInstance());
			
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			log.error("SchedulerException: {}", e.getMessage());
		}

	}
	
	// return job instance
	private JobDetail jobInstance() {
		//Job Details
		
		job = JobBuilder.newJob(MyJob.class)
				  .withIdentity(NAME_OF_JOB, NAME_OF_GROUP)
				  .usingJobData("jobSays", "Hello Job!")
				  .usingJobData("NoOfJob", 1L)
				  .build();
		
		return job;
		
	}
	
	// return trigger instance
	private Trigger triggerInstance() {
		
		trigger = TriggerBuilder.newTrigger()
				  .withIdentity(NAME_OF_TRIGGER, NAME_OF_GROUP)
				  .startNow()
				  .withSchedule(SimpleScheduleBuilder.simpleSchedule()
				  .withIntervalInSeconds(TIME_IN_SEC)
				  .repeatForever())
				  .build();
		
		return trigger;
		
	}

}
