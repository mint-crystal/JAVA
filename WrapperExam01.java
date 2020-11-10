package com.kh.project.model.vo;

import java.sql.Wrapper;

public class WrapperExam01 {
	//Wrapper w = new Wrapper();
	//String을 기본 자료형으로 바꾸기
	public void method01() {
	byte b = Byte.parseByte("1");
	short s = Short.parseShort("2");
	int i = Integer.parseInt("3");
	long l = Long.parseLong("4");
	float f = Float.parseFloat("0.1");
	double d = Double.parseDouble("0.2");
	boolean bool = Boolean.parseBoolean("true");
	char c = "abc".charAt(0);
	
	System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + bool + " " + c);
	}
	
	//기본 자료형을 String으로 바꾸기
	public void method02() {
		String b = Byte.valueOf((byte)1).toString();
		String s = Short.valueOf((short)2).toString();
		String i = Integer.valueOf(3).toString();
		String l = Long.valueOf(4L).toString();
		String f = Float.valueOf(0.1f).toString();
		String d = Double.valueOf(0.2).toString();
		String bool = Boolean.valueOf(true).toString();
		String ch = Character.valueOf('a').toString();
		
		System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + bool + " " + ch);
	}
}
