package kh.project1.test1;

public class MethodTest {

	//���1 - �Ű� ���� ���� ��
	public static void func1() {
		System.out.println("func �޼���");
		int num = 10;
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//���2 - �Ű� �� ����
	public static void func1(int num) {
		System.out.println("func �޼���");
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	//���3 - return
	public static int func1(int num) {
		System.out.println("func �޼���");
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		return sum;
	}

	public static int[] func1(int num) {
		System.out.println("func �޼���");
		int[] arr = {10,20,30};
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		System.out.println("func �ȿ� �ִ� �ּ� : " + arr);
		return arr;
	}

	public static void main(String[] args) { //���θ޼ҵ�
		
		System.out.println("���� �޼���");
		//func1(); //�Ű� ���� ���� ��
		
		func1(20); //�Ű����� �Է��Ͽ� ���
		System.out.println(func1(20)); //��� ���� �޾Ƽ� �ٷ� ���
		System.out.println(func1(20)+10); //��� ���� ����
		
		//return�� ����� sum�� ��ȯ
		int sum;
		sum = func1(10);
		System.out.println(sum); 
		
		//�迭 ���� ��ȯ
		int[] sum;
		sum = func1(10);
		System.out.println("���ο��� �޾ƿ� arr �ּ� : "+sum);
		for(int i = 0; i<sum.length; i++) {
			System.out.println(sum[i]);
		}
		
		System.out.println("���� �޼���2"); //func1 ���� �� ���� �޼ҵ�� ���ƿ�
		
	}
	}
