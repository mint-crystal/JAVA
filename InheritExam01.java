package com.kh.project.inherit.exam01;

public class InheritExam01 { //final�� �����ϸ� Exam02�� ����� �� ���� 
	//�ʵ�
//	public String name;
//	public int age;
//	private String name;	//�ٸ� Ŭ�������� ����ϱ� ���� getter�� setter ���
//	private int age;		//�ٸ� Ŭ�������� ����ϱ� ���� getter�� setter ���
	
	//protected ���� ��Ű���� �ٸ� Ŭ������ �ٸ� ��Ű���� �ڽ�Ŭ�������� ��� ����
	protected String name;	
	protected int age;
	
	//������
	public InheritExam01() {
		System.out.println("�θ�Ŭ����");
	}
	public InheritExam01(String name, int age) {
		System.out.println("�θ�Ŭ����2");
		this.name = name;
		this.age = age;
	}

	//�޼ҵ�
	public void walk() {	//final�� ����ϸ� �ڽ�Ŭ�������� �������̵� �Ұ�
		System.out.println("�ȴ�");
	}
	public static void speak() {
		System.out.println("���ϴ�");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("�θ� setName");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
