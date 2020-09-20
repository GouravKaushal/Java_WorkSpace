package com.zensar.product_management.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zensar.product_management.model.Product;
import com.zensar.product_management.util.JDBCUtil;

public class ProductDao {

	public int insert(Product product) {
		Connection connection = JDBCUtil.getConnection();
		PreparedStatement psmt;
		int productId = 0;
		try {
			psmt = connection.prepareStatement("insert into products (productName,productCost)  values (?,?);");
			psmt.setString(1, product.getProductName());
			psmt.setInt(2, product.getProductCost());
			int count = psmt.executeUpdate();
			if (count > 0) {
				psmt = connection.prepareStatement("select id from products where productName=? and productCost=?");
				psmt.setString(1, product.getProductName());
				psmt.setInt(2, product.getProductCost());
				ResultSet rs = psmt.executeQuery();
				if (rs.next()) {
					product.setProductId(rs.getInt(1));
					productId = product.getProductId();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productId;
	}

	public String displayOneProduct(int productId) {

		Connection connection = JDBCUtil.getConnection();
		PreparedStatement psmt;
		String productDetails = null;
		try {
			psmt = connection.prepareStatement("select * from products where id=?;");
			psmt.setInt(1, productId);
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				productDetails = "Product ID : " + rs.getInt(1) + "</br>Product Name : " + rs.getString(2)
						+ "</br>Product Cost : " + rs.getInt(3);
			} else
				productDetails = "Product Not Found";

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productDetails;
	}

	
	
	public String deleteProduct(int productId) {

		Connection connection = JDBCUtil.getConnection();
		PreparedStatement psmt, psmt2;
		String productDetails = null;
		try {
			psmt2 = connection.prepareStatement("select * from products where id=?");
			psmt2.setInt(1, productId);
			ResultSet rs = psmt2.executeQuery();
			if (rs.next()) {
				productDetails = "Product ID : " + rs.getInt(1) + "</br>Product Name : " + rs.getString(2)
						+ "</br>Product Cost : " + rs.getInt(3);

				psmt = connection.prepareStatement("delete from products where id=?;");
				psmt.setInt(1, productId);
				int count = psmt.executeUpdate();
				if (count > 0) {
					return productDetails;
				}
			} else {
				productDetails="Product Not Found with this ID, Please Try Again Different ID";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productDetails;
	}

}
