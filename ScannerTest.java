package kh.project1.test1;

//Scanner Class ����
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//Scanner ����
		Scanner scan = new Scanner(System.in);
		//���� �Է¹ޱ�
		int num1;
		System.out.print("������ �Է��ϼ��� : "); 
		num1 = scan.nextInt();
		System.out.println("�Է°� : "+num1);
		//�Ǽ� �Է¹ޱ�
		System.out.print("�Ǽ�(float)�� �Է��ϼ��� : ");
		float num2;
		num2=scan.nextFloat(); 
		System.out.println("�Է°� : "+num2);	
		
		System.out.print("�Ǽ�(double)�� �Է��ϼ��� : ");
		double num3;
		num3=scan.nextDouble();
		System.out.println("�Է°� : "+num3);
		//���ڿ� �Է�
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str1;
		str1 = scan.next(); //������ �������� �������� ������ a b��� �Է����� �� ���� �� �κ��� a�� ��µ�
		System.out.println("�Է°� : "+str1);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str2;
		scan.nextLine(); /* �Ʒ��� nextLine ������ �ν��� ����ϱ� ������ ����(����)�� �ޱ� ���� ����
						���� next�� a�� ����Ѵٰ� �����ϸ� ���͸� �Է��ϰ� �Ǿ� buffer�� ���� ���� ���������Ƿ�
						= scan.skip("[\\r\\n]+"); \\r\\n�� ���͸� ����-���Ͱ� ������ skip���Ѷ�
						[]+�� skip�� ���� ����
						\\r\\n�� �ϴ� ���� \r\n���� �Է��ϸ� escape���ڷ� �ν��ϱ� ����
						\r : ���� ���� ������ Ŀ�� �̵�
						\n : ���� ���� �ٷ� Ŀ�� �̵� */
		str2 = scan.nextLine(); 
		System.out.println("�Է°� : "+str2);
		
		//����)�̸�, ����, ��ȭ��ȣ�� �Է¹޾Ƽ� ���
		//�̸� : (�Է�)
		//���� : (�Է�)
		//��ȭ��ȣ : (�Է�)
		//�� �̸��� ??�̰�, ���̴� ??�̰�, ��ȭ��ȣ�� ??�Դϴ�.
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("���� : ");
		int age = scan.nextInt();
		System.out.print("��ȭ��ȣ : ");
		//scan.nextLine(); //�Ʒ� ��ɾ nextLine���� �ϸ� ������ �����ϹǷ� nextLine���� �Է������� ���Ͱ��� �ޱ� ���� ���
		String phone= scan.next();
		System.out.println("�� �̸��� " + name + "�̰�, ���̴� "+age+"�̰�, ��ȭ��ȣ�� "+phone+"�Դϴ�.");
	}

}
