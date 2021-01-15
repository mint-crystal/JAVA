package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		//Set set = new Set();	//Set은 인터페이스이기 때문에 생성자를 가질 수 없다. (X)
		//Set set = new HashSet();	//(O)
		//HashSet set = new HashSet();	//뒤의 HashSet이 앞의 HashSet을 따라감 (O)
				//Set과 HashSet을 선언했을 때의 차이 : 사용할 수 있는 메소드가 다름 (api 참조)
		
		Set<String> set = new HashSet<String>();
		set.add("java");
		set.add("python");
		set.add("jsp");
		set.add("python");
		set.add("servlet");
		set.add("python");
		
		//중복 배제
		System.out.println("set의 크기 : "+set.size());
		
		String []arr = {"C", "C++", "C#", "kotlin"};
//		Collection<String> collection = Arrays.asList(arr);
//		set.addAll(collection);
		set.addAll(Arrays.asList(arr)); //위 코드를 한 줄로
		
//		for(String s : set) {
//			System.out.println(s);
//		}
//		
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		//함수형 프로그래밍
//		set.forEach(x->System.out.println(x));
		set.forEach(System.out::println);
		
//		System.out.println("특정요소 포함 여부 : "+set.contains("java"));
		
		System.out.println("-----------------------------------------");
		//set을 배열로 변환
//		Object objs[] = set.toArray();
//		for(int i=0; i<objs.length; i++) {
//			System.out.println(objs[i]);
//		}
		
//		String strArr[] = new String[set.size()];
//		strArr = set.toArray(strArr);
//		for(int i=0; i<strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
		
		
		System.out.println("-----------------------------------------");
		set.remove("python");
		System.out.println(set.isEmpty());
		set.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		set.clear();
		set.forEach(System.out::println);
		System.out.println(set.isEmpty());
		
		System.out.println("-----------------------------------------");
		System.out.println(set.retainAll(Arrays.asList(arr)));
	}

}
