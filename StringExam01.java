package com.kh.project.model.vo;

import java.util.StringTokenizer;

public class StringExam01 {
	public String str = "Hello";	
	//String Ŭ������ �⺻ ���ڿ� ���
	public void method01() {
		String str = "Hello";	//���ڿ� ���� �ʱ�ȭ�� ���Ŀ��� ���� �Ұ���
		System.out.println(str);	//���ڿ� ���
		System.out.println(System.identityHashCode(str));	//str�� ����� ��ü �ּ� ���
		
		//str ��ü�� ���� ����Ǵ°� �Ƴ��� ���ο� ��ü�� ���� �ּҸ� �ٲ㼭 ���
		str = "�ȳ��ϼ���";	//���ڿ� �� ����
		System.out.println(str);
		System.out.println(System.identityHashCode(str));	//str�� ����� ��ü �ּ� ���
		str = str + " �ݰ����ϴ�";	//���ڿ� �̾��
		System.out.println(str);	//���ڿ� ���
		System.out.println(System.identityHashCode(str));	//str�� ����� ��ü �ּ� ���
		
		//���� �ٸ� string ��ü�� ���ڿ��� ���� ��� �ּҰ� ���� - �ϳ��� ���ڿ��� �����ؼ� ���� �ּҸ� �����ؼ� ���
		str = "Hello";
		System.out.println(System.identityHashCode(str));	//str�� ����� ��ü �ּ� ���
		String str2 = "Hello";
		System.out.println(System.identityHashCode(str));	//str�� ����� ��ü �ּ� ���
	}
	
