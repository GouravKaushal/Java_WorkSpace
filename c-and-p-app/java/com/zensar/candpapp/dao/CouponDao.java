package com.zensar.candpapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zensar.candpapp.model.Coupon;
import com.zensar.candpapp.util.ConnectionUtil;

public class CouponDao {

	public void save(Coupon coupon) {

		Connection connection = ConnectionUtil.getConnection();

		try {
			PreparedStatement psmt = connection
					.prepareStatement("insert into coupon (code,discount,expiry_date) values (?,?,?);");
			psmt.setString(1, coupon.getCouponCode());
			psmt.setBigDecimal(2, coupon.getDiscount());
			psmt.setString(3, coupon.getExpiryDate());
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Coupon findByCode(String code) {
		Connection connection = ConnectionUtil.getConnection();
		Coupon coupon = null;
		try {
			PreparedStatement psmt = connection.prepareStatement("select * from coupon where code=? ;");
			psmt.setString(1, code);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				coupon = new Coupon(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3), rs.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return coupon;

	}

}
