package com.kh.project.inherit.exam01;

public class InheritRun {

	public static void main(String[] args) {
		InheritExam01.speak(); // speak�� static�޼ҵ��̱� ������ ��ü�� �������� �ʾƵ� ��� ����
		
		System.out.println("## Exam01 ��ü ���� ##");
		InheritExam01 ie01 = new InheritExam01();
//		ie01.name = "ȫ�浿";
//		ie01.age = 20;
//		System.out.println(ie01.name);
//		System.out.println(ie01.age);
		ie01.speak();
		ie01.walk();

		System.out.println("## Exam02 ��ü ���� ##");
		InheritExam02 ie02 = new InheritExam02();
		InheritExam02 ie002 = new InheritExam02("ȫ�浿", 20, 100);
//		ie02.score = 100;	//private ���� �����ڷ� �����Ͽ� ��� �Ұ�
		ie02.name = "�̱浿";	//�θ�Ŭ���� �ʵ�
		ie02.age = 25;		//�θ�Ŭ���� �ʵ�
//		System.out.println(ie02.score);
		System.out.println(ie02.name);
		System.out.println(ie02.age);
		ie02.study();
		ie02.speak();	//�θ�Ŭ���� �޼ҵ�
		ie02.walk();	//�θ�Ŭ���� �޼ҵ� - �������̵�(�ڽ�Ŭ�������� ������)
		
	}

}
