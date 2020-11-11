package com.kh.project.model.vo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class DateExam01 {
	//Date Ŭ����
	public void method01() {
		Date dt = new Date();
		System.out.println(dt);	//dt��ü�� ���������� ������
		String dt1 = dt.toString(); //���ڿ�
		
		System.out.println(dt.toString());	//���ڿ� ���·� ������
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");	
											//hh�� �빮��(HH)�� ���� 17��(24�÷� ���)
		System.out.println(sdf.format(dt));
	}
	
	//Calendar Ŭ����
	public void method02() {
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1); //MONTH���� 0������ ���ͼ� +1�ؾ���
		
		LocalDateTime ldt = LocalDateTime.now();	//static �޼ҵ�
		System.out.println(ldt);	//����Ͻð� ���
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);	//��¥ ���
		
		ld = LocalDate.of(1992, 4, 11);	//���ϴ� ��¥�� ����
		System.out.println(ld);
	}
	
	//Formatter Ŭ����
	public void method03() {
			Formatter f = new Formatter(System.out);
			f.format("%d %f %s �� ����� ���� ����", 10, 3.5, "Hello");
	}
}
