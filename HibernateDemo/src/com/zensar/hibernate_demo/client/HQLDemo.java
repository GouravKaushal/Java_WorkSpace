package com.zensar.hibernate_demo.client;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;


public class HQLDemo {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		
		Query query=session.createQuery(" SELECT e.employeeName from com.zensar.hibernate_demo.entity.Employee e order by e.employeeName "
				+ " ");
		List result=query.list();
		
		Iterator it=result.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}
}
