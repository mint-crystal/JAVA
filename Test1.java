package kh.project1.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�ǽ�����1) �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String gender = sc.next(); //or char gender=scan.next().charAt(0);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double cm = sc.nextDouble();
		System.out.println("Ű"+cm+"cm�� "+age+"�� "+gender+"�� "+name+"�� �ݰ����ϴ�^^");

		//�ǽ�����2) Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
		System.out.print("ù ��° ���� : ");
		int a = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int b = sc.nextInt();
		System.out.println("���ϱ� ��� : "+(a+b));
		System.out.println("���� ��� : "+(a-b));
		System.out.println("���ϱ� ��� : "+a*b);
		System.out.println("������ ��� : "+a/b);
		
		//�ǽ�����3) Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		/*��� ���� ) ���� : ���� * ����
			�ѷ� : (���� + ����) * 2*/
		System.out.print("���� : ");
		float c = sc.nextFloat();
		System.out.print("���� : ");
		float d = sc.nextFloat();
		System.out.println("���� : "+c*d);
		System.out.println("�ѷ� : "+((c+d)*2));
		
		//�ǽ�����4) ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.next();
		System.out.println("ù ��° ���� : "+str.charAt(0));
		System.out.println("�� ��° ���� : "+str.charAt(1));
		System.out.println("�� ��° ���� : "+str.charAt(2));
	}

}
