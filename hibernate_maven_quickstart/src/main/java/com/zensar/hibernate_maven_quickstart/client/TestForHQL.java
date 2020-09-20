package com.zensar.hibernate_maven_quickstart.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.zensar.hibernate_maven_quickstart.entity.StudentForHQL;

public class TestForHQL {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		/*
		 * //For creating table Random r=new Random(); for (int i = 1; i < 30; i++) {
		 * StudentForHQL student = new StudentForHQL(); student.setStudentId(i);
		 * student.setStudentName("sName "+i); student.setStudentAge(r.nextInt(30));
		 * session.save(student); } transaction.commit();
		 */

		String hql = "from StudentForHQL S WHERE S.studentId<5";
		Query query = session.createQuery(hql);
		List <StudentForHQL>results = query.list();
		for(StudentForHQL s:results)
		{
			System.out.println(s);
		}

	}

}
