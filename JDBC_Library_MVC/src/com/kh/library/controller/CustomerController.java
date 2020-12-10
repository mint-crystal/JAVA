package com.kh.library.controller;

import com.kh.library.model.dao.CustomDAO;
import com.kh.library.model.view.CustomerView;
import com.kh.library.model.vo.Customer;

public class CustomerController {
	private CustomerView cv;
	private CustomDAO cd;
	
	public CustomerController() {
		cv = new CustomerView();
		cd = new CustomDAO();
	}
	
	
	public void customerMenu() {
		int select;
		while((select=cv.customerMenu())!=7)
		switch(select) {
		case 1 : //회원 전체 조회
			allCustomerList();
			break;
		case 2 : //회원 이름으로 조회
			searchCustomerName();
			break;
		case 3 : //회원 아이디로 조회
			searchCustomerId();
			break;
		case 4 : //회원 가입
			insertCustomer();
			break;
		case 5 : //회원 정보 수정
			updateCustomer();
			break;
		case 6 : //회원 탈퇴
			deleteCustomer();
			break;
		}
	}
	
	//회원 전체 조회
	public void allCustomerList() {
		cv.allCustomerList(cd.allCustomerList());
	}
	
	//회원 이름으로 조회
	public void searchCustomerName() {
		cv.searchCustomerName(cd.searchCustomerName(cv.inputName("조회")));
	}
	
	//회원 아이디로 조회
	public void searchCustomerId() {
		cv.searchCustomerId(cd.searchCustomerId(cv.inputId("조회")));
	}
	
	//회원가입 - 회원번호 시퀀스 활용
	public void insertCustomer() {
		cv.printResult(cd.insertCustomer(cv.insertCustomer()), "가입");
	}

	//회원 정보 수정
	public void updateCustomer() {
		Customer ct = cd.searchCustomerId(cv.inputId("수정"));
		if(ct == null)
			cv.notFoundCustomer();
		else
			cv.printResult(cd.updateCustomer(cv.updateCustomer(ct)), "정보 수정");
	}
	
	//회원 탈퇴
	public void deleteCustomer() {
		Customer ct = cd.searchCustomerId(cv.inputId("탈퇴"));
		if(ct == null)
			cv.notFoundCustomer();
		else
			cv.printResult(cd.deleteCustomer(cv.deleteCustomer(ct)), "탈퇴");
	}
}
