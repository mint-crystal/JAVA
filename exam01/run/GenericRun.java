package com.kh.project.exam01.run;

import com.kh.project.exam01.model.vo.GenericExam01;

public class GenericRun {

	public static void main(String[] args) {
//		/* 제네릭 적용 전 클래스 사용
//		 * - 매개변수 생성자 : public GenericExam01(int var1, int var2)
//		 */
//		GenericExam01 ge01 = new GenericExam01(10, 20);	//정상 사용 가능
//		//GenericExam01 ge02 = new GenericExam01(1.5, 2.5);	//오류 발생
//		GenericExam01 ge03 = new GenericExam01('A','B');	//단일문자<=>정수호환가능. 정상 사용가능하나 정수형태 값으로 사용됨
//		//GenericExam01 ge04 = new GenericExam01("Hi", "bye");	//오류발생
//
//		
//		/* 제네릭 적용 후 클래스 사용
//		 * - 클래스 : public class GenericExam01<T>
//		 * - 매개변수 생성자 : public GenericExam01(T var1, T var2)
//		 */
//		GenericExam01<Integer> ge01 = new GenericExam01<Integer>(10, 20);	
//		GenericExam01<Double> ge02 = new GenericExam01<Double>(1.5, 2.5);	
//		GenericExam01<Character> ge03 = new GenericExam01<Character>('A','B');	
//		GenericExam01<String> ge04 = new GenericExam01<String>("Hi", "bye");	
		
		
		/* 제네릭 멀티 파라미터 적용 후 클래스 사용
		 * - 클래스 : public class GenericExam01<T,M>
		 * - 매개변수 생성자 : public GenericExam01(T var1, M var2)
		 */
		GenericExam01<Integer,Integer> ge01 = new GenericExam01<Integer,Integer>(10, 20);	
		GenericExam01<Double,Double> ge02 = new GenericExam01<Double,Double>(1.5, 2.5);	
		GenericExam01<Character,Character> ge03 = new GenericExam01<Character,Character>('A','B');	
		GenericExam01<String,String> ge04 = new GenericExam01<String,String>("Hi", "bye");	
		GenericExam01<Integer, Double> ge5 = new GenericExam01(10, 1.5); //제네릭 타입 생략가능
		GenericExam01<Character, String>ge06;
		ge06 = new GenericExam01('a', "Hello");
		//ge06 = new GenericExam01() //생성자의 매개변수 없이도 사용가능(기본생성자)
		
		GenericExam01<Integer, Double> ge07 = new GenericExam01();
		ge07.var1 = 10;	//정수형으로 사용돼서 값 정상 대입
		//ge07.var1 = 1.5; //정수형 공간에 실수값을 대입하려고해서 에러 발생
		
		/* 제네릭 메소드
		 * - public <A> A method01(A num)
		 */
		System.out.println(ge07.<Integer>method01(10));	//정석
		System.out.println(ge07.method01(10));	//인자 값을 보고 데이터 타입을 알 수 있기 때문에 생략 가능
		System.out.println(ge07.method01(1.5));
		System.out.println(ge07.method01('A'));
	}

}
