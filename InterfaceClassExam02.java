package com.kh.project.model;

//Exam01 자식1
public class InterfaceClassExam02 extends InterfaceClassExam01 implements Interface01 {
	public void exam02Method01() {
		System.out.println("자식클래스 1");
	}

	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}
	
	public void method0101() {	//인터페이스01의 디폴트메소드 오버라이딩
		System.out.println("method0101 실행");
	}
	
}
