package test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {

	public static void main(String[] args) {
		//TreeSet : 정렬지원
		//Set<String> set = new TreeSet<String>();
		NavigableSet<String> set = new TreeSet<String>(); //내림차순까지 편하게
		set.add("java");
		set.add("python");
		set.add("jsp");
		set.add("python");
		set.add("servlet");
		set.add("python");
		
		//배열 치환 => 요소추가
		String []arr = {"C", "C++", "C#", "kotlin"};
		set.addAll(Arrays.asList(arr)); //위 코드를 한 줄로
		set.forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		//일부분 제거(arr)
		set.removeAll(Arrays.asList(arr));
		set.forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		//내림차순 정렬
//		set = set.descendingSet(); //set 자체를 내림차순으로 변경
//		set.forEach(System.out::println);
//		Iterator<String> it = set.descendingIterator(); //검색 방식을 내림차순으로 변경
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		System.out.println("-----------------------------------------");
		//일부분 추출
		//set.subSet("maven",true, "servlet",true).forEach(System.out::println);
		//set.headSet("servlet").forEach(System.out::println);
		set.tailSet("jsp").forEach(System.out::println);
		
		System.out.println("-----------------------------------------");
		System.out.println("첫 번째 요소 추출 : "+set.first());
		System.out.println("마지막 요소 추출 : "+set.last()); 
		
		System.out.println("-----------------------------------------");
		
	}

}
