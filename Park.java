package kh.project1.test1;

import java.util.Scanner;

public class Park {

	public static void main(String[] args) {
		// ���̰��� ���α׷�
		Scanner scan = new Scanner(System.in);
		int total, adult, child=0;
		System.out.println("##���̰��� ���α׷�##");
		System.out.print("�����Ͻ� �ο��� �� �� ���Դϱ�?");
		total = scan.nextInt();
		if(total>0) {
		System.out.print("��� �� ���Դϱ�?(�ο��� 1�� 5õ��)");
		adult = scan.nextInt();
		if (total>adult) {
		System.out.print("���̴� �� ���Դϱ�?(�ο��� 5õ��)");
		child = scan.nextInt();
		}
		if (total == adult+child) {
		System.out.println("�����Ͻ� �� �ݾ��� "+(15000*adult+5000*child)+"�� �Դϴ�.");
		}else {
			System.out.println("�ο� ���� ���� �ʽ��ϴ�~!");
		}
		}else {
			System.out.println("�峭ġ������ ���� ������~!!");
			}

	}

}
