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
		
		//Vector 객체 생성
		Vector vec = new Vector();
		
		//데이터 추가
		vec.add(10);
		vec.add(5);
		vec.add(20);
		System.out.println(vec);	//[10, 5, 20]
		vec.add("Hello");
		System.out.println(vec);	//[10, 5, 20, Hello]
		
		//데이터 삽입
		vec.add(2, 25);
		System.out.println(vec);	//[10, 5, 25, Hello]
		
		//데이터 사용
		System.out.println(vec.get(0));	//10
		for(int i = 0; i<vec.size(); i++) {
			System.out.println("vec의 "+(i+1)+"번째 값 : "+vec.get(i));
		}
		
		//데이터 수정
		vec.set(4, 30);
		System.out.println(vec);	//[10, 5, 25, 20, 30]
		
		//데이터 정렬
		Collections.sort(vec);		//오름차순으로 정렬
		System.out.println(vec);	//[5, 10, 20, 25, 30]
		Collections.reverse(vec); 	//내림차순으로 정렬
		System.out.println(vec);	//[30, 25, 20, 10, 5]
		
		//데이터 삭제
		vec.remove(2);
		System.out.println(vec);	//[30, 25, 10, 5]
		
		//전체 초기화
		vec.clear();
		System.out.println(vec);	//[]
		
//		---------------------------------------------
		
		System.out.println("---------- LinkedList ----------");
		
		//LinkedList 객체생성
		LinkedList list = new LinkedList();
		
		//데이터 추가
		list.add(20);
		list.add(4);
		list.add(60);
		System.out.println(list);	//[20, 4, 60]
		
		//데이터 삽입
		list.add(1, 10);
		System.out.println(list);	//[20, 10, 4, 60]
		list.addFirst(25);
		System.out.println(list);	//[25, 20, 10, 4, 60]
		list.addLast(30);
		System.out.println(list);	//[25, 20, 10, 4, 60, 30]
		
		//데이터 사용
		System.out.println(list.get(3));		//4
		System.out.println(list.getFirst());	//25
		System.out.println(list.getLast());		//30
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+1+"번째 값 : "+list.get(i));
		}
		
		//데이터 수정
		list.set(4, 35);
		System.out.println(list);	//[25, 20, 10, 4, 35, 30]
		
		//데이터 정렬
		Collections.sort(list);		//오름차순 정렬
		System.out.println(list);	//[4, 10, 20, 25, 30, 35]
		Collections.reverse(list);	//내림차순 정렬
		System.out.println(list);	//[35, 30, 25, 20, 10, 4]
		
		//데이터 삭제
		list.remove(3);
		System.out.println(list);	//[35, 30, 25, 10, 4]
		list.removeFirst();			
		System.out.println(list);	//[30, 25, 10, 4]
		list.removeLast();
		System.out.println(list);	//[30, 25, 10]
		
		//초기화
		list.clear();
		System.out.println(list);	//[]
		
//		---------------------------------------------
		
		System.out.println("---------- HashSet ----------");
		
		//HashSet 객체 생성
		//HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet();
		
		//Set에 데이터 추가
		hs.add(10);
		hs.add(5);
		hs.add(15);
		System.out.println(hs);	//[5, 10, 15]
								//LinkedHashSet 했을 때는 저장한 순서대로 출력 - [10, 5, 15]
		
		//중복요소 저장
		hs.add(10);
		System.out.println(hs);	//[5, 10, 15] - 중복 요소 저장X. 값이 안 들어감
		
		/*	Set 데이터 사용
		 * 	- 인덱스가 없기 때문에 직접 접근해서 사용할 수 없음
		 *  - Iterator 이용해서 데이터 사용
		 */
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//데이터 삭제
		hs.remove(10);	//인덱스가 없기 때문에 저장 값을 넣어 삭제
		System.out.println(hs);	//[5, 15]
		
		//초기화
		hs.clear();
		System.out.println(hs);	//[]
		
		//Set을 이용해 리스트에 중복된 데이터를 제서
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add(5);
		list2.add(20);
		list2.add(10);
		list2.add(20);
		System.out.println("리스트 데이터 : "+list2);		//[10, 5, 20, 10, 20]
		System.out.println("셋 데이터 : "+hs);	//[]
		hs.addAll(list2);
		System.out.println("리스트 추가 후 셋 데이터 : "+hs);	//[20, 5, 10]
		list2.clear();
		System.out.println("리스트 데이터 : "+list2);
//		list2.addAll(hs);
//		System.out.println("리스트 데이터 : "+list2);		//[20, 5, 10]
		it = hs.iterator();
		while(it.hasNext()) {
			list2.add(it.next());	//set의 데이터를 앞에서부터 하나씩 가져와 list에 추가
//			//Set 데이터를 가공해서 사용할 때
//			int tmp = (int)(it.next())+100;
//			list2.add(tmp);
//			list2.add((int)(it.next())+100);
		}
		System.out.println("리스트 데이터 : "+list2);
		
