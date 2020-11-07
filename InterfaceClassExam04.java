package com.kh.project.model;

//별도의 클래스
public class InterfaceClassExam04 implements Interface02{
	public void exam04Method01() {
		System.out.println("별도의 클래스");
		//System.out.println(PI); // PI는 Interface01의 상수필드이기 때문에 사용 불가능
	}

	@Override
	public void method02() {
		// TODO Auto-generated method stub
		
	}
}
