package com.kh.project.exam01.model.vo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExam01 {
	public void method01() {
		System.out.println("------------- ���� �迭 ��� -------------");
		String str = "Hello";	//���� ��� - ������ 1���� ����
		String [] arr = new String[3];	//�迭��� - ������ ���� �� ����
		
		//�迭�� ������ �߰�
		arr[0] = "hihi";
		arr[1] = "bye";
		arr[2] = "hello";
		
		//�迭 �� ������ ���
		System.out.println("arr[0] �� : "+arr[0]);
		System.out.println("arr[1] �� : "+arr[1]);
		System.out.println("arr[2] �� : "+arr[2]);
		
		//�ݺ����� �̿��ؼ� ���
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i+1+"��° �� : "+arr[i]);
		}
		
		//���� �ݺ���
		for(String tmp : arr) {
			System.out.println(tmp);
		}
		
		//���� ũ�⺸�� �� ���� ������ �߰�
		//arr[3] = "hahaha";	//��Ÿ��(Runtime)���� �߻�
		String[] tmpArr = new String[5];
		//�ݴ��
		//String[] = tmpArr= arr;
		//arr = new String[5];
		
		//���� ũ�⸦ Ű���� ���� ���� �迭�� ���� ������ ����
		for(int i = 0; i<arr.length; i++) {
			tmpArr[i] = arr[i];
		}
		//���� ������ ���
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr �� : "+arr[i]);
		}
		//���� ���� �迭 ������ ���
		for(int i = 0; i<tmpArr.length; i++) {
			System.out.println("tmpArr �� : "+tmpArr[i]);
		}
		//������ ����ϴ� �迭 ���������� ���ο� �迭 ����
		arr = tmpArr;
		arr[3] = "extends";
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr �� : "+arr[i]);
		}
		
		//�迭�� �߰��� ������ ����
		//arr[1] = "insert";	//1��° �����Ͱ� ������
		int insertIndex = 1; 	//�����ϰ� ���� ��ġ
		//���� ����� �������� ������ �ε��� �˾Ƴ���
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==null) {
				//������ �����ͺ��� �� ĭ�� �ڷ� �̵�
				for(int j = i; j>insertIndex; j--) {
					arr[j] = arr[j-1];	//null�� ��ġ�� �� �� �����͸� ����
				}
				//������ ������ �Է�
				arr[insertIndex] = "insertDate";
				break;	//������ ������ ã�� �ݺ��� ����
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr ���� �� �� : "+arr[i]);
		}
		
		//�迭 �� ������ ����
		int deleteIndex = 2;
