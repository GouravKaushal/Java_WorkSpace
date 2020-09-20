package com.zensar.hibernate_maven_quickstart.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.zensar.hibernate_maven_quickstart.entity.Employee;

public class Test {
	public static void main(String[] args) {
		// Student student = new Student("Amit", 28);

		/*
		 * Configuration configuration=new Configuration(); SessionFactory
		 * sessionFactory=configuration.configure().buildSessionFactory();
		 */

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		// OneToMany Bi-Dir
		//Address ad1 = new Address("ratlam", "ap", 4514111);
		Employee employee = new Employee(1008 ,"Gourav", 28900);
		//ad1.setEmployee(employee);
		//session.save(ad1);
		session.save(employee);

		/*
		 * session.save(ad1); session.save(ad2);
		 */
		transaction.commit();

	}
}
