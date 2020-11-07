package com.kh.project.poly;

public class Dog extends Animal {
	//필드부
	
	//생성자부
	public Dog() {
		System.out.println("Dog 객체 생성");
	}
		
	//메서드부
	public void await() {
		System.out.println("기다리다");
	}
	public void protect() {
		System.out.println("지키다");
	}
	public void speak() {
		System.out.println("멍멍!");
	}
}
