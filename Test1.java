package kh.project1.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//실습문제1) 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.next(); //or char gender=scan.next().charAt(0);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double cm = sc.nextDouble();
		System.out.println("키"+cm+"cm인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다^^");

		//실습문제2) 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		System.out.println("더하기 결과 : "+(a+b));
		System.out.println("빼기 결과 : "+(a-b));
		System.out.println("곱하기 결과 : "+a*b);
		System.out.println("나누기 결과 : "+a/b);
		
		//실습문제3) 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		/*계산 공식 ) 면적 : 가로 * 세로
			둘레 : (가로 + 세로) * 2*/
		System.out.print("가로 : ");
		float c = sc.nextFloat();
		System.out.print("세로 : ");
		float d = sc.nextFloat();
		System.out.println("면적 : "+c*d);
		System.out.println("둘레 : "+((c+d)*2));
		
		//실습문제4) 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		System.out.println("첫 번째 문자 : "+str.charAt(0));
		System.out.println("두 번째 문자 : "+str.charAt(1));
		System.out.println("세 번째 문자 : "+str.charAt(2));
	}

}
