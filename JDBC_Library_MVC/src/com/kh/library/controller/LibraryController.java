package com.kh.library.controller;

import com.kh.library.model.view.BookView;
import com.kh.library.model.view.CustomerView;
import com.kh.library.model.view.LeaseView;
import com.kh.library.model.view.LibraryView;

public class LibraryController {
	private LibraryView lv;
	private BookController bc;
	private CustomerController cc;
	private LeaseController lc;
	
	public LibraryController() {
		lv = new LibraryView();
		bc = new BookController();
		cc = new CustomerController();
		lc = new LeaseController();
	}
	
	public void start() {
		int select;
		while((select = lv.mainMenu()) != 9) {
			switch(select) {
			case 1 : //책 관리
				bc.bookMenu();
				break;
			case 2 : //회원 관리
				cc.customerMenu();
				break;
			case 3 : //대여 관리
				lc.leaseMenu();
				break;
			}
		}
	}

}
