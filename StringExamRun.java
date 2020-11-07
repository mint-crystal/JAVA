package com.kh.project.run;

public class StringExamRun {

	public static void main(String[] args) {
		String s1 = "Hello";
		System.out.println(System.identityHashCode(s1));
		s1 = "hihi";
		System.out.println(System.identityHashCode(s1));
		String ss1 = new String("¾È³ç");
		System.out.println(System.identityHashCode(ss1));
		ss1 = "bye";
		System.out.println(System.identityHashCode(ss1));
	}

}
