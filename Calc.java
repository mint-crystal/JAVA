package kh.project1.test1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
//		// 계산기 만들기(if)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("##계산기##");
//		System.out.println("1.더하기");
//		System.out.println("2.빼기");
//		System.out.println("3.나누기");
//		System.out.println("4.곱하기");
//		System.out.print("선택 : ");
//		int select = scan.nextInt();
//		if(select > 0 && select < 5) {
//			System.out.print("숫자 1 입력 : ");
//			int num1 = scan.nextInt();
//			System.out.print("숫자 2 입력 : ");
//			int num2 = scan.nextInt();
//			if(select == 1) {
//				System.out.println("결과 : "+(num1+num2));
//			}else if(select ==2) {
//				System.out.println("결과 : "+(num1-num2));
//			}else if(select==3) {
////				if(num2!=0) {
////				System.out.println("결과 : "+(num1%num2));
////			} else {
////				System.out.println("0으로 나눌 수 없습니다~!");
////			}
//			if(num2==0) {
//				System.out.println("0으로 나눌 수 없습니다~!");
//			}else if(select==4) {
//				System.out.println("결과 : "+(num1*num2));
//				} else {
//					System.out.println("결과 : "+(num1*num2));
//				}
//			}
//			}else {
//				System.out.println("잘못된 선택입니다.");
//			}
		
		//계산기 만들기(switch)
		Scanner sc = new Scanner(System.in);
		System.out.println("## 계산기 ##");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.나누기");
		System.out.println("4.곱하기");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		if(num > 0 && num <5) {
			System.out.print("숫자 1 :");
			int num2 = sc.nextInt();
			System.out.print("숫자 2 :");
			int num3 = sc.nextInt();
		switch (num) {
		case 1 : System.out.println("결과 값 : "+(num2+num3));
			break;
		case 2 : System.out.println("결과 값 : "+(num2-num3));
			break;
		case 3 : if(num3!=0) {
			System.out.println("결과 값 : "+(double)num2/num3);
				}else {
			System.out.println("0으로 나눌 수 없습니다.");
				}
			break;
		case 4 : System.out.println("결과 값 : "+num2*num3);
			break;
		}
		}else {
			System.out.println("잘못된 선택입니다.");}
		}
		
	}

