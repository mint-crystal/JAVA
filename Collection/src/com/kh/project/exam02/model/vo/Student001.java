package com.kh.project.exam02.model.vo;

public class Student001 implements Comparable{
	//필드부
	private int classNumber;	//학생 번호
	private String name;		//학생 이름
	private int age;			//학생 나이
	
	//생성자부
		//기본생성자
	public Student001(){}
		//매개변수 생성자
	public Student001(int classNumber, String name, int age) {
		this.classNumber = classNumber;
		this.name = name;
		this.age = age;
	}
	
	//메소드부
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "번호 : "+classNumber+" / 이름 : "+name+" / 나이 : "+age;
		
	}
//	public String getField() {
//		return "번호 : "+classNumber+"/이름 : "+name+"/나이 : "+age;
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
		//오름차순 정렬
			/*	this 클래스의 데이터가 매개변수 데이터보다 큰 경우 : 1 (양수)
			 * 	this 클래스의 데이터가 매개변수 데이터보다 작은 경우 : -1 (음수)
			 * 	같은 경우 0
			 */
//		if(this.classNumber > ((Student001)o).classNumber) {
//			return 1;
//		}else if(this.classNumber < ((Student001)o).classNumber) {
//			return -1;
//		}else 
//			return 0;
		
		//정수, 실수, 단일문자 기준 (위 if문을 단축)
//		return this.age - ((Student001)o).age; //내 age와 다른 age의 값을 빼서 내 값이 더 크면 1, 적으면 -1, 같으면 0을 전달하여 정렬
		return this.classNumber - ((Student001)o).classNumber;
		
		//문자열 기준
		//return this.name.compareTo(((Student001)o).name);
		
		//내림차순 정렬
			/*	this 클래스의 데이터가 매개변수 데이터보다 큰 경우 : -1 (음수)
			 * 	this 클래스의 데이터가 매개변수 데이터보다 작은 경우 : 1 (양수)
			 * 	같은 경우 0
			 */
		//return ((Student001)o).classNumber - this.classNumber;
	}
}
