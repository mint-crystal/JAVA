package com.kh.library.controller;

import com.kh.library.model.dao.LeaseDAO;
import com.kh.library.model.view.LeaseView;
import com.kh.library.model.vo.Lease;

public class LeaseController {
	private LeaseView lv;
	private LeaseDAO ld;
	
	public LeaseController() {
		lv = new LeaseView();
		ld = new LeaseDAO();
	}
	
	
	public void leaseMenu() {
		int select;
		while((select=lv.leaseMenu())!=5) {
			switch(select) {
			case 1 : //대여 관리 전체 조회
				allLeaseList();
				break;
			case 2 : //회원 아이디로 대여 조회
				searchLeaseId();
				break;
			case 3 : //책 이름으로 대여 조회
				searchBookName();
				break;
			case 4 : //대여정보 추가
				insertLease();
				break;
			}
		}
	}
	
	//대여 관리 전체 조회
	public void allLeaseList() {
		lv.allLeaseList(ld.allLeaseList());
		if(ld.allLeaseList()==null)
			lv.notFoundLease();
	}
	
	//회원 아이디로 대여 조회
	public void searchLeaseId() {
		lv.searchLeaseId(ld.searchLeaseId(lv.inputID("조회")));
	}
	
	//책 이름으로 대여 조회
	public void searchBookName() {
		lv.searchBookName(ld.searchBookName(lv.inputBookName("조회")));
	}
	
	//대여 정보 추가
	public void insertLease() {
		lv.printResult(ld.insertLease(lv.insertLease(), lv.inputBookName("추가")), "추가");
	}
	
}
