package com.kh.project.model;

//Exam01 �ڽ�2
public class InterfaceClassExam03 extends InterfaceClassExam01 
implements Interface01, Interface02 {
	public void exam03Method01() {
		System.out.println("�ڽ�Ŭ����2");
		System.out.println(PI);	//PI�� Interface01�� ����ʵ��̱� ������ ��� ���� but �ʱⰪ ���� �Ұ���
		method0101();	//method0101�� Interface01�� ����Ʈ�޼ҵ��̱� ������ ��� ����
	}

	@Override
	public void method01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method0101() {
		// �ٸ� �������̽��� ���� �̸��� �޼ҵ带 ����� �� � �������̽��� �޼ҵ带 ������ ��Ȯ�� ����
		Interface01.super.method0101();	//Interface02�� ���氡��
	}
	public void method0201() {
		Interface02.super.method0101();	
	}
}
