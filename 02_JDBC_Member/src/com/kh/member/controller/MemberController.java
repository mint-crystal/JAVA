package com.kh.member.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberController {
	private Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		int select=0;
		while(true) {
			System.out.println("##### 회원 관리 프로그램 #####");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 목록 조회");
			System.out.println("5. 회원 정보 조회(ID)");
			System.out.println("6. 회원 정보 조회(이름)");
			System.out.println("7. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			select = sc.nextInt();
			switch(select) {
			case 1 : // 회원 등록 
				insertMember();
				break;
			case 2 : // 회원 정보 수정
				updateMember();
				break;
			case 3 : // 회원 삭제
				deleteMember();
				break;
			case 4 : // 회원 목록 조회
				allListMember();
				break;
			case 5 : // 회원 정보 조회(ID)
				searchMemberId();
				break;
			case 6 : // 회원 정보 조회(이름)
				searchMemberName();
				break;
			case 7 : // 프로그램 종료
				System.out.println("프로그램이 종료됩니다");
				System.exit(0);
			default : 
				System.out.println("잘못된 번호를 선택하셨습니다~!");
			}			
		}		
	}
	
	// 회원 등록 
	public void insertMember() {
		System.out.println("----- 회원 등록 -----");
		// MEMBER_ID, MEMBER_PWD, MEMBER_NAME, GENDER, 
		// AGE, EMAIL, PHONE, ADDRESS, HOBBY, ENROLL_DATE
		// 사용자에게 입력받은 데이터
		Member mb = new Member();
		sc.nextLine();
		System.out.print("아이디 : ");
		mb.setMemberId(sc.nextLine());
		System.out.print("비밀번호 : ");
		mb.setMemberPwd(sc.nextLine());
		System.out.print("이름 : ");
		mb.setMemberName(sc.nextLine());
		System.out.print("성별(M/F) : ");
		mb.setGender(sc.nextLine().charAt(0));
		System.out.print("나이 : ");
		mb.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("이메일 : ");
		mb.setEmail(sc.nextLine());
		System.out.print("휴대폰 : ");
		mb.setPhone(sc.nextLine());
		System.out.print("주소 : ");
		mb.setAddress(sc.nextLine());
		System.out.print("취미(여러 개일 경우 ,로 구분) : ");
		mb.setHobby(sc.nextLine());
		mb.setEnrollDate(new java.sql.Date(new java.util.Date().getTime()));
		
		// DB에 저장
		Connection conn = null;
		String query = null;
		Statement stmt = null;
		int result = 0;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			query = "INSERT INTO MEMBER VALUES('"+mb.getMemberId()+"','"+mb.getMemberPwd()+"','"+mb.getMemberName()
									+"','"+mb.getGender()+"',"+mb.getAge()+",'"+mb.getEmail()+"','"+mb.getPhone()+
									"','"+mb.getAddress()+"','"+mb.getHobby()+"','"+mb.getEnrollDate()+"')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
			if(result > 0) {
				System.out.println("회원 등록 완료");
			}else {
				System.out.println("회원 등록 실패");
			}				
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요~!");
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println("오류발생 : 관리자에게 문의하세요~!");
				e.printStackTrace();
			}
		}
		
	}
	
	// 회원 정보 수정
	public void updateMember() {
		System.out.println("----- 회원 정보 수정 -----");
		// 사용자에게 입력 받은 데이터
		System.out.print("수정할 회원 아이디 입력 : ");
		String id = sc.next();
		
		// DB연결을 위한 참조변수
		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			// DB에서 아이디로 회원 조회
			query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();
			
			if(!rset.next()) {
				System.out.println("회원 정보가 없습니다.");
				return;				
			}
			
			Member mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
					,rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
					,rset.getString(8),rset.getString(9),rset.getDate(10));
			int select = 0;
			while(select != 8) {
				System.out.println("[ "+mb.getMemberId()+" 회원 정보 ]");
				System.out.println("이름 : "+mb.getMemberName());
				System.out.println("등록일자 : "+mb.getEnrollDate());
				System.out.println("1.비밀번호 : ****");
				System.out.println("2.성별 : "+mb.getGender());
				System.out.println("3.나이 : "+mb.getAge());
				System.out.println("4.이메일 : "+mb.getEmail());
				System.out.println("5.휴대폰 : "+mb.getPhone());
				System.out.println("6.주소 : "+mb.getAddress());
				System.out.println("7.취미 : "+mb.getHobby());
				System.out.println("8.수정완료");
				System.out.print("수정할 항목 번호 : ");
				select = sc.nextInt(); 
				switch(select) {
				case 1 : 
					System.out.print("새로운 비밀번호 : ");
					mb.setMemberPwd(sc.next());
					break;
				case 2 : 
					System.out.print("새로운 성별 : ");
					mb.setGender(sc.next().charAt(0));
					break;
				case 3 : 
					System.out.print("새로운 나이 : ");
					mb.setAge(sc.nextInt());
					break;
				case 4 : 
					System.out.print("새로운 이메일 : ");
					mb.setEmail(sc.next());
					break;
				case 5 : 
					System.out.print("새로운 휴대폰 : ");
					mb.setPhone(sc.next());
					break;
				case 6 : 
					System.out.print("새로운 주소 : ");
					if(sc.hasNextLine()) {
						sc.nextLine();
					}
					mb.setAddress(sc.nextLine());
					break;
				case 7 : 
					System.out.print("새로운 취미 : ");
					if(sc.hasNextLine()) {
						sc.nextLine();
					}
					mb.setHobby(sc.nextLine());
					break;
				case 8 : break;
				default : 
					System.out.println("잘못된 번호를 입력하셨습니다.");
				}
			}			
				
			query = "UPDATE MEMBER SET MEMBER_PWD=?, GENDER=?, AGE=?, EMAIL=?, PHONE=?, ADDRESS=?, HOBBY=? WHERE MEMBER_ID=?";
			pstmt.close();
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
			if(result > 0) {
				System.out.println("회원 정보 수정 완료");
			}else {
				System.out.println("회원 정보 수정 실패");
			}
			
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				System.out.println("오류발생 : 관리자에게 문의하세요");
			}
		}
		
	}
	
	// 회원 삭제
	public void deleteMember() {
		System.out.println("----- 회원 삭제 -----");
		// 사용자에게 입력 받은 데이터
		System.out.print("삭제할 회원 아이디 입력 : ");
		String id = sc.next();

		// DB연결을 위한 참조변수
		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			// DB에서 아이디로 회원 조회
			query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();

			if(!rset.next()) {
				System.out.println("회원 정보가 없습니다.");
				return;				
			}
			
			System.out.println("[ "+rset.getString("MEMBER_ID")+" 회원 정보 ]");
			System.out.println("이름 : "+rset.getString("MEMBER_NAME"));
			System.out.println("등록일자 : "+rset.getDate("ENROLL_DATE"));
			System.out.print("삭제하시겠습니까?(Y/N) : ");
			if(sc.next().charAt(0) == 'Y') {
				query = "DELETE FROM MEMBER WHERE MEMBER_ID = '"+rset.getString("MEMBER_ID")+"'";
				result = pstmt.executeUpdate(query);
				if(result > 0) {
					System.out.println("회원 정보 삭제 완료");
				}else {
					System.out.println("회원 정보 삭제 실패");
				}
			}
			
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				System.out.println("오류발생 : 관리자에게 문의하세요");
			}
		}	
			
	}
	
	// 회원 목록 조회
	public void allListMember() {
		System.out.println("----- 회원 목록 조회 -----");
		ArrayList<Member> list = new ArrayList<Member>();
		
		// DB연결을 위한 참조변수
		Connection conn = null;
		String query = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			query = "SELECT * FROM MEMBER";
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			// 리스트에 조회해온 데이터 저장
			while(rset.next()) {
				Member mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
						,(rset.getString(4)==null)?'X':rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
						,rset.getString(8),rset.getString(9),rset.getDate(10));
				list.add(mb);
			}
			
			// 출력
			if(list.size() > 0) {
				System.out.println("총 "+list.size()+"명이 조회되었습니다.");
				System.out.println("---------------------------------");
				System.out.println("아이디		이름	성별	나이");
				System.out.println("---------------------------------");
				for(Member mb : list) {
					System.out.println(mb.getMemberId()+"		"+mb.getMemberName()+"	"+mb.getGender()+"	"+mb.getAge());
				}
				System.out.println("---------------------------------");
			}else {
				System.out.println("회원정보가 없습니다.");
			}
			
		} catch (SQLException e) {
			System.out.println("오류 발생 : 관리자에게 문의하세요");
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e2) {
				System.out.println("오류 발생 : 관리자에게 문의하세요");
			}
		}
		
	}
	
	// 회원 정보 조회(ID)
	public void searchMemberId() {
		System.out.println("----- 회원 정보 조회(ID) -----");
		
		// 사용자에게 입력 받은 데이터
		System.out.print("조회할 회원 아이디 입력 : ");
		String id = sc.next();

		// DB연결을 위한 참조변수
		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			// DB에서 아이디로 회원 조회
			query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rset = pstmt.executeQuery();

			if(!rset.next()) {
				System.out.println("회원 정보가 없습니다.");
				return;				
			}

			// 조회해 온 데이터 Member 객체에 저장
			Member mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
					,rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
					,rset.getString(8),rset.getString(9),rset.getDate(10));

			System.out.println("[ "+mb.getMemberId()+" 회원 정보 ]");
			System.out.println("이름 : "+mb.getMemberName());
			System.out.println("등록일자 : "+mb.getEnrollDate());
			System.out.println("성별 : "+mb.getGender());
			System.out.println("나이 : "+mb.getAge());
			System.out.println("이메일 : "+mb.getEmail());
			System.out.println("휴대폰 : "+mb.getPhone());
			System.out.println("주소 : "+mb.getAddress());
			System.out.println("취미 : "+mb.getHobby());
			
		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				System.out.println("오류발생 : 관리자에게 문의하세요");
			}
		}
	}
	
	// 회원 정보 조회(이름)
	public void searchMemberName() {
		System.out.println("----- 회원 정보 조회(이름) -----");
		// 사용자에게 입력 받은 데이터
		System.out.print("조회할 회원 이름 입력 : ");
		String name = sc.next();

		// DB연결을 위한 참조변수
		Connection conn = null;
		String query = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		// 조회해 온 데이터를 저장해 줄 리스트 객체 생성
		ArrayList<Member> list = new ArrayList<Member>();
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","STUDENT","STUDENTPASS");
			// DB에서 아이디로 회원 조회
			query = "SELECT * FROM MEMBER WHERE MEMBER_NAME = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rset = pstmt.executeQuery();

			// 조회해 온 데이터 Member 객체에 저장
			while(rset.next()) {
				Member mb = new Member(rset.getString(1),rset.getString(2),rset.getString(3)
						,(rset.getString(4)==null)?'X':rset.getString(4).charAt(0),rset.getInt(5),rset.getString(6),rset.getString(7)
						,rset.getString(8),rset.getString(9),rset.getDate(10));
				list.add(mb);
			}
			if(list.size() > 0) {
				System.out.println("총 "+list.size()+"명의 회원이 조회되었습니다.");
				for(Member mb : list) {
					System.out.println("[ "+mb.getMemberId()+" 회원 정보 ]");
					System.out.println("이름 : "+mb.getMemberName());
					System.out.println("등록일자 : "+mb.getEnrollDate());
					System.out.println("성별 : "+mb.getGender());
					System.out.println("나이 : "+mb.getAge());
					System.out.println("이메일 : "+mb.getEmail());
					System.out.println("휴대폰 : "+mb.getPhone());
					System.out.println("주소 : "+mb.getAddress());
					System.out.println("취미 : "+mb.getHobby());
				}
			}else {
				System.out.println("회원정보가 없습니다.");
			}

		} catch (SQLException e) {
			System.out.println("오류발생 : 관리자에게 문의하세요");
		} finally {
			try {
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				System.out.println("오류발생 : 관리자에게 문의하세요");
			}
		}
	}
}
