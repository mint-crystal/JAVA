package com.kh.project.run;

import java.util.Scanner;

import com.kh.project.model.vo.StringExam01;

public class StringExamRun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		StringExam01 se = new StringExam01();
		
		//String Ŭ���� �⺻ ���ڿ� ���
		se.method01();
		
		//String Ŭ���� �޼ҵ� ���
		se.method02();
		//String str = "Hello";
		String str = scan.next();
		System.out.println(str == se.str);	//�ּҰ��� ��
		System.out.println(str.equals(se.str));	//���ڿ��� ��
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(se.str));
		
		//StringBuffer Ŭ����
		se.method03();
		
		//StringBuilder Ŭ����
		se.method04();
		
		//StringTokenizer Ŭ����
		se.method05();
	}

}
