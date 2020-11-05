package com.kh.project.inherit.exam01;

public class InheritExam01 { //final을 선언하면 Exam02가 상속할 수 없음 
	//필드
//	public String name;
//	public int age;
//	private String name;	//다른 클래스에서 사용하기 위해 getter와 setter 사용
//	private int age;		//다른 클래스에서 사용하기 위해 getter와 setter 사용
	
	//protected 같은 패키지내 다른 클래스와 다른 패키지내 자식클래스에서 사용 가능
	protected String name;	
	protected int age;
	
	//생성자
	public InheritExam01() {
		System.out.println("부모클래스");
	}
	public InheritExam01(String name, int age) {
		System.out.println("부모클래스2");
		this.name = name;
		this.age = age;
	}

	//메소드
	public void walk() {	//final을 사용하면 자식클래스에서 오버라이딩 불가
		System.out.println("걷다");
	}
	public static void speak() {
		System.out.println("말하다");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("부모 setName");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
