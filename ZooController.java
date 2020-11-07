package com.kh.project.poly;

public class ZooController {
	//필드부
	private Animal ani;
//	private Cat c;
//	private Dog d;
//	private Rabbit r;
	
	//생성자부
	
	//메서드부
//	public void catBehavior() { //괄호 안에 (Animal a)를 넣으면 아래 코드를 지우고 ani = a; 라고 객체 생성 후 사용 가능
//		c = new Cat();		//ani = new Cat(); //고양이의 객체 주소를 ani에 담아 사용.
//		c.walk();			//ani.walk();
//		c.eat();			//ani.eat();
//		c.speak();			//ani.speak();
//	}
//	public void dogBehavior() {
//		d = new Dog();		//ani = new Dog();	
//		d.walk();			//ani.walk();
//		d.eat();			//ani.eat();
//		d.speak();			//ani.speak();
//	}
//	public void rabbitBehavior() {
//		r = new Rabbit();	//ani = new Rabbit();
//		r.walk();			//ani.walk();
//		r.eat();			//ani.eat();
//		r.speak();			//ani.speak();
//	}
	
	//위 기능들을 묶어 중복된 코드를 줄여주는 메서드
	public void behavoir(Animal ani) {
		/*	메소드의 매개변수 부분에서 객체의 주소를 받아서 사용하는 경우
			여러 자식 클래스의 주소를 담아야할 경우에는 부모클래스의 참조 변수를 만들어 담아줄 수 있다. */
		this.ani = ani;
		ani.walk();
		ani.eat();
		ani.speak();
	}
}
