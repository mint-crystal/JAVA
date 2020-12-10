package com.kh.library.controller;

import com.kh.library.model.dao.BookDAO;
import com.kh.library.model.view.BookView;

public class BookController {
	private BookView bv;
	private BookDAO bd;
	
	public BookController() {
		bv = new BookView();
		bd = new BookDAO();
	}
	
	
	public void bookMenu() {
		int select;
		while((select=bv.bookMenu())!=5)
			switch(select) {
			case 1 : //전체 책 조회
				allBookList();
				break;
			case 2 : //책 코드로 조회
				searchBookNo();
				break;
			case 3 : //책 추가하기
				insertBook();
				break;
			case 4 : //책 삭제하기
				deleteBook();
				break;
			}
	}
	
	//전체 책 조회
	public void allBookList() {
		bv.allBookList(bd.allBookList());
	}
	
	//책 코드로 조회
	public void searchBookNo() {
		bv.searchBookNo(bd.searchBookNo(bv.inputBookNo("삭제")));
	}
	
	//책 추가하기
	public void insertBook() {
		bv.printBook(bd.insertBook(bv.insertBook()), "등록");
	}
	
	//책 삭제하기
	public void deleteBook() {
		bv.printBook(bd.deleteBook(bv.deleteBook(bd.searchBookNo(bv.inputBookNo("삭제")))),"삭제");
	}
}
