package object.method;

public class Run {

	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		//메소드 표현식
		me.func1();
		me.func2(10);
		double num = me.func3();
		System.out.println(num);
		int sum = me.func4(10, 20);
		System.out.println(sum);
		
		//매개변수 실습 - 여러 자료형의 매개변수 입력
		me.func5(10, '가', 5.7);
		
		//매개변수 실습 - 참조자료형 매개변수
		int num2 = 100;
		System.out.println(num2);
		me.func6(num2);		//Call by Value : 값을 넘겨주면서 메소드를 호출
		System.out.println(num2);	//다시  100 출력
		
		//참조변수는 주소를 넘겨주기 때문에 바뀐 값이 출력
		//Call by Address = Call by Reference
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		System.out.println(arr1[0]);
		me.func7(arr1);
		System.out.println(arr1[0]); //func7의 값인 20 출력
		
		MethodExam02 meme = new MethodExam02();
		meme.name = "홍길동";
		meme.age = 20;
		meme.height = 160.2;
		System.out.println("이름 : "+meme.name+", 나이 : "+meme.age+", 키 : "+meme.height);
		me.func8(meme);
		System.out.println("이름 : "+meme.name+", 나이 : "+meme.age+", 키 : "+meme.height);
		
		//매개변수 실습 - 가변인자
		me.func9(10, 20, 30);
		
		//반환자료형 실습
		me.func10(10);
		me.func10(0);	//메소드10 실행 만 출력
		System.out.println(me.func10(0)); //리턴값 출력
		System.out.println("메인메서드 내용");
	}
	
}