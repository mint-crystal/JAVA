package com.kh.library.model.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.model.vo.Lease;

public class LeaseView {
	private Scanner sc = new Scanner(System.in);
	
	public int leaseMenu() {
		int select;
		while(true){
			System.out.println("----- 대여 관리 서브 메뉴 -----");
			System.out.println("1. 대여 관리 전체 조회");
			System.out.println("2. 회원 아이디로 대여 조회");
			System.out.println("3. 책 이름으로 대여 조회");
			System.out.println("4. 대여정보 추가");
			System.out.println("5. 메인 메뉴로 이동");
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			if(select == 5)
				break;
			else if(select>5)
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			break;
		}
		return select;
	}
	
	//대여 관리 전체 조회
	public void allLeaseList(ArrayList<Lease> list) {
		System.out.println("*** 대여 관리 전체 조회 ***");
		if(list.size()>0) {
			System.out.println("총 "+list.size()+"개의 대여정보가 조회되었습니다.");
			for(Lease ls : list) {
				System.out.println("---------------------------------------------------------");
				System.out.println("대여 번호 : "+ls.getLeaseNo());
				System.out.println("회원 아이디 : "+ls.getUserId());
				System.out.println("대여일 : "+ls.getLeaseDate());
				System.out.println("반납일 : "+ls.getReturnDate());
				System.out.println("---------------------------------------------------------");
			}
		}
	}
	
	public String inputID(String mode) {
		System.out.print(mode+"할 회원 아이디 : ");
		String id = sc.next();
		return id;
	}
	
	//회원 아이디로 대여 조회
	public void searchLeaseId(Lease ls) {
		System.out.println("*** 회원 아이디로 대여 조회 ***");
		if(ls!=null) {
			System.out.println("---------------------------------------------------------");
			System.out.println("[ "+ls.getUserId()+"님의 대여 정보 ]");
			System.out.println("대여 번호 : "+ls.getLeaseNo());
			System.out.println("대여일 : "+ls.getLeaseDate());
			System.out.println("반납일 : "+ls.getReturnDate());
			System.out.println("---------------------------------------------------------");
		} else
			System.out.println("조회되는 대여정보가 없습니다.");
	}

	//책 이름 입력
	public String inputBookName(String mode) {
		System.out.print(mode+"할 책 이름 : ");
		sc.nextLine();
		String bName = sc.nextLine();
		return bName;
	}
	
	//책 이름으로 대여 조회
	public void searchBookName(Lease ls) {
		System.out.println("*** 책 이름으로 조회 ***");
		if(ls != null) {
			System.out.println("---------------------------------------------------------");
			System.out.println("[ 도서 대여 정보 ]");
			System.out.println("회원 아이디 : "+ls.getUserId());
			System.out.println("대여 번호 : "+ls.getLeaseNo());
			System.out.println("대여일 : "+ls.getLeaseDate());
			System.out.println("반납일 : "+ls.getReturnDate());
			System.out.println("---------------------------------------------------------");
		} else
			System.out.println("조회되는 대여 정보가 없습니다.");
	}
	
	//대여 정보 추가
	public Lease insertLease() {
		System.out.println("*** 대여 정보 추가 ***");
		Lease ls = new Lease();
		System.out.print("대여번호 : ");
		ls.setBookNo(sc.nextInt());
		System.out.print("회원 아이디 : ");
		ls.setUserId(sc.next());
		return ls;
	}
	
	public void printResult(int result, String mode) {
		if(result>0) {
			System.out.println("대여 정보 "+mode+" 완료");
		}else {
			System.out.println("대여 정보 "+mode+" 실패");
		}
	}
	
	public void notFoundLease() {
		System.out.println("조회되는 대여정보가 없습니다.");
	}
}
