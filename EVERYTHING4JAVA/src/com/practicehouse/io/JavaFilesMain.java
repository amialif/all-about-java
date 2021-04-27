package com.practicehouse.io;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class JavaFilesMain {

	public static void main(String[] args) throws IOException {
		
		// InPutStream - read data from a source
		// OutPutStream - Writing data to a destination
		
		// Source Program Destination
		
		long startTime = System.nanoTime();
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("C://Users//rahman.arifur//Desktop//input.txt");
			out = new FileOutputStream("C://Users//rahman.arifur//Desktop//output.txt");
			
			int text;
			
			while((text = in.read()) != -1) {
				out.write(text);
			}
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
		
		long totalTime = System.nanoTime() - startTime;
		System.out.println("Time Took : " + TimeUnit.SECONDS.convert(totalTime, TimeUnit.NANOSECONDS) + "Seconds");
		
		// proper explanation and more example in practicehouse.com

	}

}
