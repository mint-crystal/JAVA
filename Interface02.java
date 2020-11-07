package com.kh.project.model;

public interface Interface02 {
	void method02();
	default void method0101() { 
		System.out.println("인터페이스02의 디폴트메소드");
	}
}
