package com.kh.project.exam01.model.vo;

// //제네릭 적용 전 클래스
//	public class GenericExam01 {
//	//필드부
//	public int var1;
//	public int var2;
//	
//	//생성자부
//	public GenericExam01() {
//		
//	}
//	public GenericExam01(int var1, int var2) {
//		this.var1 = var1;
//		this.var2 = var2;
//	}

// 	//제네릭 적용
//	public class GenericExam01<T> {
//		//필드부
//		public T var1;
//		public T var2;
//	
//		//생성자부
//		public GenericExam01() {
//			
//		}
//		public GenericExam01(T var1, T var2) {
//			this.var1 = var1;
//			this.var2 = var2;
//		}
//	
//	
//}

//제네릭 멀티 타입 파라미터
public class GenericExam01<T,M> {
	//필드부
	public T var1;
	public M var2;
	
	//생성자부
	public GenericExam01() {
		
	}
	public GenericExam01(T var1, M var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	//메소드부
	public <A> A method01(A num) {
		return num;
	}
}
