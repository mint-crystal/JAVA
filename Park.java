package kh.project1.test1;

import java.util.Scanner;

public class Park {

	public static void main(String[] args) {
		// 놀이공원 프로그램
		Scanner scan = new Scanner(System.in);
		int total, adult, child=0;
		System.out.println("##놀이공원 프로그램##");
		System.out.print("입장하실 인원은 총 몇 명입니까?");
		total = scan.nextInt();
		if(total>0) {
		System.out.print("어른은 몇 명입니까?(인원당 1만 5천원)");
		adult = scan.nextInt();
		if (total>adult) {
		System.out.print("아이는 몇 명입니까?(인원당 5천원)");
		child = scan.nextInt();
		}
		if (total == adult+child) {
		System.out.println("지불하실 총 금액은 "+(15000*adult+5000*child)+"원 입니다.");
		}else {
			System.out.println("인원 수가 맞지 않습니다~!");
		}
		}else {
			System.out.println("장난치지말고 집에 가세요~!!");
			}

	}

}
