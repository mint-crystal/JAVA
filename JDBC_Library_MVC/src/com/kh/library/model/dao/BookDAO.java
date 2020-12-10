package com.kh.library.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.library.model.vo.Book;

public class BookDAO {
	//전체 책 조회
	public ArrayList allBookList() {
		ArrayList<Book> list = new ArrayList<Book>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM BOOK";

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			while(rset.next()) {
				Book book = new Book(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getInt(4), rset.getString(5), rset.getString(6));
				list.add(book);
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

	//책 코드로 조회
	public Book searchBookNo(int bNo) {
		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Book book = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			query = "SELECT * FROM BOOK WHERE BOOK_NO = ?";
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bNo);
			rset = pstmt.executeQuery();
			if(!rset.next())
				book = null;
			else
				book = new Book(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getInt(4), rset.getString(5), rset.getString(6));
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
		return book;
	}
	
	//책 추가하기
	public int insertBook(Book bk) {
		Connection conn = null;
		Statement stmt = null;
		String query = null;
		int result = 0;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			query = "INSERT INTO BOOK VALUES("+bk.getBookNo()+",'"+bk.getBookName()+"','"+bk.getBookWriter()+"',"+bk.getBookPrice()+",'"+
												bk.getPublisher()+"','"+bk.getGenre()+"')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요.");
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
	
	//책 삭제하기
	public int deleteBook(Book bk) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM BOOK WHERE BOOK_NO=?";
		
		if(bk==null)
			return result;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","STUDENT","STUDENTPASS");
			pstmt=conn.prepareStatement(query);
			pstmt.setInt(1, bk.getBookNo());
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요.");
			e.printStackTrace();
		}finally {
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
}
