package com.zensar.serviceprovider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.zensar.service.ProductService;

public class ServiceProvider {

	private static ProductService productService;

	public static ProductService getServiceProvider() {
		Properties properties = new Properties();

		try {
			properties.load(new FileReader("./resources/serviceprovider.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String providerName = properties.getProperty("service.provider");

		try {
			productService = (ProductService) Class.forName(providerName).newInstance();

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productService;

	}

}
