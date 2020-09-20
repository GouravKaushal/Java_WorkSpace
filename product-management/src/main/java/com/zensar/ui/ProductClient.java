package com.zensar.ui;

import java.util.Scanner;

import com.zensar.entity.Product;
import com.zensar.service.ProductService;
import com.zensar.serviceprovider.ServiceProvider;

public class ProductClient {

	public static void main(String[] args) {

		ProductService productService = ServiceProvider.getServiceProvider();

		String response = "no";
		int productId, choice;
		
		System.out.println("Welcome ");

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Insert Product");
			System.out.println("2. Display All Product");
			System.out.println("3. Get Particular Product");
			System.out.println("4. Delete Particular Product");
			System.out.println("Please Enter your Choice ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please Enter Product Name : ");
				String productName = sc.next();

				System.out.println("Please Enter Product Cost : ");
				int productCost = sc.nextInt();

				productId = productService.acceptProduct(productName, productCost);

				System.out.println("Your Product is Registered Successfully with Product ID : " + productId);

				System.out.println("Would you like to continue ? [Yes/No] ");
				response = sc.next();

				if (!response.equalsIgnoreCase("Yes")) {
					System.out.println("Thank You for using our services..!!!!");
				}
				break;
			case 2:
				Product[] products = productService.getAllProducts();
				for (Product product : products) {
					if (product != null)
						System.out.println(product);
				}
				break;

			case 3:

				System.out.println("Enter Product ID : ");
				int productSearchId = sc.nextInt();

				try {
					Product product = productService.getProduct(productSearchId);

					if (product != null)
						System.out.println(product);

				} catch (NullPointerException n) {
					System.out.println("Product Not Found..!!!");
				}
				break;
			case 4:
				System.out.println("Enter Product ID : ");
				int productDeleteId = sc.nextInt();
				try {
				Product[] products1 = productService.deleteProduct(productDeleteId);
				System.out.println("Products After Deleting ..!!!!");
				for (Product product1 : products1) {
					if (product1 != null)
						System.out.println(product1);
				}
				}
				catch (NullPointerException e) {
					System.out.println("Wrong Product Id Entered...!!!!!");
				}
				break;

			default:
				System.out.println("Sorry Invalid Choice....!!!!!!");
			}
		} while (response.equalsIgnoreCase("Yes"));
	}
}
