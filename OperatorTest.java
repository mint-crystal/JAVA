package kh.project1.test1;

public class OperatorTest {

	public static void main(String[] args) {
		//산술연산자
		int a = 10, b = 20, c = 0;
		c = a*b;
		System.out.println(c);	//200
		c = a/b; //b의 값을 0으로 바뀌면 에러. 모든 수는 0으로 나눌 수 없음. 예외처리로 해결하기
		System.out.println(c);	//0
		c = a%b;
		System.out.println(c);	//10
		c = a+b;
		System.out.println(c);	//30
		c = a-b;
		System.out.println(c); //-10
		
		//증감연산자
		int d = 10;
		int e = ++d;
		System.out.println(d + ", " + e); //11, 11
		d= 10;
		e = d++;
		System.out.println(d + ", " + e); //11,10
		
		//비교연산자
		System.out.println(3>5); //false
		System.out.println(3<5); //true
		
		//논리연산자
		int num = 10;
		System.out.println(0<num && num<100); //참 && 참 -> 참
		System.out.println(0>num && num<100); //거짓 && 참 -> 거짓
		System.out.println(0>num && num>100); //거짓 && 거짓 -> 거짓
		System.out.println(0<num || num<100); //참 || 참 -> 참
		System.out.println(0>num || num<100); //거짓 || 참 -> 참
		System.out.println(0>num || num>100); //거짓 || 거짓 -> 거짓
		
		//삼항연산자
		int num1 = 10;
		System.out.println((num1 > 0) ? "0보다 큼" : "0보다 작거나 같음"); //0보다 큼
		int num2 = -10;
		System.out.println((num2 > 0) ? "0보다 큼" : "0보다 작거나 같음"); //0보다 작거나 같음
	}

}
