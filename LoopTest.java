package kh.project1.test1;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//while��
		int i=1; //�ʱ��
		while(i<=10) {	//���ǽ�
			System.out.println("i ���� �� : "+i);
			i++;	//������
		}
		//���� �Է� �޾Ƽ� �Է¹��� �� ��ŭ ��� 
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݺ��� Ƚ�� : ");
		int a = sc.nextInt();
		int j = 1;
		while(j<=a) {
			System.out.println(j+"��° �ݺ�");
			j++;
		}
				//if���� Ȱ��
		while(true) {
			if(j>=a)
				//return;	//�޼ҵ� ��ü�� �����ϴ� �б⹮
				break;		//while���� �����ϴ� �б⹮(if���� break�� ������ ����X)
			j++;
			System.out.println(j+"��° �ݺ�");
		}
				//�ݴ�� ���� ���
		System.out.print("�ݺ��� Ƚ�� : ");
		int count = sc.nextInt(); //�ʱ��
		while(count>0) { //���ǽ�
			System.out.println(count+"�ݺ�");
			count--; //������
		}
		System.out.println("���α׷� ����κ�");
		
		//���� �Է¹޾� 0���� �Է� ���� �������� �� ���ϱ� - ���1
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int x = 0; //x=1�� �ص� �������
		int sum = 0;
		while(x<=num) {
			//int sum; ���� �� sum=x; �־ ����� ���� ����
			sum = sum+x;
			x++;
		}
		System.out.println(sum);
		
		//���� �Է¹޾� 0���� �Է� ���� �������� �� ���ϱ� - ���2
		int num = sc.nextInt();
		int sum = 0;
		while(num>=0) {
			sum = sum+num;
			num--;
		}
		System.out.println(sum);
		
		//���� �Է¹޾� 0���� �Է¹��� �������� ¦���� �� ���ϱ� 1
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int x = 0; 
		int sum = 0;
		while(x<=num) {
			if(x%2==0) {
			sum = sum+x;
			}
			x++;
		}
		System.out.println(sum);

		//���� �Է¹޾� 0���� �Է¹��� �������� ¦���� �� ���ϱ� 2 - �ٽ�
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int x = 0; 
		int sum = 0;
		while(x<=num) {
			sum = sum+x;
			x+=2;
			}
		System.out.println(sum);
		
		//������ ����ϱ�(�Է¹��� �� �ϳ�)
		System.out.print("�� ���� ����Ͻðڽ��ϱ�? ");
		int y = sc.nextInt();
		int n = 1;
		while(n<=9) {
			System.out.println(y+" x "+n+" = "+y*n);
			//System.out.printf("%d x %d = %d \n", y, n, y*n);
			n++;
		}
		
		//do while
		int i = 1;
		do {
			System.out.println(i+"���");
			i++;
		}while(i<=10);
		
		Scanner scan = new Scanner(System.in);
		int num;
		do{
			System.out.print("���� �Է�(����:0) : ");
			num = scan.nextInt();
			System.out.println("�Է� �� : "+num);
		}while(num!=0);
				///while������ ó��
		int num = 1;
		while (num!=0) {
			System.out.print("���� �Է�(����:0) : ");
			num = scan.nextInt();
			System.out.println("�Է� �� : "+num);
		}

		//for��
		for(int i = 1; i<=10; i++) {
			System.out.println(i+"���");
		} //�� �Ʒ��� i�� ���� �ٸ� i. ������ �־� ���� �ʱ�ȭ�Ͽ��� ������
		for(int i = 1, j=10; i<=10; i++, j--) {
			System.out.println(i+"���");
			System.out.println(j+"���");
		}		
		//���� �Է� �޾Ƽ� �Է� ���� �� ��ŭ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݺ��� Ƚ�� : ");
		int e = sc.nextInt();
		for(int f = 1; f<=e; f++) {
			System.out.println(f+"��° �ݺ�");
		}
		
		//��ø for��
		for(int i = 0; i<10; i++) {
			System.out.println("## �ܺ� �ݺ���"+i);
			for(int j=0; j<10; j++) {
				System.out.println("�ܺ�"+i+"�� ���� ���� �ݺ���"+j);
			}
		}
		//������ ����ϱ�(2~9��)
		for(int a = 2; a<10; a++) {
			for(int b=1; b<10; b++) {
				System.out.println(a+" x "+b+" = "+a*b);
				// = System.out.printf("%d x %d = %d\n", a, b, a*b)
			}
		}
		int j = 2;
		while(j<10) {
			int i = 1;
		while(i<10) {
			System.out.printf("%d x %d = %d\n", j, i, j*i);
			i++;
		} j++;
		}
		for(int a = 2; a<10; a++) {
			for(int b = 1; b<10; b++) {
				System.out.printf("%d x %d = %d\t", a, b, a*b);
			} System.out.println();
		} 
		System.out.println();
		for	(int y = 1; y<10; y++) {
			for(int z = 2; z<10; z++) {
				System.out.printf("%d x %d = %d\t", z, y, z*y);
			} System.out.println();
		}
	}

}
