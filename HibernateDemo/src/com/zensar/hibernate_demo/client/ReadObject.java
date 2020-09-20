package com.zensar.hibernate_demo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.zensar.hibernate_demo.entity.Address;

public class ReadObject {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		//Employee employee=session.get(Employee.class, 1003);
		/*//One To Many uni-directional;
		 * System.out.println(employee.getAddress()); System.out.println(employee);
		 */
		
		//One To Many Bi-Directional
		Address address=session.get(Address.class, 4514111);
		System.out.println(address.getEmployee());
		System.out.println(address);
		
		/*
		 * Address ad1=session.get(Address.class,451254); System.out.println(ad1);
		 */
		transaction.commit();
		session.close();
	}
	
}
