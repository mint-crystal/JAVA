package kh.project1.test1;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr); //�迭�� �ּҰ� ���. [I@15db9742
//		
//		/*�ʱⰪ ������ �� ���� ��(���� �ϰ� ����Ҷ�)
//		�ʱ� ��  : boolean - false, char - \u0000
//		������ - 0 , �Ǽ��� - 0.0, ������ - null*/
//		
//		//for���� ����� �迭
//		int[] arr = new int[5];
//		for(int i = 0; i<5; i++) {
//			arr[i] = (i+1)*10;
//		}
//		for(int i = 0; i<5; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int[] arr1 = new int[100];
//		for(int i = 0; i<arr1.length; i++) { 
//			//arr1.length = �迭�� ũ�⸸ŭ �˾Ƽ� �ݺ����� ����
//			arr1[i] = (i+1)*10;
//		}
//		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		
//		//��Ģ�� ���� �迭 �Է¹ޱ�
//		String [] cClass = new String[5];
//		Scanner scan = new Scanner(System.in);
//		for(int i = 0; i<cClass.length; i++) {
//			System.out.print("�̸� �Է� : ");
//			cClass[i] = scan.next();
//		}
//		System.out.println("## C������ �л���� ##");
//		for(int i=0; i<cClass.length; i++){
//			System.out.println("�̸� : "+cClass[i]);
//		}
//		System.out.println("�츮 ���� �ټ���° �л���"+cClass[4]+"�� �Դϴ�."); //���� �����ͼ� ���
//		cClass[4] = "�̼���";
//		System.out.println("�츮 ���� �ټ���° �л���"+cClass[4]+"�� �Դϴ�."); //�� ������
//		
//		int[] arr2 = {10, 20, 30, 40, 50};
//		//arr2 = {20, 30, 40, 50, 60}	-������ ó�� �ʱ�ȭ�Ҷ��� �Ѳ����� �� ���𰡴�
//		//for���� �̿��� �ʱⰪ�� �ٲٱ�
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println("�ʱ� �� : "+arr2[i]);
//		}
//		for(int i=0; i<arr2.length; i++){
//			arr2[i] = ((i+1)*10)+10;
//		}
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println("����� �� : "+arr2[i]);
//		}
//		
//		//5���� ���� �Է¹޾� ���� ���ϴ� ���α׷� �����(�迭�̿�)
//		Scanner sc = new Scanner(System.in);
//		int[] arr0 = new int[5];
//		int sum = 0;
//		for(int i = 0; i<arr0.length; i++) {
//			System.out.print((i+1)+"��° �� �Է� : ");
//			arr0[i] = sc.nextInt();
//			}
//		for(int i = 0; i<arr0.length; i++) {
//			sum+=arr0[i];
//		} 
//		System.out.printf("%d + %d + %d + %d + %d = %d",arr0[0],arr0[1],arr0[2],arr0[3],arr0[4],sum);
		//5���� ���� �Է¹޾� ���� ���ϴ� ���α׷� �����(�迭�̿�) ���2
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		int sum = 0;
		for(int i=0; i<number.length; i++) {
			System.out.print(i+1+"��° �� �Է� : ");
			number[i] = scan.nextInt();
			sum += number[i];
		}
		for(int i = 0; i<number.length; i++) {
			System.out.print(number[i]);
			if(i!=number.length-1) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = "+sum);
//		//������ ����
//			//�Ǽ� ������ ������ ����(0.0<=������ <1.0)
//		System.out.println(Math.random());
//			//(����ȯ)(Math.random()*����+���ۼ�)
//		System.out.println((int)(Math.random()*45+1));
	}

}
