package com.kh.exam02.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.exam02.model.vo.Student;

public class IORun {

	public static void main(String[] args) {
		//Student st : Student 클래스의 참조변수를 생성
		// = new Student() : Student 객체 생성 후 주소를 참조변수에 저장
		Student st = new Student("홍길동",20,"01012341234","서울시 종로구");
		//객체의 각 필드 내용 출력
		System.out.println(st.toString());
		
		//객체를 파일로 저장
			//파일 출력 스트림, 객체 출력 보조 스트림에 대한 참조변수 생성
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		//파일 입출력시 예외 발생할 수 있기 때문에 반드시 예외처리를 해줘야 함
		try {
			//파일 출력 스트림 객체 생성(주 스트림 : 실제 톨로를 만들어주는 스트림)
			fos = new FileOutputStream("C:\\iotest\\student.txt");
			//객체 출력 보조스트림 객체 생성
			oos = new ObjectOutputStream(fos);
			
			//보조스트림을 이용해서 객체를 파일로 쓰기
			oos.writeObject(st);
			System.out.println("저장완료");
		} catch (IOException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//파일에 저장된 객체 읽어오기
			//파일 입력 스트림, 객체 입력 보조 스트림 참조변수 생성
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		//읽어온 객체를 저장할 참조변수 생성
		Student inSt = null;
		try {
			fis = new FileInputStream("C:/iotest/student.txt");
			ois = new ObjectInputStream(fis);
			
			inSt = (Student) ois.readObject();
			System.out.println(inSt.toString());
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("예외 발생");
			//e.printStackTrace();
		}finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
