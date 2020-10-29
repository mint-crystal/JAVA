package kh.project1.test1;

import java.util.Scanner;

public class CalcMethodTest {
	
	public static int plus (int a, int b) {
		int sum = a+b;
		return sum;
	} 
	
	public static int minus (int a, int b) {
		int sum = a-b;
		return sum;
	}
	
	public static double divide (double a, double b) {
		double sum = a/b;
		return sum;
	}
	
	public static int multi (int a, int b) {
		int sum = a*b;
		return sum;
	}

	public static void main(String[] args) {
		//계산기의 각 기능을 함수로 구현
		Scanner sc = new Scanner(System.in);
		System.out.println("## 계산기 ##");
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 나누기");
		System.out.println("4. 곱하기");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		System.out.print("수1 입력 : ");
		int a = sc.nextInt();
		System.out.print("수2 입력 : ");
		int b = sc.nextInt();
		if(choice==1) {
			int sum=plus(a, b);
			System.out.println("결과 값 : "+sum);
		} else if(choice == 2) {
			int sum=minus(a,b);
			System.out.println("결과 값 : "+sum);
		} else if(choice == 3) {
			double sum=divide(a,b);
			System.out.println("결과 값 : "+sum);
		}else {
			int sum=multi(a,b);
			System.out.println("결과 값 : "+sum);
		}
		
	}

}
