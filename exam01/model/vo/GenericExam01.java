package com.kh.project.exam01.model.vo;

// //���׸� ���� �� Ŭ����
//	public class GenericExam01 {
//	//�ʵ��
//	public int var1;
//	public int var2;
//	
//	//�����ں�
//	public GenericExam01() {
//		
//	}
//	public GenericExam01(int var1, int var2) {
//		this.var1 = var1;
//		this.var2 = var2;
//	}

// 	//���׸� ����
//	public class GenericExam01<T> {
//		//�ʵ��
//		public T var1;
//		public T var2;
//	
//		//�����ں�
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

//���׸� ��Ƽ Ÿ�� �Ķ����
public class GenericExam01<T,M> {
	//�ʵ��
	public T var1;
	public M var2;
	
	//�����ں�
	public GenericExam01() {
		
	}
	public GenericExam01(T var1, M var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	//�޼ҵ��
	public <A> A method01(A num) {
		return num;
	}
}
