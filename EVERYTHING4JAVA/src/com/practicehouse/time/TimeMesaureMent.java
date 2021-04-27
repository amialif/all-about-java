package com.practicehouse.time;

import java.util.concurrent.TimeUnit;

public class TimeMesaureMent {

	public static void main(String[] args) {
		
		long startTimeNs = System.nanoTime();
		long startTimeMs = System.currentTimeMillis();		
		
		for (int i = 0; i <= 100000; i++) {
			System.out.print(i + " ");
		}
		
		long endTimeNs = System.nanoTime();
		long endTimeMs = System.currentTimeMillis();
		
		System.out.println("Time Took : " + (endTimeNs - startTimeNs) + " Ns");
		System.out.println("Time in seconds : " + TimeUnit.SECONDS.convert((endTimeNs - startTimeNs) ,TimeUnit.NANOSECONDS) + " Seconds");
		
		System.out.println("Time Took : " + (endTimeMs - startTimeMs) + " Ms");		
		System.out.println("Time Took : " + (double) (endTimeMs - startTimeMs)/1000 + " Ms");
		
		// proper explanation and more example in practicehouse.com
		
	}

}
