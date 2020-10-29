package kh.project1.test1;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		//���� ���� - ��ü�� �ּҰ��� ������ �ͼ� ����
		int[] arr1 = {10, 20, 30, 40, 50}; //int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = arr1;
		arr1 [0] = 100;
		System.out.println("arr1 �ּ� : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}System.out.println();
		System.out.println("arr2 �ּ� : "+arr2); //���� �ּ� ���
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		//���� ���� - ���ο� �迭 ��ü�� �����Ͽ� ���� �迭�� �����͸� ����
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = new int[5];
				//for�� ���
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr1[0] = 100; //���� �ٸ� ������ ������ �Ǿ��ֱ� ������ arr2[0]�� ���� �� �ٲ�
		System.out.println("arr1 �ּ� : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 �ּ� : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
				//[2]���� ����
		for(int i = 2; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr1 �ּ� : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 �ּ� : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
				//arr1[2]���� 3�� ����
		//int[] arr1 = new int[] {10, 20, 30, 40, 50};
		//int[] arr2 = new int[3]; //3���� �ٲٸ� �ڿ� ���ڸ��� ������� 3���� ���� ����
		for(int i = 2; i<arr1.length; i++) {
			arr2[i-2] = arr1[i];
		}
		System.out.println("arr1 �ּ� : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 �ּ� : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			//System.arraycopy(�����迭, ���� ������ġ, ������ ������ġ, ������ ����);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);  //��ü ������ ����
		System.arraycopy(arr1, 3, arr2, 3, arr1.length-3); //Ư�� ������ ����
			//arr2�� ũ�⸦ ���� �����Ѵ�� 3���� �Ѵٸ� arr2.length�� �������
		System.out.println("arr1 �ּ� : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 �ּ� : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			//Arrays.copyOf(�����迭, ������ ����);
		//arr2 = Arrays.copyOf(arr1, arr1.length); //��ü ������ ����
		//arr2 = Arrays.copyOf(arr1, 3); // Ư�� ������ ����
		arr2 = Arrays.copyOfRange(arr1, 3, 5);
		System.out.println("arr1 �ּ� : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 �ּ� : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			//Arrays.copyOfRange(�����迭, ������ġ, ����ġ+1);
		arr2 = Arrays.copyOfRange(arr1, 3, arr1.length); //Ư�� ������ ����
		arr2 = Arrays.copyOfRange(arr1, 3, 5);
		System.out.println("arr1 �ּ� : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 �ּ� : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			//clone
		arr2 = arr1.clone(); //��ü ������ ����
		System.out.println("arr1 �ּ� : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 �ּ� : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
