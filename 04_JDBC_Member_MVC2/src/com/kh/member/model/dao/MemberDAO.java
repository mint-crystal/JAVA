package com.kh.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kh.member.common.JDBCTemplate1;
import com.kh.member.common.JDBCTemplate2;
import com.kh.member.common.JDBCTemplate3;
import com.kh.member.common.JDBCTemplate4;
import com.kh.member.model.vo.Member;

public class MemberDAO {
	//회원 등록
	public int insertMember(Connection conn, Member mb) {
						//DBMS 연결을 공통모듈로 사용해서 매개변수로 받아줌(서비스 모듈로 연결 제어)
		//코드 내 Connection 생성부분과 연결 닫는 부분을 모두 지워줌
		// DB에 저장
		String query = null;
		Statement stmt = null;
		int result = 0;
		
		try {
			query = "INSERT INTO MEMBER VALUES('"+mb.getMemberId()+"','"+mb.getMemberPwd()+"','"+mb.getMemberName()
			+"','"+mb.getGender()+"',"+mb.getAge()+",'"+mb.getEmail()+"','"+mb.getPhone()+
			"','"+mb.getAddress()+"','"+mb.getHobby()+"','"+mb.getEnrollDate()+"')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);				
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요~!");
			e.printStackTrace();
		}finally {
			//JDBCTemplate3에 있는 close()사용
			//JDBCTemplate3.close(stmt);
			
			//싱글톤 내 close() 사용
			JDBCTemplate4.close(stmt);	//static으로 접근할 때
//			//객체로 접근할 때
//			JDBCTemplate4 jt4 = JDBCTemplate4.getInstance();
//			jt4.close(stmt);
//			//위 두 코드를 줄여서 사용
//			JDBCTemplate4.getInstance().close(stmt);
		}
		return result;
	}

	//회원 정보 수정
	public int updateMember(Connection conn, Member mb) {
		String query = null;
		PreparedStatement pstmt = null;
		int result = 0;
		//조회된 데이터가 없는 경우
		if(mb == null) 
			return result;
		
		try {
			query = "UPDATE MEMBER SET MEMBER_PWD=?, GENDER=?, AGE=?, EMAIL=?, PHONE=?, ADDRESS=?, HOBBY=? WHERE MEMBER_ID=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mb.getMemberPwd());
			pstmt.setString(2, String.valueOf(mb.getGender()));	// gender는 단일문자여서 문자열 형태로 변환
			pstmt.setInt(3, mb.getAge());
			pstmt.setString(4, mb.getEmail());
			pstmt.setString(5, mb.getPhone());
			pstmt.setString(6, mb.getAddress());
			pstmt.setString(7, mb.getHobby());
			pstmt.setString(8, mb.getMemberId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			JDBCTemplate3.close(pstmt);
		}
		return result;
	}
	
	//회원 정보 삭제
	public int deleteMember(Connection conn, Member mb) {
		String query = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		if(mb==null) 
			return result;
		
		try {
			query = "DELETE FROM MEMBER WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mb.getMemberId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			JDBCTemplate3.close(pstmt);
		}
		return result;
	}

	//회원 전체 목록 조회
	public ArrayList<Member> allListMember(Connection conn, Member mb) {
		ArrayList<Member> list = new ArrayList<Member>();

		// DB연결을 위한 참조변수
		String query = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			query = "SELECT * FROM MEMBER";
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			// 리스트에 조회해온 데이터 저장
			while(rset.next()) {
				mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
						,(rset.getString(4)==null)?'X':rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
								,rset.getString(8),rset.getString(9),rset.getDate(10));
				list.add(mb);
			}
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요");
		} finally {
			JDBCTemplate3.close(rset);
			JDBCTemplate3.close(stmt);
		}
		return list;
	}
	
	//회원 정보 조회(ID)
	public Member searchMemberId(Connection conn, String id) {
		// DB연결을 위한 참조변수
		String query = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		//조회해온 데이터를 저장할 Member 참조변수 생성
			//조회해온 데이터기 있을 때에는 Member 객체를 만들어서 저장하고 없을 때는 null
		Member mb = null;
		try {
			// DB에서 아이디로 회원 조회
			query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();

			if(rset.next()) {
				// 조회해 온 데이터 Member 객체에 저장
				mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
						,rset.getString(4)==null?'X':rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
						,rset.getString(8),rset.getString(9),rset.getDate(10));			
			}
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			JDBCTemplate3.close(rset);
			JDBCTemplate3.close(pstmt);
		}
		return mb;
	}

	//회원 정보 조회(이름)
	public ArrayList<Member> searchMemberName(Connection conn, String name) {
		// DB연결을 위한 참조변수
		String query = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member mb = null;
		// 조회해 온 데이터를 저장해 줄 리스트 객체 생성
		ArrayList<Member> list = new ArrayList<Member>();

		try {
			// DB에서 아이디로 회원 조회
			query = "SELECT * FROM MEMBER WHERE MEMBER_NAME = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rset = pstmt.executeQuery();

			// 조회해 온 데이터 Member 객체에 저장
			while(rset.next()) {
				mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
						,(rset.getString(4)==null)?'X':rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
								,rset.getString(8),rset.getString(9),rset.getDate(10));
				list.add(mb);
			}
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			JDBCTemplate3.close(rset);
			JDBCTemplate3.close(pstmt);
		}
		return list;
	}
}
