/**
 * 
 */
package com.java9;

/**
 * @author Govin
 *
 */
public class ProcessAPIImprovements {

	/**
	 * @param args
	 * 
	 *             Java SE 9 is coming with some improvements in Process API. They
	 *             have added couple new classes and methods to ease the controlling
	 *             and managing of OS processes.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessHandle currentProcess = ProcessHandle.current();
		System.out.println("Current Process Id: = " + currentProcess.pid());

	}

}
