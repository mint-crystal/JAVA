package com.kh.member.common;
/*	Common 패키지
 * 	- 공통적으로 사용되는 코드를 모아놓은 패키지
 *  - 공통적인 코드들을 Template Class로 만들어서 중복을 제거
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*	JDBCTemplate Class
 * 	- JDBC를 사용하면서 공통적으로 사용되는 코드들을 모아서 만들어 놓은 Class
 * 	- 드라이버 등록
 * 	- DBMS 연결(Connection)
 * 	- DBMS 연결 닫기(Connection close)
 * 	- 트랜잭션 제어 코드(Commit, Rollback)
 * 	- Statement, PreparedStatement, ResultSet 닫기(close)
 */

//방법 3 : 객체를 생성하지 않고 각 메소드를 호출해서 사용(정적메소드로 구현 - static)
public class JDBCTemplate3 {
	//DBMS 연결
	public static Connection getConnection() {	
		Connection conn = null;
		try {
			//드라이버 등록 - 생략 가능(JDBC 하위버전 호환성을 위해 포함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//DBMS 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			//Template 이용해서 DB연결 시 AutoCommit 안 하도록 설정
			conn.setAutoCommit(false);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("예기치 못한 오류 발생 : 데이터베이스 연결 정보를 확인하세요.");
			e.printStackTrace();
		}
		return conn;
	}
	
	//DBMS 연결 닫기
	public static void close(Connection conn) {
		try {
			//연결 정보가 있고 닫혀있지 않은 경우에만 닫아주기
			if(conn!=null && !conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//트랜잭션 제어(commit)
	public static void commit(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed())
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//트랜잭션 제어(rollback)
	public static void rollback(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed())
			conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Statement, PreparedStatment 닫기
	public static void close(Statement stmt) {
		try {
			if(stmt!=null && !stmt.isClosed())
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//ResultSet 닫기
	public static void close(ResultSet rset) {
		try {
			if(rset!=null && !rset.isClosed())
			rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
