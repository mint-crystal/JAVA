package test;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		//실습문제1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num01 = sc.nextInt();
		System.out.println(num01>0 ? "양수다" : "양수가 아니다");

		//실습문제2
		System.out.print("정수 : ");
		int num02 = sc.nextInt();
		System.out.println(num02>=0 ? "양수다": (num02==0 ? "0이다" : "음수다"));
		
		//실습문제3
		System.out.print("정수 : ");
		int num03 = sc.nextInt();
		System.out.println(num03==num03%2 ? "짝수다" : "홀수다");
		
		//실습문제4
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕개수 : ");
		int candy = sc.nextInt();
		System.out.println("1인당 사탕 개수 : "+candy/people);
		System.out.println("남는 사탕 개수 : "+candy%people);
		
		//실습문제5
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) :");
		int cla = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num04 = sc.nextInt();
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		System.out.println(grade+"학년 "+cla+"반 "+num04+"번 "+name+(gender=="M"?" 남학생":" 여학생")+"의 성적은 "+score+"이다.");

		//실습문제6
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println(age<=13?"어린이" : (age>19?"성인":"청소년"));
		
		//실습문제7
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		int sum = kor+eng+math;
		double average = sum/3.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+average);
		System.out.println(kor>=40 && eng>=40 && math>=40 && average>=60?"합격":"불합격");
		
		//실습문제8
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String num05 = sc.next();
		System.out.println(num05.charAt(7)=='2'?"여자":"남자");
		
		//실습문제9
		System.out.print("정수 1 :");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		System.out.println(num3<=num1||num3>num2);
		
		//실습문제10
		System.out.print("입력1 : ");
		int num4 = sc.nextInt();
		System.out.print("입력2 : ");
		int num5 = sc.nextInt();
		System.out.print("입력3 : ");
		int num6 = sc.nextInt();
		System.out.println(num4==num5&&num4==num6&&num5==num6);
		
		//실습문제11
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		double a1 = a*0.4+a;
		double b1 = b;
		double c1 = c*0.15+c;
		System.out.println("A사원 연봉/연봉+a : " +a+"/"+a1);
		System.out.println(a1>=3000?"3000 이상" : "3000미만");
		System.out.println("B사원 연봉/연봉+a : "+b+"/"+b1);
		System.out.println(b1>=3000?"3000 이상":"3000 미만");
		System.out.println("C사원 연봉/연봉+a : "+c+"/"+c1);
		System.out.println(c1>=3000?"3000 이상":"3000 미만");
	}

}
