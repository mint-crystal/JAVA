package com.kh.project.exam02.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.project.exam02.model.vo.Student001;

public class StudentController {
	public void method01() {
		System.out.println("-------- ArrayList 객체 데이터 사용 --------");
		
		//ArrayList 생성
		ArrayList<Student001> list = new ArrayList<Student001>();
		
		//리스트에 Student 객체 추가
			//객체를 생성하여 리스트에서 주소를 저장해서 사용함
		list.add(new Student001(20012,"홍길동",20));
		list.add(new Student001(20011,"김길동",30));
		list.add(new Student001(20013,"고길동",25));
		
	
		/* 리스트 데이터 확인
		 *  - 객체 이름만을 이용해서 사용할 경구 객체의 주소를 사용하게 됨
		 *  - 객체 이름만으로 출력하면 주소값이 출력됨
		 *  - 객체 내부 실제 데이터를 출력하고 싶은 경우 
		 *  	-객체 내부에 toString 메소드를 오버라이딩해주면 됨
		 *  	-toString() 메소드는 원래 object의 메소드
		 */
		System.out.println(list);	//toString 오버라이딩해서 사용할때
		System.out.println(list.get(0));	//Student001 클래스의 toString() 메소드 반환값 출력
		System.out.println(list.get(1));	//Student001 클래스의 toString() 메소드 반환값 출력
		System.out.println(list.get(2));	//Student001 클래스의 toString() 메소드 반환값 출력
//		System.out.println(((Student001)list.get(0)).getName()); //toString이 없을때 강제 형변환. 다운캐스팅
//		System.out.println(((Student001)list.get(0)).getField());	//toString이 없을 경우
		
		//반복문 사용
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(0).getClassNumber()+"번 학생의 이름은 "
								+list.get(i).getName()+"이고, 나이는 "
								+list.get(i).getAge()+"살 입니다.");
		}
		
		
		//리스트 데이터 삽입
		list.add(2, new Student001(20014, "최길동", 28));
		System.out.println(list);
		
		
		//리스트 데이터 수정
		list.set(1, new Student001(20015,"이길동",33));
		System.out.println(list);
		//리스 내 객체 멤버 필드 수정
		list.get(0).setAge(21);
		System.out.println(list);
		
		
		//리스트 내 특정 객체 삭제
		list.remove(2);
		System.out.println(list);
		
		
		//리스트 내 모든 데이터 삭제
		list.clear();
		System.out.println(list);
	}
	
	public void method02() {
		System.out.println("-------- ArrayList 객체 데이터 정렬 --------");
		ArrayList<Student001> list = new ArrayList<Student001>();
		//리스트에 Student001 객체 추가
		list.add(new Student001(20012, "홍길동" ,20));
		list.add(new Student001(20014, "이길동", 27));
		list.add(new Student001(20010, "고길동", 34));
		list.add(new Student001(20015, "최길동", 29));
		list.add(new Student001(20011, "김길동", 45));
		//리스트 전체 내용 출력
		System.out.println(list);
		
		
		/*	리스트에 객체를 저장할 경우 기본적인 방법으로는 정렬이 안됨
		 * 	- Collections.sort() 메소드가 정렬을 위한 기준을 찾을 수 없기 때문
		 *  - Comparable 인터페이스에 있는 compareTo() 메소드를 오버라이딩(재정의)해서 사용
		 */
		Collections.sort(list);	//Student001에서 정렬기준 재정의
		System.out.println(list);
		Collections.reverse(list);	//객체에 오름차순으로 구현해놓고 reverse 사용가능 - 리턴 값으로 알수 있어서?
		System.out.println(list);
		
	}
}