	//String Ŭ������ �޼ҵ� ���
	public void method02() {
		String str1 = "Hello";
		// 1. Ư�� ��ġ(�ε���)�� ���� �� �� ����
		System.out.println(str1.charAt(4));	//o
		// 2. Ư�� ������ ��ġ(�ε���) �˾Ƴ���
		System.out.println(str1.indexOf('e'));	//1
		/* 3. ���ڿ� ���� ���ϱ�
		 * �迭�� ����� ���� �迭�� �ʵ忩�� ()�� �� �ٿ��� ������ 
		 * Sting�� �޼ҵ�� �ν��� ()�� �ٿ��� ����ؾ���.
		 */
		System.out.println(str1.length());	//5
		// 4. ���ڿ� ���ϱ�
		System.out.println(str1 == "Hello");	//�� ���������� �ִ� �ּ� ��
		System.out.println(str1.equals("Hello"));	//���� ���ڿ� ��
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(this.str));
		System.out.println(System.identityHashCode("Hello"));
		System.out.println(str1.equalsIgnoreCase("hello"));	//��ҹ��� ���о��� ��
		// 5. ���ڿ� ġȯ - Ư�� ���ڿ��� ã�Ƽ� Ư�� ���ڿ��� ������ ������� ��ȯ 
			// ��ȯ  : ���� �ȿ� �ִ� ���� ����X
		System.out.println(str1);	//Hello
		System.out.println(str1.replace("He", "Ba")); 	//Ballo
		System.out.println(str1);	//Hello - ��ü�� ����Ǿ� �ִ� ���� ���� �ȵ�
		str1 = str1.replace("H", "B"); //����� ���� �����Ϸ��� ���Կ����ڸ� �Ἥ �����������
		System.out.println(str1);	//Bello
		// 6. �빮�ڷ� ��ȯ�� �� ��ȯ
		System.out.println(str1.toUpperCase());	//BELLO
		System.out.println(str1);	//Bello
		// 7. �ҹ��ڷ� ��ȯ�� �� ��ȯ
		System.out.println(str1.toLowerCase());	//bello
		System.out.println(str1);	//Bello
		// 8. Ư�� �����ڸ� �������� ���ڿ� ����
		String str2 = "Apple, Orange, Strawberry";
		System.out.println(str2);
		String [] arr = str2.split(", "); //()�ȿ� � �������� �����Ұ���
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			//���� for��
		for(String tmp : arr) {	//���� for�� : �迭�� ���������� �ݺ� / �迭�� ��ü ������ �۾��Ҷ� ���
			System.out.println(tmp);
			if(tmp.equals("Orange"))
				break;
			}
		
		}
	
		//String Buffer Ŭ����
		public void method03() {
		StringBuffer sb1 = new StringBuffer();	//��������  ���� �� ��ü ����
		System.out.println(sb1);	//�ƹ��͵� ��� �� �� - sb��ü �ȿ� �ִ� ���ڿ� ���
		System.out.println(sb1.capacity());	//16 - sb1 ��ü ������ ũ�� ���
		
		StringBuffer sb2 = new StringBuffer(10);	//��ü ������ �������·� ����ũ�� ����
		System.out.println(sb2);	//�ƹ��͵� ��� �ȵ� -  sb2��ü �ȿ� �ִ� ���ڿ� ���
		System.out.println(sb2.capacity());	//10 - sb2 ��ü ������ ũ�� ���(������ ũ����ŭ ���� �������)
		
		StringBuffer sb3 = new StringBuffer("�ȳ��ϼ���"); //��ü ������ ���ڿ� �ٷ� �Է�
		System.out.println(sb3);	//�ƹ��͵� ��� �ȵ� -  sb2��ü �ȿ� �ִ� ���ڿ� ���
		System.out.println(sb3.capacity());	//21 - sb3 ��ü ������ ũ�� ���(����� ���ڿ� 5��+16�� ���� ������� �������)
		
			//��ü�� �� �߰� - append (�� �ڿ� �ֱ�)
		System.out.println("sb3 ��ü �ּ� : "+sb3.hashCode());	//sb3 ��ü�� �ּ� : 366712642
		System.out.println("sb3 ��ü ũ�� : "+sb3.capacity());	//21
		System.out.println("sb3 ���� ���� : "+sb3.length());	//5
		sb3.append(" �ݰ����ϴ�.");	//���� ����ִ� ������ �ڿ� ���ڿ��� �߰�
		System.out.println(sb3);	//�ȳ��ϼ��� �ݰ����ϴ�.
		System.out.println("sb3 ��ü �ּ� : "+sb3.hashCode());	//sb3 ��ü�� �ּ� : 366712642
		System.out.println("sb3 ��ü ũ�� : "+sb3.capacity());	//21 (16���� �����ȿ� " �ݰ����ϴ�." ����) - ����ũ�� �״��
		System.out.println("sb3 ���� ���� : "+sb3.length());	//12 - ���ڰ����� �þ
		sb3.append(" ��θ�� �����ϼ���~!!");
		System.out.println(sb3);	//�ȳ��ϼ��� �ݰ����ϴ�. ��θ�� �����ϼ���~!!
		System.out.println("sb3 ��ü �ּ� : "+sb3.hashCode());	//sb3 ��ü�� �ּ� : 366712642
		System.out.println("sb3 ��ü ũ�� : "+sb3.capacity());	//44 - ����ũ�� �ڵ����� ������
		System.out.println("sb3 ���� ���� : "+sb3.length());	//26
			
			//��ü�� �� ���� - insert (�߰��� �ֱ�)
		sb3.insert(0, "������ ");	//9�� �ε����� "������" ���ڿ� ����
		System.out.println(sb3);	//������ �ȳ��ϼ��� �ݰ����ϴ�. ��θ�� �����ϼ���~!
		
			//��ü�� �� ���� - delete
		sb3.delete(4, 10);	//4�� �ε������� 9�� �ε������� ���ڿ� ����
		System.out.println(sb3);	//������ �ݰ����ϴ�. ��θ�� �����ϼ���~!!
		}
		
		//StringBuilder Ŭ����
		public void method04() {
			StringBuilder sb1 = new StringBuilder();
			System.out.println(sb1);	//�ƹ� �� ��� �� ��
			System.out.println(sb1.capacity());	//16
			
			StringBuilder sb2 = new StringBuilder(10);
			System.out.println(sb2);	//�ƹ� �� ��� �� ��
			System.out.println(sb2.capacity());	//10
			
			StringBuilder sb3 = new StringBuilder("�ȳ��ϼ���");
			System.out.println(sb3);	//�ȳ��ϼ���
			System.out.println(sb3.capacity());	//21
			
			sb3.append(" �ݰ����ϴ�.");
			System.out.println(sb3);
			sb3.insert(0, "������ ");
			System.out.println(sb3);
			sb3.delete(4, 10);
			System.out.println(sb3);
		}

		//StringTokenizer Ŭ����
		public void method05() {
			String str = "AA|BB|CC|DD|EE|FF|GG";
			//String[] arr = new String[???];	//�迭 ���� �𸦶�
			StringTokenizer st = new StringTokenizer(str,"|");
			System.out.println(st.countTokens());	
			String[] arr = new String[st.countTokens()];
			//System.out.println(st.nextToken());	//AA
//			while(st.hasMoreTokens()) {	//�ݺ����� ����� ��� �� ���
//				System.out.println(st.nextToken());
//			}
			
			int i = 0;
			while(st.hasMoreTokens()) {	//�ݺ����� ����� ��� �� ���
				//System.out.println(st.nextToken());
				arr[i] = st.nextToken();
				//System.out.println(arr[i]);	�Ʒ� for���� ����
				i++;
			}
			
			for(int j= 0; j<arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
}
