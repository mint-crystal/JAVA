package kh.project1.test1;

public class PrintTest {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 3.5;
		
		//print()
		System.out.print(10); //()���� ������ ���ͷ� ���
		System.out.print(3.5);
		System.out.print("Hello");
		
		//println()
		System.out.println(10);
		System.out.println(3.5);
		System.out.println("Hello");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(10+20);
		System.out.println("�ȳ��ϼ���"+"��������~!");
		
		//printf("����� ����"[, ���ڰ�, ...]); ���ȣ�� �������� ǥ��!
		System.out.printf("�ȳ��ϼ���\n ����Ʈ����"); // \n�ڷ� �ٹٲ�
		System.out.printf("����	�ð���..."); //�ٹٲ�X tab����ؼ� ��
		System.out.printf("\\\\����\"�ð���...\n"); //Ư������ ��� - \\����"�ð���... �� ���
		
		//����� ���� �����ͼ� ���ڿ��� ���·� ���
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d�Դϴ�\n" , "ȫ�浿", 20); 
		
		String name = "ȫ�浿";
		int age = 20;
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d�Դϴ�\n" , name, age); 
		System.out.println("�� �̸��� "+name+"�̰�, ���̴� "+age+"�Դϴ�"); //���� ����
		System.out.printf("%d / %o / %x / %c \n", 65,65,65,65); //65 / 101 / 41 / A
		
		String name2 = "ȫ�浿";
		int age2 = 20;
		String tel = "010-1234-1234";
		System.out.printf("�̸�\t: %s\n", name2);
		System.out.printf("����\t: %d\n", age2);
		System.out.printf("��ȭ��ȣ\t: %s\n", tel);
		System.out.println("�ݾ��� \\35,000�� �Դϴ�");
		System.out.println("�̰��� ū����ǥ\"�Դϴ�");
				
	}

}
