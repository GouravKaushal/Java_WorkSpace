package com.zensar.myfirstproject.client;

public class MyThread implements Runnable{

	@Override
	public void run() {
	
		if(Thread.currentThread().getName().equals("ramPrinter"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Ram");
			}
		}
		if(Thread.currentThread().getName().equals("seetaPrinter"))
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Seeta");
			}
		}
		
	}

}
