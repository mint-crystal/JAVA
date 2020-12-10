package com.kh.library.model.view;

import java.util.Scanner;

public class LibraryView {
	private Scanner sc = new Scanner(System.in);
	
	public int mainMenu() {
		int select = 0;
		while(true) {
			System.out.println("----- 메인 메뉴 -----");
			System.out.println("1. 책 관리");
			System.out.println("2. 회원 관리");
			System.out.println("3. 대여 관리");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			if(select==9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(select>4) {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			} 
			break;
		}
		return select;
	}
}
