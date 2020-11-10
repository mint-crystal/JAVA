package com.kh.project.run;

import java.util.Scanner;

import com.kh.project.model.vo.StringExam01;

public class StringExamRun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		StringExam01 se = new StringExam01();
		
		//String 클래스 기본 문자열 사용
		se.method01();
		
		//String 클래스 메소드 사용
		se.method02();
		//String str = "Hello";
		String str = scan.next();
		System.out.println(str == se.str);	//주소값을 비교
		System.out.println(str.equals(se.str));	//문자열울 비교
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(se.str));
		
		//StringBuffer 클래스
		se.method03();
		
		//StringBuilder 클래스
		se.method04();
		
		//StringTokenizer 클래스
		se.method05();
	}

}
