package com.crystal.exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionExam {

	public static void main(String[] args) {
		System.out.println("---------- Vactor ----------");
		
		//Vector ��ü ����
		Vector vec = new Vector();
		
		//������ �߰�
		vec.add(10);
		vec.add(5);
		vec.add(20);
		System.out.println(vec);	//[10, 5, 20]
		vec.add("Hello");
		System.out.println(vec);	//[10, 5, 20, Hello]
		
		//������ ����
		vec.add(2, 25);
		System.out.println(vec);	//[10, 5, 25, Hello]
		
		//������ ���
		System.out.println(vec.get(0));	//10
		for(int i = 0; i<vec.size(); i++) {
			System.out.println("vec�� "+(i+1)+"��° �� : "+vec.get(i));
		}
		
		//������ ����
		vec.set(4, 30);
		System.out.println(vec);	//[10, 5, 25, 20, 30]
		
		//������ ����
		Collections.sort(vec);		//������������ ����
		System.out.println(vec);	//[5, 10, 20, 25, 30]
		Collections.reverse(vec); 	//������������ ����
		System.out.println(vec);	//[30, 25, 20, 10, 5]
		
		//������ ����
		vec.remove(2);
		System.out.println(vec);	//[30, 25, 10, 5]
		
		//��ü �ʱ�ȭ
		vec.clear();
		System.out.println(vec);	//[]
		
//		---------------------------------------------
		
		System.out.println("---------- LinkedList ----------");
		
		//LinkedList ��ü����
		LinkedList list = new LinkedList();
		
		//������ �߰�
		list.add(20);
		list.add(4);
		list.add(60);
		System.out.println(list);	//[20, 4, 60]
		
		//������ ����
		list.add(1, 10);
		System.out.println(list);	//[20, 10, 4, 60]
		list.addFirst(25);
		System.out.println(list);	//[25, 20, 10, 4, 60]
		list.addLast(30);
		System.out.println(list);	//[25, 20, 10, 4, 60, 30]
		
		//������ ���
		System.out.println(list.get(3));		//4
		System.out.println(list.getFirst());	//25
		System.out.println(list.getLast());		//30
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+1+"��° �� : "+list.get(i));
		}
		
		//������ ����
		list.set(4, 35);
		System.out.println(list);	//[25, 20, 10, 4, 35, 30]
		
		//������ ����
		Collections.sort(list);		//�������� ����
		System.out.println(list);	//[4, 10, 20, 25, 30, 35]
		Collections.reverse(list);	//�������� ����
		System.out.println(list);	//[35, 30, 25, 20, 10, 4]
		
		//������ ����
		list.remove(3);
		System.out.println(list);	//[35, 30, 25, 10, 4]
		list.removeFirst();			
		System.out.println(list);	//[30, 25, 10, 4]
		list.removeLast();
		System.out.println(list);	//[30, 25, 10]
		
		//�ʱ�ȭ
		list.clear();
		System.out.println(list);	//[]
		
//		---------------------------------------------
		
		System.out.println("---------- HashSet ----------");
		
		//HashSet ��ü ����
		//HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet();
		
		//Set�� ������ �߰�
		hs.add(10);
		hs.add(5);
		hs.add(15);
		System.out.println(hs);	//[5, 10, 15]
								//LinkedHashSet ���� ���� ������ ������� ��� - [10, 5, 15]
		
		//�ߺ���� ����
		hs.add(10);
		System.out.println(hs);	//[5, 10, 15] - �ߺ� ��� ����X. ���� �� ��
		
		/*	Set ������ ���
		 * 	- �ε����� ���� ������ ���� �����ؼ� ����� �� ����
		 *  - Iterator �̿��ؼ� ������ ���
		 */
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//������ ����
		hs.remove(10);	//�ε����� ���� ������ ���� ���� �־� ����
		System.out.println(hs);	//[5, 15]
		
		//�ʱ�ȭ
		hs.clear();
		System.out.println(hs);	//[]
		
		//Set�� �̿��� ����Ʈ�� �ߺ��� �����͸� ����
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add(5);
		list2.add(20);
		list2.add(10);
		list2.add(20);
		System.out.println("����Ʈ ������ : "+list2);		//[10, 5, 20, 10, 20]
		System.out.println("�� ������ : "+hs);	//[]
		hs.addAll(list2);
		System.out.println("����Ʈ �߰� �� �� ������ : "+hs);	//[20, 5, 10]
		list2.clear();
		System.out.println("����Ʈ ������ : "+list2);
//		list2.addAll(hs);
//		System.out.println("����Ʈ ������ : "+list2);		//[20, 5, 10]
		it = hs.iterator();
		while(it.hasNext()) {
			list2.add(it.next());	//set�� �����͸� �տ������� �ϳ��� ������ list�� �߰�
//			//Set �����͸� �����ؼ� ����� ��
//			int tmp = (int)(it.next())+100;
//			list2.add(tmp);
//			list2.add((int)(it.next())+100);
		}
		System.out.println("����Ʈ ������ : "+list2);
		
