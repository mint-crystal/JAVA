package com.kh.project.poly;

public class Rabbit extends Animal {
	//필드부
	private String ear;
	
	//생성자부
	public Rabbit() {
		System.out.println("Rabbit 객체 생성");
	}
		
	//메서드부
	public void jump() {
		System.out.println("점프하다");
	}
	public void speak() {
		System.out.println("콧소리");
	}
}
