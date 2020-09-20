package com.zensar.product_management.repository;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

import com.zensar.product_management.model.Product;

public class ProductRepositoryHibernateImpl implements ProductRepository {

	private Session getSession() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		return session;
	}

	@Override
	public int insertProduct(Product product) {
		System.out.println("inside inserProduct .....");
		ProductRepositoryHibernateImpl impl=new ProductRepositoryHibernateImpl();
		Session session=impl.getSession();
		Transaction transaction1 = session.beginTransaction();
		
		session.save(product);
		transaction1.commit();
		
		
		Transaction transaction2 = session.beginTransaction(); 
		String hql="SELECT P.productId FROM Product P WHERE P.productName = :product_Name and  P.productCost = :product_Cost";	
		Query query = session.createQuery(hql);
		query.setParameter("product_Name",product.getProductName());
		query.setParameter("product_Cost", product.getProductCost());
		List results = query.list();
		int productId=0;
		Iterator it=results.iterator();
		while(it.hasNext())
		{
			productId=(Integer)it.next();
		}
	//System.out.println("Product Id : "+productId);
	return productId;
	}

	@Override
	public void displayAllProduct() {

	}

	@Override
	public String displayOneProduct(int productId) {

		return null;
	}

	@Override
	public String deleteProduct(int productId) {

		return null;
	}

}
