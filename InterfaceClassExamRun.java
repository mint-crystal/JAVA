package com.kh.project.run;

import com.kh.project.model.Interface01;
import com.kh.project.model.InterfaceClassExam02;
import com.kh.project.model.InterfaceClassExam03;

public class InterfaceClassExamRun {

	public static void main(String[] args) {
		InterfaceClassExam03 ice03 = new InterfaceClassExam03();
		ice03.method0101();
		
		InterfaceClassExam02 ice02 = new InterfaceClassExam02();
		ice02.method0101();	//�������̽�01�� ����Ʈ �޼ҵ� �������̵�
		
		Interface01.method0102();

	}

}
