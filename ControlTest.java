package kh.project1.test1;

import java.util.Scanner;

public class ControlTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//if��
		if(num>0) {
			System.out.println("����Դϴ�.");
			System.out.println("������ ���Դϴ�.");
		}
		else {
			System.out.println("����� �ƴմϴ�.");
		}
		System.out.println("���α׷� ����");
		
		if(num%2==0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		if(num>0) {
			System.out.println("0���� ū ��");
		} else if (num<0) {
			System.out.println("0���� ���� ��");
		} else {
			System.out.println("0�� ���� ��");
		}
		
		
		//�̷��� �ϸ� 0�� �Է¹޾��� �� ¦���� �νĵǾ� "¦���Դϴ�"�� ��µ�.(0%2=0�̹Ƿ�)
		if(num%2==0) {
			System.out.println("¦���Դϴ�");
		} else if (num%2==1) {
			System.out.println("Ȧ���Դϴ�");
		}else {
			System.out.println("0�Դϴ�");
		}
		//0�� �Է¹޾��� �� "0�Դϴ�"�� ����ϱ� ���ؼ��� ���ǽ��� ������ �ٲ�
		if(num==0) {
			System.out.println("0�Դϴ�");
		} else if (num%2==1) {
			System.out.println("Ȧ���Դϴ�");
		}else {
			System.out.println("¦���Դϴ�");
		}
		//�Ǵ� if�� ��ø�ؼ� ���
		if(num%2==0) {
			if(num==0) {
				System.out.println("0�Դϴ�");
			} else{
			System.out.println("¦���Դϴ�");
			}
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String season="";
		if(month==1||month==2||month==12) {
			season = "�ܿ�";
		} else if(month>=3 && month<=5) {
			season = "��";
		} else if(month>=6 && month<=8) {
			season="����";
		} else if(month>=9 && month<=11) {
			season = "����";
		} else {
			//season = "�ش��ϴ� ������ �����ϴ�.";
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
		}
		System.out.println(season);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		System.out.print("�µ� �Է� : ");
		int temperature = sc.nextInt();
		String season;
		if (month == 1 || month == 2 || month ==12) {
			season = "�ܿ�";
			if(temperature <= -15) {
				season += "\n���� �溸";
			} else if (temperature <= -12){
					season += "\n���� ���Ǻ�";
			}
		} else if (month >= 3 && month <= 5) {
			season = "��";
		} else if (month >= 6 && month <= 8) {
			season = "����";
			if(temperature >= 35) {
				season += "\n���� �溸";
			} else if(temperature >= 33) {
				season += "\n���� ���Ǻ�";
			}
		} else if (month >= 9 && month <=11) {
			season = "����";
		} else {
			season = "�ش��ϴ� ������ �����ϴ�.";
		}
		System.out.println(season);
	
		
		//switch��
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int select = scan.nextInt();
		switch (select)
		{
		case 1 : System.out.println("1 �Է�");
		case 2 : System.out.println("2 �Է�");
		case 3 : System.out.println("3 �Է�");
		case 4 : System.out.println("4 �Է�");
		default : System.out.println("��Ÿ�Է�");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int select = scan.nextInt();
		switch (select)
		{
		case 1 : System.out.println("1 �Է�");
			break;
		case 2 : System.out.println("2 �Է�");
			break;
		case 3 : System.out.println("3 �Է�");
			break;
		case 4 : System.out.println("4 �Է�");
			break;
		default : System.out.println("��Ÿ�Է�");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int select = scan.nextInt();
		switch (select/10)
		{
		case 0 : System.out.println("0~9�Է�");
			break;
		case 1 : System.out.println("10~19 �Է�");
			break;
		case 2 : System.out.println("20~29 �Է�");
			break;
		case 3 : System.out.println("30~39 �Է�");
			break;
		case 4 : System.out.println("40~49 �Է�");
			break;
		default : System.out.println("��Ÿ�Է�");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int select = scan.nextInt();
		switch (select)
		{
		case 0 : 
		case 5 : System.out.println("0 �Ǵ� 5 �Է�");
			break;
		case 3 : 
		case 7 : 
		case 9 : System.out.println("3,7,9 �Է�");
			break;
		default : System.out.println("��Ÿ�Է�");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String select = scan.next();
		switch (select)
		{
		case "������" : 
		case "��쿵" : System.out.println("1���Դϴ�.");
			break;
		case "�ֹ���" : 
		case "������" : 
		case "������" : System.out.println("2���Դϴ�.");
			break;
		//default : System.out.println("��Ÿ�Է�");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		String team;
		switch(num%5) {
		case 1 : team = "1��";
			break;
		case 2 : team = "2��";
			break;
		case 3 : team = "3��";
			break;
		case 4 : team = "4��";
			break;
		default : team = "�ٽ�";
		}
		System.out.println(team);
	}
}

		
	

