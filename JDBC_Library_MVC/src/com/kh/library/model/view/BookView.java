package com.kh.library.model.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.library.controller.BookController;
import com.kh.library.model.vo.Book;

public class BookView {
	private Scanner sc = new Scanner(System.in);
	
	//책 관리 메뉴
	public int bookMenu() {
		int select;
		while(true) {
			System.out.println("----- 책 관리 서브 메뉴 -----");
			System.out.println("1. 전체 책 조회");
			System.out.println("2. 책 코드로 조회");
			System.out.println("3. 책 추가하기");
			System.out.println("4. 책 삭제하기");
			System.out.println("5. 메인 메뉴로 이동");
			System.out.print("메뉴 번호 선택 : ");
			select = sc.nextInt();
			if(select == 5) 
				break;
			else if(select>5)
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			break;
		}
		return select;
	}
	
	//전체 책 조회
	public void allBookList(ArrayList<Book> list) {
		System.out.println("*** 전체 책 조회 ***");
		if(list.size()>0) {
			System.out.println("총 "+list.size()+"권의 책이 조회되었습니다.");
			System.out.println("-----------------------------------------------------");
			System.out.println("책번호	제목	글쓴이	가격	출판사	장르");
			System.out.println("-----------------------------------------------------");
			for(Book book : list) {
				System.out.println(book.getBookNo()+"	"+book.getBookName()+"	"+book.getBookWriter()+"	"+book.getBookPrice()+"	"+
									book.getPublisher()+"	"+book.getGenre());
			}
		}else {
			System.out.println("책 정보를 조회할 수 없습니다.");
		}
		System.out.println("-----------------------------------------------------");
	}

	//책 코드 입력
	public int inputBookNo(String mode) {
		System.out.print(mode + "할 책 코드 : ");
		int bNo = sc.nextInt();
		return bNo;
	}
	
	//책 코드로 조회
	public void searchBookNo(Book book) {
		System.out.println("*** 책 코드로 조회 ***");
		if(book!=null) {
			System.out.println("["+book.getBookNo()+"번 책 정보]");
			System.out.println("책 이름 : "+book.getBookName());
			System.out.println("글쓴이 : "+book.getBookWriter());
			System.out.println("가격 : "+book.getBookPrice());
			System.out.println("출판사 : "+book.getPublisher());
			System.out.println("장르 : "+book.getGenre());
		} else
			System.out.println("조회할 수 있는 도서가 없습니다.");
	}

	//결과 출력
	public void printBook(int result, String mode) {
		if(result>0)
			System.out.println("도서 "+mode+" 완료");
		else
			System.out.println("도서 "+mode+" 실패");
	}
	
	//책 추가하기
	public Book insertBook() {
		Book bk = new Book();
		System.out.println("*** 책 추가하기 ***");
		System.out.print("추가할 책 번호 : ");
		bk.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.print("책 제목 : ");
		bk.setBookName(sc.nextLine());
		System.out.print("책 글쓴이 : ");
		bk.setBookWriter(sc.nextLine());
		System.out.print("가격 : ");
		bk.setBookPrice(sc.nextInt());
		sc.nextLine();
		System.out.print("출판사 : ");
		bk.setPublisher(sc.nextLine());
		System.out.print("장르 : ");
		bk.setGenre(sc.next());
		return bk;
	}

	//책 삭제하기
	public Book deleteBook(Book bk) {
		System.out.println("*** 도서 삭제 ***");
		System.out.println("도서 번호 : "+bk.getBookNo());
		System.out.println("도서 명 : "+bk.getBookName());
		System.out.print("삭제하시겠습니까?(Y/N) : ");
		if(sc.next().charAt(0) != 'Y') 
			return null;
		return bk;
	}
}
