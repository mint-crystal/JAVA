package object.constructor;

public class ConstructorRun {

	public static void main(String[] args) {
		ConstructorExam ce01;	//주소를 저장할 참조변수
		ce01 = new ConstructorExam();	//()는 ConstructorExam 클래스에 대한 생성자를 호출
		ConstructorExam ce02 = new ConstructorExam("홍길동", 20);
	}

}
