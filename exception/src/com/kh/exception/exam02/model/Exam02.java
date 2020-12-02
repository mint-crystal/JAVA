package com.kh.exception.exam02.model;

import java.io.IOException;

public class Exam02 {
	public void method01() throws IOException{
		System.out.println("메소드1 예외 전");
		throw new IOException();	//예외발생
	}
	
	public void method02() throws IOException {
		System.out.println("메소드2 예외 전");
		method01();
		System.out.println("메소드2 예외 후");
	}
	
	public void method03() throws IOException {
		System.out.println("메소드3 예외 전");
		method02();
		System.out.println("메소드3 예외 후");
	}
}
