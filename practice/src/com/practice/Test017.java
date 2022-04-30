/**
 * 
 */
package com.practice;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

/**
 * @author Govin Custom logger xml path with log4j 2.17.2
 */
public class Test017 {
	static final Logger logger = LogManager.getLogger(Test017.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConfigurationSource source;
		try {
//			source = new ConfigurationSource(new FileInputStream("D:\\github\\examples\\practice\\config\\log4j2.xml"));
//			Configurator.initialize(null, source);
			LoggerContext context = (LoggerContext) LogManager.getContext(false);
			File file = new File("D:\\log4j2.xml");
			context.setConfigLocation(file.toURI());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(logger.getLevel());
		logger.trace("Entering application.");
		logger.info("Entering application.");
		logger.debug("Entering application.");
		logger.warn("Entering application.");
		logger.error("Entering application.");

	}

}
