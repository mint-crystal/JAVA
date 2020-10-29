package kh.project1.test1;

public class MethodTest {

	//방법1 - 매개 값이 없을 때
	public static void func1() {
		System.out.println("func 메서드");
		int num = 10;
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//방법2 - 매개 값 삽입
	public static void func1(int num) {
		System.out.println("func 메서드");
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//방법3 - return
	public static int func1(int num) {
		System.out.println("func 메서드");
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		return sum;
	}

	public static int[] func1(int num) {
		System.out.println("func 메서드");
		int[] arr = {10,20,30};
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		System.out.println("func 안에 있는 주소 : " + arr);
		return arr;
	}

	public static void main(String[] args) { //메인메소드
		
		System.out.println("메인 메서드");
		//func1(); //매개 값이 없을 때
		
		func1(20); //매개값을 입력하여 출력
		System.out.println(func1(20)); //결과 값을 받아서 바로 출력
		System.out.println(func1(20)+10); //결과 값을 연산
		
		//return을 사용해 sum값 반환
		int sum;
		sum = func1(10);
		System.out.println(sum); 
		
		//배열 형태 반환
		int[] sum;
		sum = func1(10);
		System.out.println("메인에서 받아온 arr 주소 : "+sum);
		for(int i = 0; i<sum.length; i++) {
			System.out.println(sum[i]);
		}
		
		System.out.println("메인 메서드2"); //func1 수행 후 메인 메소드로 돌아옴
		
	}
	}
