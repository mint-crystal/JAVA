package kh.project1.test1; 

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello~!!!");
		System.out.println("안녕하세요~!!!");
		System.out.println("자바열공하세요~!!!");
		
		System.out.println(10); //정수
		System.out.println(3.5); //실수
		System.out.println('A'); //단일문자
		System.out.println("A"); //문자열
		System.out.println("Hello"); //문자열
		System.out.println(10+20); //정수연산
		System.out.println(5.5+3.5); //실수연산
		System.out.println(10+3.5); //정수+실수 연산
		System.out.println('A'+'B'); //단일문자연산
		System.out.println(10+'A'); //정수+단일문자 연산
		//단일문자 연산과 정수+단일문자 연산은 단일문자가 숫자로 바뀌어서 연산됨
		System.out.println("Hello"+"Bye"); //문자열 연산
		System.out.println("Hello"+'A'); //문자열 연산
		//문자열+단일문자는 문자열의 데이터가 크므로 단일문자가 문자열로 바뀌어 나옴
		System.out.println("Hello"+20); //문자열+정수 연산
		System.out.println("Hello"+3.5); //문자열+실수 정산
	}

}
