package com.kh.library.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

import com.kh.library.model.vo.Lease;

public class LeaseDAO {
	//대여 관리 전체 조회
	public ArrayList<Lease> allLeaseList() {
		ArrayList<Lease> list = new ArrayList();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM LIBRARY";

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				Lease ls = new Lease(rset.getInt(1),rset.getInt(2),rset.getString(3),rset.getDate(4),rset.getDate(5));
				list.add(ls);
			}

		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요.");
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

	//회원 아이디로 대여 조회
	public Lease searchLeaseId(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String query = null;
		Lease ls = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			query = "SELECT * FROM LIBRARY WHERE USER_ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();
			if(rset.next())
				ls = new Lease(rset.getInt(1),rset.getInt(2),rset.getString(3),rset.getDate(4),rset.getDate(5));
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요.");
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ls;
	}

	//책 이름으로 대여 조회
	public Lease searchBookName(String bName) {
		Connection conn = null;
		Statement stmt = null;
		String query = null;
		ResultSet rset = null;
		Lease ls = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			query = "SELECT * FROM LIBRARY JOIN BOOK USING (BOOK_NO) WHERE BOOK_NAME = '"+bName+"'";
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) 
			 ls = new Lease(rset.getInt(1),rset.getInt(2),rset.getString(3),rset.getDate(4),rset.getDate(5));
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요.");
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
		return ls;
	}

	//대여 정보 추가
	public int insertLease(Lease ls, String bName) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		ResultSet rset = null;
		String query = null;
		int result = 0;
		Calendar cal = Calendar.getInstance();
        cal.setTime(new java.util.Date());
        cal.add(Calendar.DATE, 2);
        Date d = new Date(cal.getTimeInMillis());

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			query = "SELECT BOOK_NO FROM BOOK WHERE BOOK_NAME = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bName);
			rset = pstmt.executeQuery();
			rset.next();
			query = "INSERT INTO LIBRARY VALUES (?,?,?,?,?)";
			pstmt2 = conn.prepareStatement(query);
			pstmt2.setInt(1, ls.getBookNo());
			pstmt2.setInt(2, rset.getInt("BOOK_NO"));
			pstmt2.setString(3, ls.getUserId());
			pstmt2.setDate(4, new java.sql.Date(new java.util.Date().getTime()));
			pstmt2.setDate(5,new java.sql.Date(d.getTime()));   
			result = pstmt2.executeUpdate();
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요.");
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				pstmt2.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return result;
	}
}