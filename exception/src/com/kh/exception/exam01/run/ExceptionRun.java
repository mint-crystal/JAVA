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
		System.out.println("�ڹ� ������~!");
//		//if���� �̿��� ����ó��
//		if(num2==0) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//		} else {
//			System.out.println(num1/num2);
//		}
//		
//		//try~catch���� �̿��� ����ó��
//		try {
//			System.out.println(num1/num2);
//			System.out.println("try ���� ��ɹ�");
//		} catch (Exception e) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//			System.out.println("���� �޽��� : "+e.getMessage());
//		}
//		//���2
//		try {
//			System.out.println(num1/num2);
//			System.out.println("try ���� ��ɹ�");
//		} catch (ArithmeticException err) {	//ó���ؾ��� ���� Ŭ���� ��
//			System.out.println("0���� ���� �� �����ϴ�.");
//			System.out.println("���� �޽��� : "+err.getMessage());
//		}
		
		//try~catch~finally���� �̿��� ����ó��
//		try {
//			System.out.println(num1/num2);
//		} catch (Exception e) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//			System.out.println("���� �޽��� : "+e.getMessage());
//		}finally{
//			System.out.println("try ���� ��ɹ�");
//		}
//		//num2�� ���� 0�� �ƴ� ����� ��
//		num2 = 5;
//		try {
//			System.out.println(num1/num2);
//		} catch (Exception e) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//			System.out.println("���� �޽��� : "+e.getMessage());
//		}finally{
//			System.out.println("try ���� ��ɹ�");
//		}
//		System.out.println("���α׷� ����");
//		
//		//��Ƽ catch��
//		Scanner sc = new Scanner(System.in);
//		System.out.println("--- ������ ���α׷� ---");
//		try {
//			System.out.print("ù ��° �� �Է� : ");
//			int var1 = sc.nextInt();
//			System.out.print("�� ��° �� �Է� : ");
//			int var2 = sc.nextInt();
//			System.out.println("��� : "+var1/var2);
//		}catch(ArithmeticException e){
//			System.out.println("0���� ���� �� �����ϴ�!");
//		}catch(InputMismatchException e) {
//			System.out.println("������ �Է����ּ���~!!");
//		}catch(Exception e){	//�� ū ������ �Ʒ���
//			System.out.println("�� ���� ����ó��");
//		}
//		
//		System.out.println("���α׷� ����");
//	}
	
	//
	try(BufferedReader br = new BufferedReader(new FileReader("E:/text.txt"))){
		String s;
		while((s = br.readLine())!=null) {
			System.out.println(s);
			}
		}catch(FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("���α׷� ����");
	}
	

}
