package com.practicehouse.threads;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread("First");
		new MyThread("Second");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Exiting");
	}

}

class MyThread implements Runnable{
	String name;
	Thread t;
	
	MyThread(String threadName){
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread Creating : " + t);
		t.start();
	}
	
	public void run() {
		
		try {
			for(int i = 0; i<=5; i++) {
				System.out.println(name +" : " + i);
				Thread.sleep(2000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(name +" :  Interruped");
		}
		System.out.println(name + " Exiting");
	}
	
}