//		---------------------------------------------
		
		System.out.println("---------- HashMap ----------");
		
		//HashMap ��ü ����
		//HashMap map = new HashMap();
		Hashtable map = new Hashtable();
		
		//������ �߰� - put(Ű, ��)
		map.put("name", "ȫ�浿");
		map.put("age", 20);
		map.put("Ű", 17.5);
		map.put("1", 10);
		System.out.println(map);	//{1=10, Ű=17.5, name=ȫ�浿, age=20}
		
		//Ű�� �̿��� ������ ���
		System.out.println(map.get("age"));		//20
		System.out.println(map.get("name"));	//ȫ�浿
		
		//�ߓ��� Ű�� �����͸� �߰�
		map.put("1", 100);
		System.out.println(map);	//{1=100, Ű=17.5, name=ȫ�浿, age=20}
		
		//Ű�� Set���·� ��ȯ
		System.out.println(map.keySet());	//[1, Ű, name, age]
		
		//���� Collections ���·� ��ȯ
		System.out.println(map.values());	//[100, 17.5, ȫ�浿, 20]
		
		//������ ����
		map.remove("Ű");
		System.out.println(map);	//{1=100, name=ȫ�浿, age=20}
		
		//�ʱ�ȭ
		map.clear();
		System.out.println(map);
		
//		---------------------------------------------
		
		System.out.println("---------- Properties ���� ----------");
		
		//Properties ��ü ����
		Properties prop = new Properties();
		try {
			prop.load(new FileReader("resources/windows.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ü�� : "+prop.get("OS"));
		System.out.println("�޸� : "+prop.get("RAM"));
		System.out.println("�ý��� ���� : "+prop.get("System"));
		
//		---------------------------------------------
		
		System.out.println("---------- Tree Set----------");
		
		//��ü ����
		TreeSet tree = new TreeSet();
		
		//������ �߻� - ������������ �ڵ� ����
		tree.add(10);
		tree.add(5);
		tree.add(20);
		System.out.println(tree);	//[5, 10, 20]
		tree.add(1);
		System.out.println(tree);	//[1, 5, 10, 20]
		tree.add(15);
		System.out.println(tree);	//[1, 5, 10, 15, 20]
		
		//�����ͻ��
		System.out.println(tree.first());	//1
		System.out.println(tree.last());	//20
		it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//������ ����
		tree.remove(20);
		System.out.println(tree);	//[1, 5, 10, 15]
		
		//�ʱ�ȭ
		tree.clear();
		System.out.println(tree);
		
//		---------------------------------------------
		
		System.out.println("---------- Tree Map----------");
		
		//��ü ����
		TreeMap tm = new TreeMap();
		//�������� Ű(Key)�� �������� ������ ��� TreeMap Ŭ������ �����ϰ� ����� �� ����
		
		//������ �߰�
		tm.put("�̸�", "ȫ�浿");
		tm.put("age", 20);
		tm.put("Ű", 156.7);
		tm.put("t", 10);
		tm.put("4", 40);
		tm.put("1", 30);
		tm.put("B", 20);
		System.out.println(tm);
		/*	{1=30, 4=40, B=20, age=20, t=10, �̸�=ȫ�浿, Ű=156.7}
		 * Ű�� �������� ����
		 * ���� ���� : ����>���ĺ� �빮��>���ĺ� �ҹ���>�ѱ�
		 */
		
		//������ ���
		System.out.println(tm.get("t"));	//10
		
		//������ ����
		tm.put("B", 50);
		System.out.println(tm);
		
		//Ű�� Set ���·� ��ȯ
		System.out.println(tm.keySet());	//[1, 4, B, age, t, �̸�, Ű]
		
		//�����͸� Collections ���·� ��ȯ
		System.out.println(tm.values());	//[30, 40, 50, 20, 10, ȫ�浿, 156.7]
		
		//������ ����
		tm.remove("4");
		System.out.println(tm);
		
		//�ʱ�ȭ
		tm.clear();
		System.out.println(tm);
		
//		---------------------------------------------
	
		System.out.println("---------- Stack ----------");
		
		//��ü ����
		Stack st = new Stack();
		
		//������ �߰�
		st.push(10);
		st.push(5);
		st.push(20);
		System.out.println(st);	//[10, 5, 20]
		
		//������ ��� - peek() ���� ���� �����͸� �������� �ʰ� Ȯ���� �� ����
		System.out.println(st.peek());	//20
		System.out.println(st.peek());	//20
		System.out.println(st.peek());	//20
		System.out.println(st.peek());	//20
		System.out.println(st.peek());	//20
		System.out.println(st);			//[10, 5, 20]
		
		//������ ��� - pop() ���� ���������� �����͸� �ϳ��� ������(���� �����ʹ� ������)
		System.out.println(st.pop());	//20
		System.out.println(st.pop());	//5
		System.out.println(st.pop());	//10
		System.out.println(st);			//[]
		int size = st.size();
		for(int i = 0; i<size; i++) {
			System.out.println(st.pop());
		}
		System.out.println(st);
		
//		---------------------------------------------
	
		System.out.println("---------- Queue ----------");
		
		//��ü ����
		Queue que = new LinkedList();
		
		//������ �߰�
		que.offer(10);
		que.offer(5);
		que.offer(15);
		System.out.println(que);	//[10, 5, 15]
		
		//������ ��� - peek() ���� �տ� �ִ� ������ Ȯ��
		System.out.println(que.peek());	//10
		
		//������ ��� - poll() ���� �տ� �ִ� �����ͺ��� ������� ������(���� �����ʹ� ������)
		System.out.println(que.poll());	//10
		System.out.println(que.poll());	//5
		System.out.println(que.poll());	//15
		System.out.println(que);		//[]
	}

}
