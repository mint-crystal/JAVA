package object.encapsulation;

public class Run {

	public static void main(String[] args) {
		//같은 패키지 내의 다른 클래스
		EncalsulationExam01 ee = new EncalsulationExam01();
		ee.print();
		ee.var1 = 100;
		//ee.var2 = 200;	//private 멤버 변수 - 접근 불가로 에러 발생
		ee.var3 = 300;
		ee.method01();	//public - 사용 가능
		//ee.method02();	//private - 사용 불가능
		ee.method03();	//default - 사용가능
	}

}
