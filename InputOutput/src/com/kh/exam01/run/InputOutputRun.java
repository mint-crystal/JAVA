package com.kh.exam01.run;

import java.io.IOException;

import com.kh.exam01.model.IOExam01;

public class InputOutputRun {

	public static void main(String[] args) {
		IOExam01 ioe = new IOExam01();
		
//		ioe.method01();
//		ioe.method02();
//		ioe.method03();
//		ioe.method04();
//		ioe.method05();
//		ioe.method06();
//		ioe.method07();
		
		//보조스트림
		try {
			ioe.method08();
		} catch (IOException e) {
			System.out.println("예외발생");
		}
	}

}
