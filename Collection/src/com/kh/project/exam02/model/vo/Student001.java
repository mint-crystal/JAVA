package com.kh.project.exam02.model.vo;

public class Student001 implements Comparable{
	//�ʵ��
	private int classNumber;	//�л� ��ȣ
	private String name;		//�л� �̸�
	private int age;			//�л� ����
	
	//�����ں�
		//�⺻������
	public Student001(){}
		//�Ű����� ������
	public Student001(int classNumber, String name, int age) {
		this.classNumber = classNumber;
		this.name = name;
		this.age = age;
	}
	
	//�޼ҵ��
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��ȣ : "+classNumber+" / �̸� : "+name+" / ���� : "+age;
		
	}
//	public String getField() {
//		return "��ȣ : "+classNumber+"/�̸� : "+name+"/���� : "+age;
//	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassnumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		//�������� ����
			/*	this Ŭ������ �����Ͱ� �Ű����� �����ͺ��� ū ��� : 1 (���)
			 * 	this Ŭ������ �����Ͱ� �Ű����� �����ͺ��� ���� ��� : -1 (����)
			 * 	���� ��� 0
			 */
//		if(this.classNumber > ((Student001)o).classNumber) {
//			return 1;
//		}else if(this.classNumber < ((Student001)o).classNumber) {
//			return -1;
//		}else 
//			return 0;
		
		//����, �Ǽ�, ���Ϲ��� ���� (�� if���� ����)
//		return this.age - ((Student001)o).age; //�� age�� �ٸ� age�� ���� ���� �� ���� �� ũ�� 1, ������ -1, ������ 0�� �����Ͽ� ����
		return this.classNumber - ((Student001)o).classNumber;
		
		//���ڿ� ����
		//return this.name.compareTo(((Student001)o).name);
		
		//�������� ����
			/*	this Ŭ������ �����Ͱ� �Ű����� �����ͺ��� ū ��� : -1 (����)
			 * 	this Ŭ������ �����Ͱ� �Ű����� �����ͺ��� ���� ��� : 1 (���)
			 * 	���� ��� 0
			 */
		//return ((Student001)o).classNumber - this.classNumber;
	}
}
