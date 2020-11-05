package com.kh.project.inherit.exam01;

public class InheritExam02 extends InheritExam01 { //부모클래스 상속
	//필드
	private int score;
	
	//생성자
	public InheritExam02() {
		//부모클래스 생성자 호출기능이 여기에 들어감. super() 암묵적으로 포함되어 있음
		System.out.println("자식클래스");
	}
	public InheritExam02(String name, int age, int score) {
		super(name,age);	//부모클래스 2호출
		System.out.println("자식클래스2");
		super.setName(name);	
		/*자식과 부모 모두 setName을 가지고 있을때 부모의 setName을 쓰고 싶으면 suepr. 사용
			= this와 비슷한 개념*/
		setAge(age);
		this.score = score;
	}
	
	//메소드
	public void study() {
		System.out.println("공부하다");
		setName("김길동");	//접근제한자 private로 했을때
		setAge(30);			//접근제한자 private로 했을때
		name = "이길동";
		age = 27;
	}
	
	public void setName(String name) {
		System.out.println("자식 setName");
	}
		//오버라이딩
	public void walk() {
		System.out.println("빠르게 걷다");
	}
}
