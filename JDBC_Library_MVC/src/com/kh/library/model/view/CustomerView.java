package com.kh.library.model.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.model.vo.Customer;

public class CustomerView {
	private Scanner sc = new Scanner(System.in);
	
	public int customerMenu() {
		LibraryView lv = new LibraryView();
		int select;
		while(true)	{
			System.out.println("----- 회원 관리 서브 메뉴 -----");
			System.out.println("1. 회원 전체 조회");
			System.out.println("2. 회원 이름으로 조회");
			System.out.println("3. 회원 아이디로 조회");
			System.out.println("4. 회원 가입");
			System.out.println("5. 회원 정보 수정");
			System.out.println("6. 회원 탈퇴");
			System.out.println("7. 메인 메뉴로 이동");
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			if(select == 7) {
				break;
			}else if (select>7)
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			break;
		}
		return select;
	}

	//회원 전체 조회
	public void allCustomerList(ArrayList<Customer> list) {
		System.out.println("*** 회원 전체 조회 ***");
		if(list.size()>0) {
			System.out.println("총 "+list.size()+"명의 회원이 조회되었습니다.");
			for(Customer ct : list) {
				System.out.println("----------------------------------------------------------------------");
				System.out.println("회원 번호 : "+ct.getUserNo());
				System.out.println("아이디 : "+ct.getUserId());
				System.out.println("이름 : "+ct.getUserName());
				System.out.println("나이 : "+ct.getUserAge());
				System.out.println("주소 : "+ct.getAddr());
				System.out.println("성별 : "+ct.getGender());
				System.out.println("가입일 : "+ct.getEnrollDate());
				System.out.println("----------------------------------------------------------------------");
			}
		} else
			System.out.println("조회되는 회원이 없습니다.");
	}

	//회원 이름으로 조회
	public void searchCustomerName(ArrayList<Customer> list) {
		System.out.println("*** 회원 이름으로 조회 ***");
		if(list.size()>0) {
			System.out.println("총 "+list.size()+"명의 회원이 조회되었습니다.");
			for(Customer ct : list) {
				System.out.println("----------------------------------------------------------------------");
				System.out.println("회원 번호 : "+ct.getUserNo());
				System.out.println("아이디 : "+ct.getUserId());
				System.out.println("이름 : "+ct.getUserName());
				System.out.println("나이 : "+ct.getUserAge());
				System.out.println("주소 : "+ct.getAddr());
				System.out.println("성별 : "+ct.getGender());
				System.out.println("가입일 : "+ct.getEnrollDate());
				System.out.println("----------------------------------------------------------------------");
			}
		}else
		System.out.println("조회되는 회원이 없습니다.");
	}
	
	//회원 이름 입력
	public String inputName(String mode) {
		System.out.print(mode+"할 회원 이름 : ");
		String name = sc.next();
		return name;
	}
	
	//회원 아이디로 조회
	public void searchCustomerId(Customer ct) {
		System.out.println("*** 회원 아이디로 조회 ***");
		if(ct != null) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("회원 번호 : "+ct.getUserNo());
			System.out.println("아이디 : "+ct.getUserId());
			System.out.println("이름 : "+ct.getUserName());
			System.out.println("나이 : "+ct.getUserAge());
			System.out.println("주소 : "+ct.getAddr());
			System.out.println("성별 : "+ct.getGender());
			System.out.println("가입일 : "+ct.getEnrollDate());
			System.out.println("----------------------------------------------------------------------");
		}else
			System.out.println("존재하지 않는 회원입니다.");
	}
	
	//회원 아이디 입력
	public String inputId(String mode) {
		System.out.print(mode + "할 회원 아이디 : ");
		String id = sc.next();
		return id;
	}

	//회원가입 - 회원번호 시퀀스 활용
	public Customer insertCustomer() {
		System.out.println("*** 회원 가입 ***");
		Customer ct = new Customer();
		System.out.print("회원번호 : ");
		ct.setUserNo(sc.nextInt());
		System.out.print("아이디 : ");
		ct.setUserId(sc.next());
		System.out.print("이름 : ");
		ct.setUserName(sc.next());
		System.out.print("나이 : ");
		ct.setUserAge(sc.nextInt());
		sc.nextLine();
		System.out.print("주소 : ");
		ct.setAddr(sc.nextLine());
		System.out.print("성별(M/F) : ");
		ct.setGender(sc.next().charAt(0));
		ct.setEnrollDate(new java.sql.Date(new java.util.Date().getTime()));
		return ct;
	}

	//회원 정보 수정
	public Customer updateCustomer(Customer ct) {
		System.out.println("*** 회원 정보 수정 ***");
		int select=0;
		while(select!=9) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("회원 번호 : "+ct.getUserNo());
			System.out.println("아이디 : "+ct.getUserId());
			System.out.println("이름 : "+ct.getUserName());
			System.out.println("1. 나이 : "+ct.getUserAge());
			System.out.println("2. 주소 : "+ct.getAddr());
			System.out.println("3. 성별 : "+ct.getGender());
			System.out.println("가입일 : "+ct.getEnrollDate());
			System.out.println("----------------------------------------------------------------------");
			System.out.println("9. 수정 완료");
			System.out.print("수정할 항목 번호 : ");
			select = sc.nextInt();
			switch(select) {
			case 1 : 
				System.out.print("새로운 나이 : ");
				ct.setUserAge(sc.nextInt());
				break;
			case 2 : 
				System.out.print("새로운 주소 : ");
				if(sc.hasNextLine()) 
					sc.nextLine();
				ct.setAddr(sc.nextLine());
				break;
			case 3 : 
				System.out.print("새로운 성별 : ");
				ct.setGender(sc.next().charAt(0));
				break;
			case 9 : break;
			default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
		return ct; 
	}
	
	//회원 탈퇴
	public Customer deleteCustomer(Customer ct) {
		System.out.println("*** 회원 탈퇴 ***");
		System.out.print("탈퇴하시겠습니까?(Y/N) : ");
		char str = sc.next().charAt(0);
		if(str == 'Y')
			return ct;
		else
			return null;
	}
	
	//결과 출력
	public void printResult(int result, String mode) {
		if(result>0)
			System.out.println("회원 "+mode+" 완료");
		else
			System.out.println("회원 "+mode+" 실패");
	}

	public void notFoundCustomer() {
		System.out.println("회원 정보가 없습니다.");
	}
}
