package com.kh.exception.exam01.run;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRun {

	public static void main(String[] args) {
		int num1 = 100, num2=0;
		System.out.println("자바 오랜만~!");
//		//if문을 이용한 예외처리
//		if(num2==0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} else {
//			System.out.println(num1/num2);
//		}
//		
//		//try~catch문을 이용한 예외처리
//		try {
//			System.out.println(num1/num2);
//			System.out.println("try 내부 명령문");
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println("예외 메시지 : "+e.getMessage());
//		}
//		//방법2
//		try {
//			System.out.println(num1/num2);
//			System.out.println("try 내부 명령문");
//		} catch (ArithmeticException err) {	//처리해야할 예외 클래스 명
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println("예외 메시지 : "+err.getMessage());
//		}
		
		//try~catch~finally문을 이용한 예외처리
//		try {
//			System.out.println(num1/num2);
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println("예외 메시지 : "+e.getMessage());
//		}finally{
//			System.out.println("try 내부 명령문");
//		}
//		//num2의 값이 0이 아닌 양수일 때
//		num2 = 5;
//		try {
//			System.out.println(num1/num2);
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			System.out.println("예외 메시지 : "+e.getMessage());
//		}finally{
//			System.out.println("try 내부 명령문");
//		}
//		System.out.println("프로그램 종료");
//		
//		//멀티 catch문
//		Scanner sc = new Scanner(System.in);
//		System.out.println("--- 나눗셈 프로그램 ---");
//		try {
//			System.out.print("첫 번째 수 입력 : ");
//			int var1 = sc.nextInt();
//			System.out.print("두 번째 수 입력 : ");
//			int var2 = sc.nextInt();
//			System.out.println("결과 : "+var1/var2);
//		}catch(ArithmeticException e){
//			System.out.println("0으로 나눌 수 없습니다!");
//		}catch(InputMismatchException e) {
//			System.out.println("정수만 입력해주세요~!!");
//		}catch(Exception e){	//더 큰 범위는 아래에
//			System.out.println("그 외의 예외처리");
//		}
//		
//		System.out.println("프로그램 종료");
//	}
	
	//
	try(BufferedReader br = new BufferedReader(new FileReader("E:/text.txt"))){
		String s;
		while((s = br.readLine())!=null) {
			System.out.println(s);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("프로그램 종료");
	}
	

}