//		---------------------------------------------
		
		System.out.println("---------- HashMap ----------");
		
		//HashMap 객체 생성
		//HashMap map = new HashMap();
		Hashtable map = new Hashtable();
		
		//데이터 추가 - put(키, 값)
		map.put("name", "홍길동");
		map.put("age", 20);
		map.put("키", 17.5);
		map.put("1", 10);
		System.out.println(map);	//{1=10, 키=17.5, name=홍길동, age=20}
		
		//키를 이용해 데이터 사용
		System.out.println(map.get("age"));		//20
		System.out.println(map.get("name"));	//홍길동
		
		//중볻된 키의 데이터를 추가
		map.put("1", 100);
		System.out.println(map);	//{1=100, 키=17.5, name=홍길동, age=20}
		
		//키를 Set형태로 변환
		System.out.println(map.keySet());	//[1, 키, name, age]
		
		//값을 Collections 형태로 반환
		System.out.println(map.values());	//[100, 17.5, 홍길동, 20]
		
		//데이터 삭제
		map.remove("키");
		System.out.println(map);	//{1=100, name=홍길동, age=20}
		
		//초기화
		map.clear();
		System.out.println(map);
		
//		---------------------------------------------
		
		System.out.println("---------- Properties 파일 ----------");
		
		//Properties 객체 생성
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
		System.out.println("운영체제 : "+prop.get("OS"));
		System.out.println("메모리 : "+prop.get("RAM"));
		System.out.println("시스템 정보 : "+prop.get("System"));
		
//		---------------------------------------------
		
		System.out.println("---------- Tree Set----------");
		
		//객체 생성
		TreeSet tree = new TreeSet();
		
		//데이터 추사 - 오름차순으로 자동 정렬
		tree.add(10);
		tree.add(5);
		tree.add(20);
		System.out.println(tree);	//[5, 10, 20]
		tree.add(1);
		System.out.println(tree);	//[1, 5, 10, 20]
		tree.add(15);
		System.out.println(tree);	//[1, 5, 10, 15, 20]
		
		//데이터사용
		System.out.println(tree.first());	//1
		System.out.println(tree.last());	//20
		it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//데이터 삭제
		tree.remove(20);
		System.out.println(tree);	//[1, 5, 10, 15]
		
		//초기화
		tree.clear();
		System.out.println(tree);
		
//		---------------------------------------------
		
		System.out.println("---------- Tree Map----------");
		
		//객체 생성
		TreeMap tm = new TreeMap();
		//데이터의 키(Key)를 기준으로 정렬할 경우 TreeMap 클래스를 유용하게 사용할 수 있음
		
		//데이터 추가
		tm.put("이름", "홍길동");
		tm.put("age", 20);
		tm.put("키", 156.7);
		tm.put("t", 10);
		tm.put("4", 40);
		tm.put("1", 30);
		tm.put("B", 20);
		System.out.println(tm);
		/*	{1=30, 4=40, B=20, age=20, t=10, 이름=홍길동, 키=156.7}
		 * 키를 기준으로 정렬
		 * 정렬 기준 : 숫자>알파벳 대문자>알파벳 소문자>한글
		 */
		
		//데이터 사용
		System.out.println(tm.get("t"));	//10
		
		//데이터 수정
		tm.put("B", 50);
		System.out.println(tm);
		
		//키를 Set 형태로 변환
		System.out.println(tm.keySet());	//[1, 4, B, age, t, 이름, 키]
		
		//데이터를 Collections 형태로 변환
		System.out.println(tm.values());	//[30, 40, 50, 20, 10, 홍길동, 156.7]
		
		//데이터 삭제
		tm.remove("4");
		System.out.println(tm);
		
		//초기화
		tm.clear();
		System.out.println(tm);
		
//		---------------------------------------------
	
		System.out.println("---------- Stack ----------");
		
		//객체 생성
		Stack st = new Stack();
		
		//데이터 추가
		st.push(10);
		st.push(5);
		st.push(20);
		System.out.println(st);	//[10, 5, 20]
		
		//데이터 사용 - peek() 가장 위에 데이터를 삭제하지 않고 확인할 수 있음
		System.out.println(st.peek());	//20
		System.out.println(st.peek());	//20
		System.out.println(st.peek());	//20
		System.out.println(st.peek());	//20
		System.out.println(st.peek());	//20
		System.out.println(st);			//[10, 5, 20]
		
		//데이터 사용 - pop() 가장 위에서부터 데이터를 하나씩 꺼내옴(꺼낸 데이터는 삭제됨)
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
		
		//객체 생성
		Queue que = new LinkedList();
		
		//데이터 추가
		que.offer(10);
		que.offer(5);
		que.offer(15);
		System.out.println(que);	//[10, 5, 15]
		
		//데이터 사용 - peek() 가장 앞에 있는 데이터 확인
		System.out.println(que.peek());	//10
		
		//데이터 사용 - poll() 가장 앞에 있는 데이터부터 숟서대로 꺼내옴(꺼낸 데이터는 삭제됨)
		System.out.println(que.poll());	//10
		System.out.println(que.poll());	//5
		System.out.println(que.poll());	//15
		System.out.println(que);		//[]
	}

}