//			//���1
//		for(int i = deleteIndex; i<arr.length; i++) {
//			if(arr[i]==null)
//				break;
//			else if(i == arr.length-1)
//				arr[i] = null;
//			else
//			arr[i] = arr[i+1];
//		}
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println("arr ���� �� �� : "+arr[i]);
//		}
			//���2
		for(int i = deleteIndex; i<arr.length&&arr[i]!=null; i++) {
			if(i == arr.length-1)
				arr[i] = null;
			else
			arr[i] = arr[i+1];
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr ���� �� ��2 : "+arr[i]);
		}
	}
	
	public void method02() {
		System.out.println("------------- ArrayList �⺻ ��� -------------");
		//ArrList ��ü ����
		ArrayList aList1 = new ArrayList(2); //ũ�⸦ �����ϸ鼭 ����Ʈ��ü ���� - ó���� ��������� ������ 2ĭ
		ArrayList aList2 = new ArrayList();	//ũ�⸦ �������� �ʰ� ����Ʈ ��ü ���� - ���������� ������ ó���� 10ĭ��ŭ�� ����(�⺻��) �ڵ� ����
		
		System.out.println(aList1.size());	//����Ʈ �� ������ ����
		System.out.println(aList1);	//����Ʈ �� ����� ��� �����͸� �޸�(,)�� �����ؼ� ���ȣ([])�ȿ� ��� ��������
		System.out.println(aList2.size());
		System.out.println(aList2);
		
		
		//����Ʈ ������ �߰� - ���� ������ ��ġ�� �߰�
		aList1.add(10);			//����Ʈ�� ������ �߰�
		aList1.add("Hello");	//����Ʈ�� ���ڿ� �߰�
		aList1.add(4.7);		//����Ʈ�� �Ǽ��� �߰� - ArrayList(2)��ŭ ��ü�� ������ �� ���Ŀ��� �߰� ���� ����
		System.out.println(aList1);	//[10, Hello, 4.7]
		System.out.println(aList1.size());	//3 - ����Ʈ �� ������ ����
		
		
		//����Ʈ �� ������ ��� - ��ü��.get(�ε���) �޼��� ���
		System.out.println("[0]�� �ε��� �� : "+aList1.get(0));	//[0]�� �ε��� �� : 10
		System.out.println("[1]�� �ε��� �� : "+aList1.get(1));	//[1]�� �ε��� �� : Hello
		System.out.println("[2]�� �ε��� �� : "+aList1.get(2));	//[2]�� �ε��� �� : 4.7
		//�ݺ��� Ȱ��
		for(int i = 0; i<aList1.size(); i++) {
			System.out.println(i+1+"��° �� : "+aList1.get(i));
			/*1��° �� : 10
			2��° �� : Hello
			3��° �� : 4.7*/
		}
		//���� �ݺ���
		for(Object tmp : aList1) {	//��� �ڷ����� ������ ���� �޾��ֱ� ���� ���� object
			System.out.println(tmp);
			/*  10
				Hello
				4.7  */
		}
		
		
		//����Ʈ�� ������ ���� - �߰� ��ġ�� �� ����
		aList1.add(1, "�ȳ�");		//1��° �ε����� "�ȳ�" ���ڿ� ����
		System.out.println(aList1);	//[10, �ȳ�, Hello, 4.7]
		
		
		//����Ʈ �� ������ ����
		aList1.set(1, "�ȳ��ϼ���");	//1��° �ε��� ���� "�ȳ��ϼ���"�� ����
		System.out.println(aList1);	//[10, �ȳ��ϼ���, Hello, 4.7]
		
		
		/*����Ʈ �� Ư�� �����Ϳ� ���� �ε��� �� Ȯ�� 
		 * �����͸� �� ã���� -1 ��ȯ
		 * ã���� �ش� �ε��� ���� ��ȯ
		 */
		System.out.println(aList1.indexOf("Hello"));	//2
		System.out.println(aList1.indexOf("hi"));		//-1
		
		
		/*����Ʈ �� Ư�� �������� ���� ���� �˻�
		 * �����Ͱ� ������ true ��ȯ
		 * �����Ͱ� ������ false ��ȯ
		 */
		System.out.println(aList1.contains("Hello"));	//true
		System.out.println(aList1.contains("hi"));		//false
		
		
		//����Ʈ �� Ư�� ������ ����
		aList1.remove(2);	//2�� �ε��� �� ����
		System.out.println(aList1);	//[10, �ȳ��ϼ���, 4.7]
		System.out.println(aList1.get(2)); //4.7 - ���� ������ 3�� �ε��� ���� 2�� �ε����� ��
		
		
		//����Ʈ �� ��� ������ ����
		aList1.clear();
		System.out.println(aList1);	//[]
		
		aList1.add(10);
		aList1.add(20);
		aList1.add(30);
		aList1.add(40);
		aList1.add(50);
		System.out.println(aList1);	//[10, 20, 30, 40, 50]
		
		aList1.remove((Integer)20);
		System.out.println(aList1);	//[10, 30, 40, 50]
		
		aList2.add(10);
		aList2.add(40);
		//aList1.removeAll(aList2);
		
		aList1.removeAll(aList1.subList(1, 3));	//(����� ���� ���� �ε���, �� �ε���+1)
		System.out.println(aList1);	//[10, 50]
		
		
		//ArrayList ��ü ������ �ʱⰪ ����
		ArrayList al = new ArrayList(Arrays.asList("Hello", 10, 1.5, '��'));
		System.out.println("al �� : "+al);	//al �� : [Hello, 10, 1.5, ��]
		
		ArrayList al2 = new ArrayList(al);
		System.out.println("al2 �� : "+al2);	//al2 �� : [Hello, 10, 1.5, ��]
	}

	public void method03() {
		System.out.println("------------- ArrayList ���� -------------");
		ArrayList list = new ArrayList();
		
		//����Ʈ�� ������ �߰� - �߰��� ������� ����Ǿ� ����
		list.add(55);
		list.add(23);
		list.add(68);
		list.add(43);
		list.add(22);
		System.out.println(list);	//[55, 23, 68, 43, 22]
		
		
		//������ ����
		Collections.sort(list);		//�⺻ �������� ����
		System.out.println(list);	//[55, 23, 68, 43, 22]
		Collections.reverse(list);	//�������� ���� ���1
		//list.sort(Collections.reverseOrder());	////�������� ���� ���2 - �ַ� ��ü�� ����Ҷ�
		System.out.println(list);	//[22, 23, 43, 55, 68]

	}
}
