package kh.project1.test1;

import java.util.Scanner;

public class CalcMethodTest {
	
	public static int plus (int a, int b) {
		int sum = a+b;
		return sum;
	} 
	
	public static int minus (int a, int b) {
		int sum = a-b;
		return sum;
	}
	
	public static double divide (double a, double b) {
		double sum = a/b;
		return sum;
	}
	
	public static int multi (int a, int b) {
		int sum = a*b;
		return sum;
	}

	public static void main(String[] args) {
		//������ �� ����� �Լ��� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("## ���� ##");
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ������");
		System.out.println("4. ���ϱ�");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		System.out.print("��1 �Է� : ");
		int a = sc.nextInt();
		System.out.print("��2 �Է� : ");
		int b = sc.nextInt();
		if(choice==1) {
			int sum=plus(a, b);
			System.out.println("��� �� : "+sum);
		} else if(choice == 2) {
			int sum=minus(a,b);
			System.out.println("��� �� : "+sum);
		} else if(choice == 3) {
			double sum=divide(a,b);
			System.out.println("��� �� : "+sum);
		}else {
			int sum=multi(a,b);
			System.out.println("��� �� : "+sum);
		}
		
	}

}
