package object.constructor;

public class ConstructorExam {
	//필드
	public String name;
	public int age;
	
	//생성자
	public ConstructorExam() {
		this("이름없음,",0); //아래 생성자의 String, int
		////this()를 이용해 생성자를 호출할 때에는 코드의 가장 위에 this 메소드가 와야한다
		System.out.println("생성자1 호출");
	}
	public ConstructorExam(String name, int age) {
		System.out.println("생성자2 호출");
	}
}
