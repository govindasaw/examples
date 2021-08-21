/**
 * 
 */
package com.saw.quartz.job;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Govin
 *
 */
public class MyJob implements Job{
	
	private static final Logger log = LoggerFactory.getLogger(MyJob.class);

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		log.info("Job is executing");
		JobDataMap dataMap = context.getJobDetail().getJobDataMap();
		
		String jobSays = dataMap.getString("jobSays");
        long value = dataMap.getLong("NoOfJob");

        System.out.println("Job says: " + jobSays + ", and val is: " + value);		
		
	}

}
