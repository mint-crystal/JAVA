package com.kh.project.poly;

//부모 클래스
public abstract class Animal { //추상클래스
	//필드부
	private String eye;
	private String nose;
	private String mouth;
	
	//생성자부
	public Animal() {
		System.out.println("Animal 객체 생성");
	}
	
	//메서드부
	public void eat() {
		System.out.println("먹다");
	}
	
//	public void speak() {
//		System.out.println("울다");
//	} 이 메소드는 자식클래서 다시 재정의 되기 때문에 필요없는 코드가 되므고 아래와 같이 추상메소드로 처리
	
	/*	추상메소드 (몸체가 없는 미완성 메소드) - 자식 클래스에서 재정의 후 사용
	*	미완성 메소드가 하나라도 들어가면 클래스 자체가 미완성이 되어 객체화 시킬 수 없음.
	*	Animal을 이용해 참조변수는 만들 수 있지만 new 연산자를 사용하여 객체를 생성할 수는 없음	
	*	But, Animal[] ani = new Animal[5]; 은 참조변수를 만드는 것이기 때문에 가능
	*	부모에서 abstract메소드를 만들면 자식 클래스에서도 반드시 같은 추상메소드를 만들어야함*/
	public abstract void speak(); 
	
	public void walk() {
		System.out.println("걷다");
	}
}
