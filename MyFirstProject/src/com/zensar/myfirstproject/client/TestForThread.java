package com.zensar.myfirstproject.client;

public class TestForThread {
public static void main(String[] args) {
	
	MyThread thread1=new MyThread(); 
	MyThread thread2=new MyThread();
	
	Thread th1=new Thread(thread1);
	Thread th2 =new Thread(thread2);
	th1.setName("ramPrinter");
	th2.setName("seetaPrinter");
	
	th1.start();
	th2.start();
}
}

