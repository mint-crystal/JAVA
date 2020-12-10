package com.kh.library.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.library.model.vo.Customer;

public class CustomDAO {
	//회원 전체 조회
	public ArrayList<Customer> allCustomerList() {
		ArrayList<Customer> list = new ArrayList<Customer>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM CUSTOMER";

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			while(rset.next()) {
				Customer ct = new Customer(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getInt(4),rset.getString(5),
						rset.getString(6).charAt(0), rset.getDate(7));
				list.add(ct);
			}
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요");
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	//회원 이름으로 조회
	public ArrayList<Customer> searchCustomerName(String name) {
		ArrayList<Customer> list = new ArrayList<Customer>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM CUSTOMER WHERE USER_NAME = '"+name+"'";

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				Customer ct = new Customer(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getInt(4),rset.getString(5),
						rset.getString(6).charAt(0), rset.getDate(7));
				list.add(ct);
			}
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요");
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	//회원 아이디로 조회
	public Customer searchCustomerId(String id) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM CUSTOMER WHERE USER_ID = '"+id+"'";
		Customer ct = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				ct = new Customer(rset.getInt(1),rset.getString(2),rset.getString(3),rset.getInt(4),rset.getString(5),
						rset.getString(6).charAt(0), rset.getDate(7));
			}
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요");
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ct;
	}

	//회원가입 - 회원번호 시퀀스 활용
	public int insertCustomer(Customer ct) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = null;
		int result = 0;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			query = "INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, ct.getUserNo());
			pstmt.setString(2, ct.getUserId());
			pstmt.setString(3, ct.getUserName());
			pstmt.setInt(4, ct.getUserAge());
			pstmt.setString(5, ct.getAddr());
			pstmt.setString(6, String.valueOf(ct.getGender()));
			pstmt.setDate(7, ct.getEnrollDate());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요.");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	//회원 정보 수정
	public int updateCustomer(Customer ct) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = null;

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			query = "UPDATE CUSTOMER SET USER_AGE = ?, ADDR = ?, GENDER = ? WHERE USER_ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, ct.getUserAge());
			pstmt.setString(2, ct.getAddr());
			pstmt.setString(3, String.valueOf(ct.getGender()));
			pstmt.setString(4, ct.getUserId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요.");
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
		
	//회원 탈퇴
	public int deleteCustomer(Customer ct) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String query = null;
		if(ct == null)
			return result;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			stmt = conn.createStatement();
			query = "DELETE FROM CUSTOMER WHERE USER_ID='"+ct.getUserId()+"'";
			result = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요");
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
		
}