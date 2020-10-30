package kh.oop;

public class Member {
		//속성(Field) - [접근제한자] [예약어] 자료형 변수명;
		public String name; //멤버 변수
		public int age;
		
		//생성자(Constructor) - [접근제한자] 생성자명() { }
		public Member() {
			System.out.println("Member 객체 생성됨");
		}
		
		//기능(Method) - [접근제한자] 반환형 메소드명(매개변수) {기능 정의}
		public String getName() { //멤버 메소드
			return name;
		}
		public void setName(String name) { //멤버 메소드
			this.name = name;
		}
		public int getAge() { //멤버 메소드
         	return age;
		}
		public void setAge(int age) { //멤버 메소드 //괄호 안의 매개변수는 이름이 달라도 됨(this)
			this.age = age; //this는 클래스의 변수
		}
}
