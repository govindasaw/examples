/**
 * 
 */
package com.practice;

/**
 * @author Govin
 *
 */
public class ThreadTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t = new Thread() {
			public void run() {
				System.out.println("Hi T");
			}
		};

		t.start();
		Thread.sleep(1000);
		t.start();
	}

}
