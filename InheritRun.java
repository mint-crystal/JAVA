package com.kh.project.inherit.exam01;

public class InheritRun {

	public static void main(String[] args) {
		InheritExam01.speak(); // speak는 static메소드이기 때문에 객체를 생성하지 않아도 사용 가능
		
		System.out.println("## Exam01 객체 생성 ##");
		InheritExam01 ie01 = new InheritExam01();
//		ie01.name = "홍길동";
//		ie01.age = 20;
//		System.out.println(ie01.name);
//		System.out.println(ie01.age);
		ie01.speak();
		ie01.walk();

		System.out.println("## Exam02 객체 생성 ##");
		InheritExam02 ie02 = new InheritExam02();
		InheritExam02 ie002 = new InheritExam02("홍길동", 20, 100);
//		ie02.score = 100;	//private 접근 제한자로 변경하여 사용 불가
		ie02.name = "이길동";	//부모클래스 필드
		ie02.age = 25;		//부모클래스 필드
//		System.out.println(ie02.score);
		System.out.println(ie02.name);
		System.out.println(ie02.age);
		ie02.study();
		ie02.speak();	//부모클래스 메소드
		ie02.walk();	//부모클래스 메소드 - 오버라이딩(자식클래스에서 재정의)
		
	}

}
