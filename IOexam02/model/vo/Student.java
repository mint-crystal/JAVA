package com.kh.exam02.model.vo;

import java.io.Serializable;

//직렬화를 위해서는 Serializable 인터페이스를 구현해줘야함(안하면 직렬화 시 오류발생)
public class Student implements Serializable{
	//필드부 - [접근제한자] [키워드] <데이터타입> <필드명> [ = <초기값>];
	//직렬화 시에 사용되는 객체의 고유번호(seialVersionUid)
		//직렬화 인터페이스 구현 시 필디를 정의하지 않으면 경고 발생함
		//선언 안 해도 JVM이 임의 번호를 붙여서 생성하지만 직접 선언하는 것을 권장함
	private static final long serialVersionUID = 4489726448094257809L;
	
	private String name;
	private int age;
	private String tel;
	//직렬화에서 제외하고 싶은 필드는 transient 키워드 사용
	private transient String addr;
	
	//생성자부 - [접근제한자] [키워드] <클래스 명> ([매개변수, ...]) {[실행내용; ...]}
	//기본 디폴트 생성자
	public Student() {}
	//매개변수 생성자
	public Student(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	
	//메소드부
	//Getter/Setter메소드
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
	//Object클래스에 있는 toString 메소드 오버라이딩
		//필드의 내용을 한 번에 출력해서 확인하기 위한 용도
	public String toString() {
		//return "이름 : "+name+", 나이 : "+age+", 전화번호 : "+tel+", 주소 : "+addr;
		return "[name=>"+name+",age=>"+age+",tel=>"+tel+",addr=>"+addr+"]";
	}
}
