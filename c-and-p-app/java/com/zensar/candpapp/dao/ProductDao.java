package com.zensar.candpapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zensar.candpapp.model.Product;
import com.zensar.candpapp.util.ConnectionUtil;

public class ProductDao {

	public void save(Product product) {

		Connection connection = ConnectionUtil.getConnection();

		try {
			PreparedStatement psmt = connection
					.prepareStatement("insert into product (name,discription,price) values (?,?,?);");
			psmt.setString(1, product.getName());
			psmt.setString(2, product.getDescription());
			psmt.setBigDecimal(3, product.getPrice());
			
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
