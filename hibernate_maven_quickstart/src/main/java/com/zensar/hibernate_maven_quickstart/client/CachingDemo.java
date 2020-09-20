package com.zensar.hibernate_maven_quickstart.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.zensar.hibernate_maven_quickstart.entity.Employee;

public class CachingDemo {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		Employee employee=null;
		Session session1 = factory.openSession();
		
		Transaction transaction = session1.beginTransaction();

		//employee = session1.get(Employee.class, 1007);
		Query query1 = session1.createQuery("from Employee where employeeId=1007");
		employee=(Employee)query1.uniqueResult();
		
		System.out.println(employee);
		
		transaction.commit();
		
		Session session2 = factory.openSession();
		
		Transaction transaction2 = session1.beginTransaction();

		//employee = session2.get(Employee.class, 1007);
		
		
		Query query2 = session1.createQuery("from Employee where employeeId=1007");
		employee=(Employee)query2.uniqueResult();
		System.out.println(employee);
		
		transaction2.commit();

	}

}
