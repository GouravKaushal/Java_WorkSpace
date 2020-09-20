package com.zensar.myfirstproject.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
public static void main(String[] args) {
	Properties properties=new Properties();
	try {
		properties.load(new FileReader(new File("myproperties.properties")));
		
		String name = properties.getProperty("name");
		System.out.println(name);
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
