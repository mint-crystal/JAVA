package com.kh.project.model;

//Exam01 자식2
public class InterfaceClassExam03 extends InterfaceClassExam01 
implements Interface01, Interface02 {
	public void exam03Method01() {
		System.out.println("자식클래스2");
		System.out.println(PI);	//PI는 Interface01의 상수필드이기 때문에 사용 가능 but 초기값 선언 불가능
		method0101();	//method0101은 Interface01의 디폴트메소드이기 때문에 사용 가능
	}

	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method0101() {
		// 다른 인터페이스의 같은 이름의 메소드를 사용할 때 어떤 인터페이스의 메소드를 쓰는지 정확히 지정
		Interface01.super.method0101();	//Interface02로 변경가능
	}
	public void method0201() {
		Interface02.super.method0101();	
	}
}
