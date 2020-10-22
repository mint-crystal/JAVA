package kh.project1.test1;

public class Variable {

	public static void main(String[] args) {
		//변수 선언
		int num;
		//변수 사용 - 값 대임
		num = 10;
		//변수 사용 - 값 읽기
		System.out.println(num); //10
		
		num = 10+20;
		System.out.println(num); //30
		
		//변수 선언 후 바로 값 대입(초기값)
		int num2 = 20;
		//여러 개의 변수 동시에 선언(같은 자료형만 가능)
		int num3, num4, num5;
		//여러 개의 변수 동시에 선언 후 바로 값 대입(초기갑)
		int num6, num7 = 40, num8 = 50; //num6은 값을 넣지 않았기 때문에 아무것도 없는 상태
		
		//변수 값을 다른 변수에 대입
		int num9 = 10;
		int num10 = num9;
		
		//변수 값을 이용해 연산 후 다시 대입
		int num11 = 100;
		System.out.println(num11); //100
		num11 = num11 + 1;
		System.out.println(num11); //101
		
		//데이터 타입에 따른 변수 선언
		byte num01 = 100; //1byte 크기의 정수형태 공간
		System.out.println(num01); //100
		System.out.println("num01변수 값 : "+num01);
		short num02 = 10000; //2byte 크기의 정수형태 공간
		System.out.println("num02변수 값 : "+num02); //10000
		int num03 = 10000000; //4byte 크기의 정수형태 공간
		System.out.println("num03변수 값 : "+num03); //10000000
		long num04 = 10000000000L; //8byte 크기의 정수형태 공간-끝에 l 또는 L을 붙임
		System.out.println("num04변수 값 : "+num04); //10000000000
		float num05 = (float)3.5; //=3.5F; //4byte 크기의 실수형태 공간
		System.out.println("num05변수 값 : "+num05); //3.5
		double num06 = 12345.234; //8byte 크기의 실수형태 공간
		System.out.println("num06변수 값 : "+num06); //12345.234
		char ch = '가'; //2byte 크기의 단일문자형태 공간
		System.out.println("ch변수 값 : "+ch); //가
		String str = "배부름~!!"; //가변크기의 문자열형태 공간
		System.out.println("str변수 값 : "+str); //배부름~!!
		System.out.println("str변수 값 : "+str.charAt(1)); //특정 위치 한글자 추출
		System.out.println("str변수 값 : "+str.length()); //문자 갯수
		boolean bl = true; //1byte 크기의 논리형태 공간
		System.out.println("bl변수 값 : "+bl); //true
		bl = false;
		System.out.println("bl변수 값 : "+bl); //false
		
		//변수에 다른 형태 데이터 대입
//		int in1 = 3.5; //실수가 정수보다 크기때문에 에러
		int in2 = 'A'; //단일문자는 숫자로 저장이 되므로 정수와 혼용
		System.out.println("in2변수 값 : "+in2);//65
		char ch1 = 65; //정수와 단일문자는 똑같이 처리. int=char
		System.out.println("ch1변수 값 : "+ch1); //A
		float fl = 5; 
		System.out.println("fl변수 값 : "+fl); //5.0 
		double fl2 = 100; 
		System.out.println("fl2변수 값 : "+fl2); //100.0
//		String str1 = 'A'; //에러
		String str1 = ""+ 'A'+100; //문자열과 다른 데이터 타입을 연산하면 사용가능
		System.out.println("str1변수 값 : "+str1); //A100
		
		//변수 사용 영역
		int var1 = 10;
		System.out.println(var1); //10 정상 출력
		{//새로운 블록
//			int var1 = 30; //에러. 하나의 영역 안에서는 같은 이름을 사용할 수 없음
			int var2 = 20;
			System.out.println(var1); //10 - 작은 {}블록 안에서 var1을 찾고 없으면 더 큰 블록에서 찾아냄
			System.out.println(var2); //20
		}
//		System.out.println(var2); //블록 안에 없으므로 에러. 큰 블록->작은 블록으로는 찾지 않음
		
		//final 상수 - 변하지 않는 값
		final int num100;
		num100 = 20; //선언 후 한 번은 값 대입 가능
		System.out.println(num100); //20
//		num100 = 30; //final 상수로 인한 에러 발생
		final int NUM = 101; //선언과 동시에 초기화
		System.out.println(NUM); //101
//		NUM = 100; //final 상수로 인한 에러 발생
		
		//강제 형변환
		int number = 10;
		System.out.println((byte)number);
		number = 290; //앞의 데이터 손실로 남는 2진수의 값이 도출
		System.out.println((byte)number); //34
	}

}
