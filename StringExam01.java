package com.kh.project.model.vo;

import java.util.StringTokenizer;

public class StringExam01 {
	public String str = "Hello";	
	//String 클래스의 기본 문자열 사용
	public void method01() {
		String str = "Hello";	//문자열 값을 초기화한 이후에는 수정 불가능
		System.out.println(str);	//문자열 출력
		System.out.println(System.identityHashCode(str));	//str에 저장된 객체 주소 출력
		
		//str 객체의 값이 변경되는게 아나라 새로운 객체를 만들어서 주소만 바꿔서 사용
		str = "안녕하세요";	//문자열 값 변경
		System.out.println(str);
		System.out.println(System.identityHashCode(str));	//str에 저장된 객체 주소 출력
		str = str + " 반갑습니다";	//문자열 이어쓰기
		System.out.println(str);	//문자열 출력
		System.out.println(System.identityHashCode(str));	//str에 저장된 객체 주소 출력
		
		//서로 다른 string 객체의 문자열이 같은 경우 주소가 같음 - 하나의 문자열을 저장해서 같은 주소를 저장해서 사용
		str = "Hello";
		System.out.println(System.identityHashCode(str));	//str에 저장된 객체 주소 출력
		String str2 = "Hello";
		System.out.println(System.identityHashCode(str));	//str에 저장된 객체 주소 출력
	}
	
