package test;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		//�ǽ�����1
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num01 = sc.nextInt();
		System.out.println(num01>0 ? "�����" : "����� �ƴϴ�");

		//�ǽ�����2
		System.out.print("���� : ");
		int num02 = sc.nextInt();
		System.out.println(num02>=0 ? "�����": (num02==0 ? "0�̴�" : "������"));
		
		//�ǽ�����3
		System.out.print("���� : ");
		int num03 = sc.nextInt();
		System.out.println(num03==num03%2 ? "¦����" : "Ȧ����");
		
		//�ǽ�����4
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("�������� : ");
		int candy = sc.nextInt();
		System.out.println("1�δ� ���� ���� : "+candy/people);
		System.out.println("���� ���� ���� : "+candy%people);
		
		//�ǽ�����5
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) :");
		int cla = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num04 = sc.nextInt();
		System.out.print("����(M/F) : ");
		String gender = sc.next();
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		System.out.println(grade+"�г� "+cla+"�� "+num04+"�� "+name+(gender=="M"?" ���л�":" ���л�")+"�� ������ "+score+"�̴�.");

		//�ǽ�����6
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.println(age<=13?"���" : (age>19?"����":"û�ҳ�"));
		
		//�ǽ�����7
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		int sum = kor+eng+math;
		double average = sum/3.0;
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+average);
		System.out.println(kor>=40 && eng>=40 && math>=40 && average>=60?"�հ�":"���հ�");
		
		//�ǽ�����8
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String num05 = sc.next();
		System.out.println(num05.charAt(7)=='2'?"����":"����");
		
		//�ǽ�����9
		System.out.print("���� 1 :");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		System.out.println(num3<=num1||num3>num2);
		
		//�ǽ�����10
		System.out.print("�Է�1 : ");
		int num4 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num5 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num6 = sc.nextInt();
		System.out.println(num4==num5&&num4==num6&&num5==num6);
		
		//�ǽ�����11
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();
		double a1 = a*0.4+a;
		double b1 = b;
		double c1 = c*0.15+c;
		System.out.println("A��� ����/����+a : " +a+"/"+a1);
		System.out.println(a1>=3000?"3000 �̻�" : "3000�̸�");
		System.out.println("B��� ����/����+a : "+b+"/"+b1);
		System.out.println(b1>=3000?"3000 �̻�":"3000 �̸�");
		System.out.println("C��� ����/����+a : "+c+"/"+c1);
		System.out.println(c1>=3000?"3000 �̻�":"3000 �̸�");
	}

}
