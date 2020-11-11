package com.kh.project.model.vo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateExam01 {
	//Date 클래스
	public void method01() {
		Date dt = new Date();
		System.out.println(dt);	//dt객체의 참조변수로 가져옴
		String dt1 = dt.toString(); //문자열
		
		System.out.println(dt.toString());	//문자열 형태로 가져옴
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");	
											//hh를 대문자(HH)로 쓰면 17시(24시로 계산)
		System.out.println(sdf.format(dt));
	}
	
	//Calendar 클래스
	public void method02() {
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1); //MONTH값이 0월부터 나와서 +1해야함
		
		LocalDateTime ldt = LocalDateTime.now();	//static 메소드
		System.out.println(ldt);	//년월일시간 출력
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);	//날짜 출력
		
		ld = LocalDate.of(1992, 4, 11);	//원하는 날짜로 변경
		System.out.println(ld);
	}
	
	//Formatter 클래스
	public void method03() {
			Formatter f = new Formatter(System.out);
			f.format("%d %f %s 로 출력할 서식 지정", 10, 3.5, "Hello");
	}
}
