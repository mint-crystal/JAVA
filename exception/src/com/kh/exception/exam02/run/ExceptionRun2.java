package com.kh.exception.exam02.run;

import java.io.IOException;

import com.kh.exception.exam02.model.Exam02;

public class ExceptionRun2 {

	public static void main(String[] args) throws IOException {
		Exam02 ex = new Exam02();
		//ex.method03();	//예외처리 넘김 - 실행하면 오류 발생
		
		//try~catch문을 이용해 예외처리해주기
		try {
			ex.method03();
		} catch (IOException e) {
			System.out.println("예외처리 완료");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");

	}

}
