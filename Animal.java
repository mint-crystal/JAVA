package com.kh.project.poly;

//�θ� Ŭ����
public abstract class Animal { //�߻�Ŭ����
	//�ʵ��
	private String eye;
	private String nose;
	private String mouth;
	
	//�����ں�
	public Animal() {
		System.out.println("Animal ��ü ����");
	}
	
	//�޼����
	public void eat() {
		System.out.println("�Դ�");
	}
	
//	public void speak() {
//		System.out.println("���");
//	} �� �޼ҵ�� �ڽ�Ŭ���� �ٽ� ������ �Ǳ� ������ �ʿ���� �ڵ尡 �ǹǰ� �Ʒ��� ���� �߻�޼ҵ�� ó��
	
	/*	�߻�޼ҵ� (��ü�� ���� �̿ϼ� �޼ҵ�) - �ڽ� Ŭ�������� ������ �� ���
	*	�̿ϼ� �޼ҵ尡 �ϳ��� ���� Ŭ���� ��ü�� �̿ϼ��� �Ǿ� ��üȭ ��ų �� ����.
	*	Animal�� �̿��� ���������� ���� �� ������ new �����ڸ� ����Ͽ� ��ü�� ������ ���� ����	
	*	But, Animal[] ani = new Animal[5]; �� ���������� ����� ���̱� ������ ����
	*	�θ𿡼� abstract�޼ҵ带 ����� �ڽ� Ŭ���������� �ݵ�� ���� �߻�޼ҵ带 ��������*/
	public abstract void speak(); 
	
	public void walk() {
		System.out.println("�ȴ�");
	}
}
