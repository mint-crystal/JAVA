package kh.oop;
//하나의 소스 파일 안에 여러 개의 클래스를 만들 수 있음
class Member2{ //public이 붙지 않은 이유 : 파일 이름과 동일안 클래스 명에만 public 
				//default라는 접근 제한자 사용됨
	public int num;
	public Member2() {
		System.out.println("Member2 객체 생성");
	}
}
/*  하나의 소스 파일 안에 여러 개의 클래스를 만들 수 있지만
	실제로는 각각의 클래스 파일이 만들어진다.
 	- Navigator 기능 확인 	*/
public class Run { //클래스 명은 파일의 이름과 반드시 같아야한다.

	public static void main(String[] args) { //실행 클래스
		System.out.println("!!실행 클래스 시작!!");
		Member mb = new Member(); //Member 클래스를 이용해 객체 생성
								  //주소를 저장할 수 있는 mb라는 이름의 참조변수 만들어짐
		Member2 mb2 = new Member2(); //Member2 클래스를 이용해 객체 생성
		
		mb.name = "홍길동"; //mb 객체의 name 멤버변수 사용
		mb.setAge(20); //mb 객체의 setAge() 멤버메소드 사용
		
		System.out.println("이름은 : " + mb.name);
		System.out.println("나이는 : " + mb.getAge());
		
		Member mbmb = new Member(); //Member 클래스를 이용해서 또 다른 객체 생성
		mbmb.age = 30;
		mbmb.name = "이은지";
		System.out.println(mbmb.age);
		System.out.println(mbmb.name);
	}

}
