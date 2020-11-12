package com.kh.project.exam02.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.project.exam02.model.vo.Student001;

public class StudentController {
	public void method01() {
		System.out.println("-------- ArrayList ��ü ������ ��� --------");
		
		//ArrayList ����
		ArrayList<Student001> list = new ArrayList<Student001>();
		
		//����Ʈ�� Student ��ü �߰�
			//��ü�� �����Ͽ� ����Ʈ���� �ּҸ� �����ؼ� �����
		list.add(new Student001(20012,"ȫ�浿",20));
		list.add(new Student001(20011,"��浿",30));
		list.add(new Student001(20013,"��浿",25));
		
	
		/* ����Ʈ ������ Ȯ��
		 *  - ��ü �̸����� �̿��ؼ� ����� �汸 ��ü�� �ּҸ� ����ϰ� ��
		 *  - ��ü �̸������� ����ϸ� �ּҰ��� ��µ�
		 *  - ��ü ���� ���� �����͸� ����ϰ� ���� ��� 
		 *  	-��ü ���ο� toString �޼ҵ带 �������̵����ָ� ��
		 *  	-toString() �޼ҵ�� ���� object�� �޼ҵ�
		 */
		System.out.println(list);	//toString �������̵��ؼ� ����Ҷ�
		System.out.println(list.get(0));	//Student001 Ŭ������ toString() �޼ҵ� ��ȯ�� ���
		System.out.println(list.get(1));	//Student001 Ŭ������ toString() �޼ҵ� ��ȯ�� ���
		System.out.println(list.get(2));	//Student001 Ŭ������ toString() �޼ҵ� ��ȯ�� ���
//		System.out.println(((Student001)list.get(0)).getName()); //toString�� ������ ���� ����ȯ. �ٿ�ĳ����
//		System.out.println(((Student001)list.get(0)).getField());	//toString�� ���� ���
		
		//�ݺ��� ���
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(0).getClassNumber()+"�� �л��� �̸��� "
								+list.get(i).getName()+"�̰�, ���̴� "
								+list.get(i).getAge()+"�� �Դϴ�.");
		}
		
		
		//����Ʈ ������ ����
		list.add(2, new Student001(20014, "�ֱ浿", 28));
		System.out.println(list);
		
		
		//����Ʈ ������ ����
		list.set(1, new Student001(20015,"�̱浿",33));
		System.out.println(list);
		//���� �� ��ü ��� �ʵ� ����
		list.get(0).setAge(21);
		System.out.println(list);
		
		
		//����Ʈ �� Ư�� ��ü ����
		list.remove(2);
		System.out.println(list);
		
		
		//����Ʈ �� ��� ������ ����
		list.clear();
		System.out.println(list);
	}
	
	public void method02() {
		System.out.println("-------- ArrayList ��ü ������ ���� --------");
		ArrayList<Student001> list = new ArrayList<Student001>();
		//����Ʈ�� Student001 ��ü �߰�
		list.add(new Student001(20012, "ȫ�浿" ,20));
		list.add(new Student001(20014, "�̱浿", 27));
		list.add(new Student001(20010, "��浿", 34));
		list.add(new Student001(20015, "�ֱ浿", 29));
		list.add(new Student001(20011, "��浿", 45));
		//����Ʈ ��ü ���� ���
		System.out.println(list);
		
		
		/*	����Ʈ�� ��ü�� ������ ��� �⺻���� ������δ� ������ �ȵ�
		 * 	- Collections.sort() �޼ҵ尡 ������ ���� ������ ã�� �� ���� ����
		 *  - Comparable �������̽��� �ִ� compareTo() �޼ҵ带 �������̵�(������)�ؼ� ���
		 */
		Collections.sort(list);	//Student001���� ���ı��� ������
		System.out.println(list);
		Collections.reverse(list);	//��ü�� ������������ �����س��� reverse ��밡�� - ���� ������ �˼� �־?
		System.out.println(list);
		
	}
}
