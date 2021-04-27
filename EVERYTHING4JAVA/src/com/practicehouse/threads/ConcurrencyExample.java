package com.practicehouse.threads;

public class ConcurrencyExample extends Thread {
	
	public static int amount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrencyExample t1 = new ConcurrencyExample();
		t1.start();
		while(t1.isAlive()) {
			System.out.println("Waiting..");
		}
		System.out.println(". " + amount);
		amount++;
		System.out.println(".. " + amount);

	}
	
	public void run() {
		increaseamount();
	}
	
	// object level locking
	
	//synchronized method
	public synchronized int increaseamount() {
		amount++;
		return amount;
	}
	
	// synchronized block
	public int increaseamount2() {
		synchronized(this) {
			amount++;
			return amount;
		}
	}
	
	
	// Class level locking
	public static synchronized int incrementAmount() {
		return 1;
	}
	
	// .class lock with synchronized block
	public int increaseAmount2() {
		synchronized(ConcurrencyExample.class) {
			amount++;
			return amount;
		}
	}
	
	

}
