package com.kh.project.exam01.run;

import com.kh.project.exam01.model.vo.ArrayListExam01;
//import 단축키 : Ctrl + Shift + m

public class ArrayListExamRun {

	public static void main(String[] args) {
		ArrayListExam01 ale = new ArrayListExam01();
		
		//기존 배열 사용
		ale.method01();
		
		//ArrayList 기본 사용
		ale.method02();
		
		//ArrayList 기본 정렬
		ale.method03();
	}
	

}
