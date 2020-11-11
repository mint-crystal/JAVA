package com.kh.project.exam02.model.vo;

//public class Animal {
//	private int hp;
//	public void move() {
//		System.out.println("이동");
//	}
//}

public class Animal<T> {
	private T hp;
	public Animal() {}
	public Animal(T hp) {
		this.hp = hp;
	}
	public void move() {
		System.out.println("이동함");
	}
}
