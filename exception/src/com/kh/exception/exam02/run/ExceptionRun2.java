package com.kh.exception.exam02.run;

import java.io.IOException;

import com.kh.exception.exam02.model.Exam02;

public class ExceptionRun2 {

	public static void main(String[] args) throws IOException {
		Exam02 ex = new Exam02();
		//ex.method03();	//����ó�� �ѱ� - �����ϸ� ���� �߻�
		
		//try~catch���� �̿��� ����ó�����ֱ�
		try {
			ex.method03();
		} catch (IOException e) {
			System.out.println("����ó�� �Ϸ�");
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");

	}

}
