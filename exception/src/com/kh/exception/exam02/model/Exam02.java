package com.kh.exception.exam02.model;

import java.io.IOException;

public class Exam02 {
	public void method01() throws IOException{
		System.out.println("�޼ҵ�1 ���� ��");
		throw new IOException();	//���ܹ߻�
	}
	
	public void method02() throws IOException {
		System.out.println("�޼ҵ�2 ���� ��");
		method01();
		System.out.println("�޼ҵ�2 ���� ��");
	}
	
	public void method03() throws IOException {
		System.out.println("�޼ҵ�3 ���� ��");
		method02();
		System.out.println("�޼ҵ�3 ���� ��");
	}
}