	//String 클래스의 메소드 사용
	public void method02() {
		String str1 = "Hello";
		// 1. 특정 위치(인덱스)의 문자 한 개 추출
		System.out.println(str1.charAt(4));	//o
		// 2. 특정 문자의 위치(인덱스) 알아내기
		System.out.println(str1.indexOf('e'));	//1
		/* 3. 문자열 길이 구하기
		 * 배열을 사용할 때는 배열이 필드여서 ()를 안 붙여도 되지만 
		 * Sting은 메소드로 인식해 ()를 붙여서 사용해야함.
		 */
		System.out.println(str1.length());	//5
		// 4. 문자열 비교하기
		System.out.println(str1 == "Hello");	//각 참조변수에 있는 주소 비교
		System.out.println(str1.equals("Hello"));	//실제 문자열 비교
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(this.str));
		System.out.println(System.identityHashCode("Hello"));
		System.out.println(str1.equalsIgnoreCase("hello"));	//대소문자 구분없이 비교
		// 5. 문자열 치환 - 특정 문자열을 찾아서 특정 문자열로 변경한 결과값을 반환 
			// 반환  : 실제 안에 있는 값은 변경X
		System.out.println(str1);	//Hello
		System.out.println(str1.replace("He", "Ba")); 	//Ballo
		System.out.println(str1);	//Hello - 객체에 저장되어 있는 값은 변경 안됨
		str1 = str1.replace("H", "B"); //변경된 값을 저장하려면 대입연산자를 써서 대입해줘야함
		System.out.println(str1);	//Bello
		// 6. 대문자로 변환된 값 반환
		System.out.println(str1.toUpperCase());	//BELLO
		System.out.println(str1);	//Bello
		// 7. 소문자로 변환된 값 반환
		System.out.println(str1.toLowerCase());	//bello
		System.out.println(str1);	//Bello
		// 8. 특정 구분자를 기준으로 문자열 분할
		String str2 = "Apple, Orange, Strawberry";
		System.out.println(str2);
		String [] arr = str2.split(", "); //()안에 어떤 기준으로 분할할건지
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
			//향상된 for문
		for(String tmp : arr) {	//향상된 for문 : 배열이 끝날때까지 반복 / 배열의 전체 내용을 작업할때 사용
			System.out.println(tmp);
			if(tmp.equals("Orange"))
				break;
			}
		
		}
	
		//String Buffer 클래스
		public void method03() {
		StringBuffer sb1 = new StringBuffer();	//참조변수  생성 및 객체 생성
		System.out.println(sb1);	//아무것도 출력 안 됨 - sb객체 안에 있는 문자열 출력
		System.out.println(sb1.capacity());	//16 - sb1 객체 버퍼의 크기 출력
		
		StringBuffer sb2 = new StringBuffer(10);	//객체 생성시 정수형태로 버퍼크기 지정
		System.out.println(sb2);	//아무것도 출력 안됨 -  sb2객체 안에 있는 문자열 출력
		System.out.println(sb2.capacity());	//10 - sb2 객체 버퍼의 크기 출력(지정한 크지만큼 공간 만들어짐)
		
		StringBuffer sb3 = new StringBuffer("안녕하세요"); //객체 생성시 문자열 바로 입력
		System.out.println(sb3);	//아무것도 출력 안됨 -  sb2객체 안에 있는 문자열 출력
		System.out.println(sb3.capacity());	//21 - sb3 객체 버퍼의 크기 출력(저장된 문자열 5개+16개 문자 저장공간 만들어짐)
		
			//객체에 값 추가 - append (맨 뒤에 넣기)
		System.out.println("sb3 객체 주소 : "+sb3.hashCode());	//sb3 객체의 주소 : 366712642
		System.out.println("sb3 객체 크기 : "+sb3.capacity());	//21
		System.out.println("sb3 글자 개수 : "+sb3.length());	//5
		sb3.append(" 반갑습니다.");	//현재 들어있는 데이터 뒤에 문자열을 추가
		System.out.println(sb3);	//안녕하세요 반갑습니다.
		System.out.println("sb3 객체 주소 : "+sb3.hashCode());	//sb3 객체의 주소 : 366712642
		System.out.println("sb3 객체 크기 : "+sb3.capacity());	//21 (16문자 공간안에 " 반갑습니다." 넣음) - 버퍼크기 그대로
		System.out.println("sb3 글자 개수 : "+sb3.length());	//12 - 글자개수만 늘어남
		sb3.append(" 모두모두 열공하세요~!!");
		System.out.println(sb3);	//안녕하세요 반갑습니다. 모두모두 열공하세요~!!
		System.out.println("sb3 객체 주소 : "+sb3.hashCode());	//sb3 객체의 주소 : 366712642
		System.out.println("sb3 객체 크기 : "+sb3.capacity());	//44 - 버퍼크기 자동으로 조정됨
		System.out.println("sb3 글자 개수 : "+sb3.length());	//26
			
			//객체에 값 삽입 - insert (중간에 넣기)
		sb3.insert(0, "여러분 ");	//9번 인덱스에 "여러분" 문자열 삽입
		System.out.println(sb3);	//여러분 안녕하세요 반갑습니다. 모두모두 열공하세요~!
		
			//객체의 값 삭제 - delete
		sb3.delete(4, 10);	//4번 인덱스부터 9번 인덱스까지 문자열 삭제
		System.out.println(sb3);	//여러분 반갑습니다. 모두모두 열공하세요~!!
		}
		
		//StringBuilder 클래스
		public void method04() {
			StringBuilder sb1 = new StringBuilder();
			System.out.println(sb1);	//아무 값 출력 안 됨
			System.out.println(sb1.capacity());	//16
			
			StringBuilder sb2 = new StringBuilder(10);
			System.out.println(sb2);	//아무 값 출력 안 됨
			System.out.println(sb2.capacity());	//10
			
			StringBuilder sb3 = new StringBuilder("안녕하세요");
			System.out.println(sb3);	//안녕하세요
			System.out.println(sb3.capacity());	//21
			
			sb3.append(" 반갑습니다.");
			System.out.println(sb3);
			sb3.insert(0, "여러분 ");
			System.out.println(sb3);
			sb3.delete(4, 10);
			System.out.println(sb3);
		}

		//StringTokenizer 클래스
		public void method05() {
			String str = "AA|BB|CC|DD|EE|FF|GG";
			//String[] arr = new String[???];	//배열 값을 모를때
			StringTokenizer st = new StringTokenizer(str,"|");
			System.out.println(st.countTokens());	
			String[] arr = new String[st.countTokens()];
			//System.out.println(st.nextToken());	//AA
//			while(st.hasMoreTokens()) {	//반복문을 사용해 모든 값 출력
//				System.out.println(st.nextToken());
//			}
			
			int i = 0;
			while(st.hasMoreTokens()) {	//반복문을 사용해 모든 값 출력
				//System.out.println(st.nextToken());
				arr[i] = st.nextToken();
				//System.out.println(arr[i]);	아래 for문과 같음
				i++;
			}
			
			for(int j= 0; j<arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
}
