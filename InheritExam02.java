package com.kh.project.inherit.exam01;

public class InheritExam02 extends InheritExam01 { //�θ�Ŭ���� ���
	//�ʵ�
	private int score;
	
	//������
	public InheritExam02() {
		//�θ�Ŭ���� ������ ȣ������ ���⿡ ��. super() �Ϲ������� ���ԵǾ� ����
		System.out.println("�ڽ�Ŭ����");
	}
	public InheritExam02(String name, int age, int score) {
		super(name,age);	//�θ�Ŭ���� 2ȣ��
		System.out.println("�ڽ�Ŭ����2");
		super.setName(name);	
		/*�ڽİ� �θ� ��� setName�� ������ ������ �θ��� setName�� ���� ������ suepr. ���
			= this�� ����� ����*/
		setAge(age);
		this.score = score;
	}
	
	//�޼ҵ�
	public void study() {
		System.out.println("�����ϴ�");
		setName("��浿");	//���������� private�� ������
		setAge(30);			//���������� private�� ������
		name = "�̱浿";
		age = 27;
	}
	
	public void setName(String name) {
		System.out.println("�ڽ� setName");
	}
		//�������̵�
	public void walk() {
		System.out.println("������ �ȴ�");
	}
}
