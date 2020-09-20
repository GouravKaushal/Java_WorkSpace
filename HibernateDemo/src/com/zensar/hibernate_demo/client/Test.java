package com.zensar.hibernate_demo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.zensar.hibernate_demo.entity.Employee;

public class Test {

	public static void main(String[] args) {
		/*
		 * //One To Many Uni-dir Employee employee = new Employee(1003, "Rakesh",
		 * 25000); Address ad1 = new Address("ujjain", "ap", 451444); Address ad2 = new
		 * Address("chennai", "m", 411400);
		 * 
		 * List<Address> addresses=new ArrayList<Address>();
		 * 
		 * addresses.add(ad1); addresses.add(ad2);
		 * 
		 * employee.setAddress(addresses);
		 */

		/*
		 * Address ad1=new Address("indore", "mp", 451254); Address ad2=new
		 * Address("pune", "m", 455654);
		 * 
		 * List<Address> addressess = new ArrayList<Address>();
		 * 
		 * addressess.add(ad1); addressess.add(ad2); employee.setAddress(addressess);
		 */

		/*
		 * Employee employee1 = new Employee(1003, "Amit", 19000); Employee wageEmployee
		 * = new WageEmployee(1002, "Ram", 0, 15, 300);
		 */

		/*
		 * Configuration configuration=new Configuration();
		 * 
		 * SessionFactory sessionFactory =
		 * configuration.configure().buildSessionFactory();
		 * 
		 */

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		// OneToMany Bi-Dir
		//Address ad1 = new Address("ratlam", "ap", 4514111);
		Employee employee = new Employee(10056 ,"Rajesh", 28000);
		//ad1.setEmployee(employee);
		//session.save(ad1);
		session.save(employee);

		/*
		 * session.save(ad1); session.save(ad2);
		 */
		transaction.commit();

	}

}
