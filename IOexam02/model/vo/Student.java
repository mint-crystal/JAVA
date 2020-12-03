package com.kh.exam02.model.vo;

import java.io.Serializable;

//����ȭ�� ���ؼ��� Serializable �������̽��� �����������(���ϸ� ����ȭ �� �����߻�)
public class Student implements Serializable{
	//�ʵ�� - [����������] [Ű����] <������Ÿ��> <�ʵ��> [ = <�ʱⰪ>];
	//����ȭ �ÿ� ���Ǵ� ��ü�� ������ȣ(seialVersionUid)
		//����ȭ �������̽� ���� �� �ʵ� �������� ������ ��� �߻���
		//���� �� �ص� JVM�� ���� ��ȣ�� �ٿ��� ���������� ���� �����ϴ� ���� ������
	private static final long serialVersionUID = 4489726448094257809L;
	
	private String name;
	private int age;
	private String tel;
	//����ȭ���� �����ϰ� ���� �ʵ�� transient Ű���� ���
	private transient String addr;
	
	//�����ں� - [����������] [Ű����] <Ŭ���� ��> ([�Ű�����, ...]) {[���೻��; ...]}
	//�⺻ ����Ʈ ������
	public Student() {}
	//�Ű����� ������
	public Student(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	
	//�޼ҵ��
	//Getter/Setter�޼ҵ�
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return this.tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return this.addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//ObjectŬ������ �ִ� toString �޼ҵ� �������̵�
		//�ʵ��� ������ �� ���� ����ؼ� Ȯ���ϱ� ���� �뵵
	public String toString() {
		//return "�̸� : "+name+", ���� : "+age+", ��ȭ��ȣ : "+tel+", �ּ� : "+addr;
		return "[name=>"+name+",age=>"+age+",tel=>"+tel+",addr=>"+addr+"]";
	}
}
