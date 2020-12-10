package com.kh.library.model.vo;

import java.sql.Date;

public class Lease {
	private int leaseNo;
	private int bookNo;
	private String userId;
	private Date leaseDate;
	private Date returnDate;
	
	public Lease() {}
	public Lease(int leaseNo, int bookNo, String userId, Date leaseDate, Date returnDate) {
		this.leaseNo = leaseNo;
		this.bookNo = bookNo;
		this.userId = userId;
		this.leaseDate = leaseDate;
		this.returnDate = returnDate;
	}

	public int getLeaseNo() {
		return leaseNo;
	}

	public void setLeaseNo(int leaseNo) {
		this.leaseNo = leaseNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getLeaseDate() {
		return leaseDate;
	}

	public void setLeaseDate(Date leaseDate) {
		this.leaseDate = leaseDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public String toString() {
		return leaseNo+ " / " +bookNo+ " / " +userId+ " / " +leaseDate+ " / " +returnDate;
	}
}
