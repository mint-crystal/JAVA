package kh.project1.test1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
//		// ���� �����(if)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("##����##");
//		System.out.println("1.���ϱ�");
//		System.out.println("2.����");
//		System.out.println("3.������");
//		System.out.println("4.���ϱ�");
//		System.out.print("���� : ");
//		int select = scan.nextInt();
//		if(select > 0 && select < 5) {
//			System.out.print("���� 1 �Է� : ");
//			int num1 = scan.nextInt();
//			System.out.print("���� 2 �Է� : ");
//			int num2 = scan.nextInt();
//			if(select == 1) {
//				System.out.println("��� : "+(num1+num2));
//			}else if(select ==2) {
//				System.out.println("��� : "+(num1-num2));
//			}else if(select==3) {
////				if(num2!=0) {
////				System.out.println("��� : "+(num1%num2));
////			} else {
////				System.out.println("0���� ���� �� �����ϴ�~!");
////			}
//			if(num2==0) {
//				System.out.println("0���� ���� �� �����ϴ�~!");
//			}else if(select==4) {
//				System.out.println("��� : "+(num1*num2));
//				} else {
//					System.out.println("��� : "+(num1*num2));
//				}
//			}
//			}else {
//				System.out.println("�߸��� �����Դϴ�.");
//			}
		
		//���� �����(switch)
		Scanner sc = new Scanner(System.in);
		System.out.println("## ���� ##");
		System.out.println("1.���ϱ�");
		System.out.println("2.����");
		System.out.println("3.������");
		System.out.println("4.���ϱ�");
		System.out.print("���� : ");
		int num = sc.nextInt();
		if(num > 0 && num <5) {
			System.out.print("���� 1 :");
			int num2 = sc.nextInt();
			System.out.print("���� 2 :");
			int num3 = sc.nextInt();
		switch (num) {
		case 1 : System.out.println("��� �� : "+(num2+num3));
			break;
		case 2 : System.out.println("��� �� : "+(num2-num3));
			break;
		case 3 : if(num3!=0) {
			System.out.println("��� �� : "+(double)num2/num3);
				}else {
			System.out.println("0���� ���� �� �����ϴ�.");
				}
			break;
		case 4 : System.out.println("��� �� : "+num2*num3);
			break;
		}
		}else {
			System.out.println("�߸��� �����Դϴ�.");}
		}
		
	}

