package object.method;

public class MethodExam01 {
	//Field
	//메소드 표현식
	public void func1() { //반환값X, 매개변수X
		System.out.println("메소드1 실행");
	}
	public void func2(int num) { //반환값X, 매개변수O
		System.out.println("메소드2 실행");
		System.out.println("입력 값 : "+num);
	}
	public double func3() { //반환값O, 매개변수X
		System.out.println("메소드3 실행");
		return 3.5;
	}
	public int func4(int num1, int num2) { //반환값O, 매개변수O
		System.out.println("메소드4 실행");
		return num1+num2;
	}
	
	//매개변수 실습 - 여러 자료형의 매개변수 입력
	public void func5(int num1, char ch, double num2) {
		System.out.println("메소드5 실행");
		System.out.println(num1+" , "+ch+" , "+num2);
	}
	
	//매개변수 실습 - 참조자료형 매개변수
	public void func6(int num) {
		num+=10;
		System.out.println("메소드6 실행 : "+num);
	}
	public void func7(int [] arr) {
		arr[0]+=10;
		System.out.println("메소드7 실행 : "+arr[0]);
	}
	public void func8(MethodExam02 me02) {
		me02.name = "이길동";
		me02.age += 5;
		me02.height = 175.5;
		System.out.println("메소드8 실행 : "+me02.name);
		System.out.println("메소드8 실행 : "+me02.height);
		System.out.println("메소드8 실행 : "+me02.age);
	}
	
	//매개변수 실습 - 가변인자
	public void func9(int ...num) {
		System.out.println("메소드9 실행");
		System.out.println(num);
	}
	
	//반환자료형 실습
	public int func10(int num) {
		System.out.println("메소드10 실행");
		if(num==0)
			return 10;
		System.out.println("메소드10 실행2");
		return 20;	//모든 경우에 반환값을 남겨줄 수 있도록 지정
	}
}
