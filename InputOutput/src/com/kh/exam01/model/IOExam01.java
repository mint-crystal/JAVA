package com.kh.exam01.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.activation.MimetypesFileTypeMap;

public class IOExam01 {
	public void method01(){
		System.out.println("------ 새로운 파일 생성하기 ------");
		File file = new File("C:\\iotest\\test01.txt");
		if(!file.exists()) { //exists()=파일이 존재유무 확인
			try {
				file.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다.");
			}
		}
		
		//파일 정보 출력
		System.out.println("파일명 : "+file.getName());
		System.out.println("파일경로 : "+file.getPath());
		System.out.println("파일크기 : "+file.length());
		//파일 종류 확인
		System.out.println("파일종류 : "+ new MimetypesFileTypeMap().getContentType(file));
		//파일 닫기 : 스트림을 생성하지 않았기때문에 닫아주지 않아도 됨
	}

	public void method02() {
		System.out.println("------ 기존 파일 확인하기 ------");
		File file = new File("C:\\iotest\\오로라.jpg");
		if(file.exists()) {
			//파일 정보 출력
			System.out.println("파일명 : "+file.getName());
			System.out.println("파일경로 : "+file.getPath());
			System.out.println("파일크기 : "+file.length());
			//파일 종류 확인
			System.out.println("파일종류 : "+ new MimetypesFileTypeMap().getContentType(file));
		}
		
		
	}

	public void method03() {
		System.out.println("------ 파일 출력 : FileOutputStream ------");
		//파일 출력 스트림 참조 변수 생성
		FileOutputStream fos=null;	//null값을 넣어주는 것을 권장
		try {
			//파일 출력 스트림 객체 생성
			//FileOutputStream안에 읽어오는 기능만 사용가능
				//지정된 이름의 파일이 없으면 새로 생성, 파일이 있으면 덮어쓰기
			//fos = new FileOutputStream("C:\\iotest\\test02.txt"); 
				//지정된 이름의 파일이 없으면 새로 생성, 파일이 있으면 이어쓰기
			//fos = new FileOutputStream(file, true);
			
			//File 객체 생성 후 인자로 넘겨주는 것도 가능 - 파일 관리에 용이함
			//FileOutputStream뿐만 아니라 File 안의 기능들도 사용할 수 있음
			File file = new File("C:\\iotest\\test02.txt");
			fos = new FileOutputStream(file);	//덮어쓰기
			
			
			//파일에 내용 쓰기
				//바이트 기반으로 출력해야하기 때문에 바이트 타입의 데이터를 전달해야함
			fos.write("Hello".getBytes());
			fos.write("12345\n".getBytes());
			fos.write("Welcome".getBytes());
			
			System.out.println("파일 저장 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 저장 실패");
		} catch (IOException e) {
			System.out.println("파일 내용 쓰기 실패");
		}finally {
			//파일 출력 스트림 연결 종료
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("파일 종료 실패");
			}
		}
	}

	public void method04() {
		System.out.println("------ 파일 입력 : FileInputStream ------");
		try(FileInputStream fis = new FileInputStream("C:\\iotest\\test02.txt")) {
			//read() 메소드로 파일 내용 읽어옴
			//매개변수 없는 read() 메소드 : 1byte를 읽어와서 바이트값(아스키코드 값)으로 리턴 
			System.out.println(fis.read()); //첫 글자 H의 아스키코드 값 : 72
			System.out.println(fis.read()); //두 번째 글자 e의 아스키코드 값 : 101
			//char형으로 강제 형변환
			System.out.println((char)fis.read());	// l 출력
			//바이트형태(아스키코드 값)의 데이터를 입력받아서 문자형태로 표현해주는 메소드
			System.out.write(fis.read()); //네 번째 글자 l의 아스키코드값을 가져와서 문자형태로 출력
			System.out.println(); //그 다음 출력할 문자가 없으면 콘솔창에 출력이 안 될 수 있으므로 개행해줌?
								//write를 사용해 버퍼에만 저장된 상태이기 때문에 print를 이용해 출력(한 글자여서)
			
			//읽어온 내용을 배열에 저장
			byte [] buffer = new byte[100];	//입력값을 임시로 저장할 배열 선언
			//입력스트림에 남은 모든 내용을 읽어와 바이트형 배열에 저장
			fis.read(buffer);
			//배열 내용 확인1
			for(int i = 0; buffer[i]!=0; i++) {
				System.out.print((char)buffer[i]);
			}
			//배열 내용 확인2
			System.out.write(buffer);	//여러 글자는 write만으로도 출력
			System.out.println();
			
		} catch (FileNotFoundException e) {	//파일을 읽지 못했을때 나타나는 오류
			System.out.println("파일 열기 실패");
		} catch (IOException e1) {	//파일을 닫지 못 했을때 나타나는 오류 - 이것만 사용해도 됨(상위범위이기때문에)
			System.out.println("파일 닫기 실패");
		}
	}

	public void method05() {
		System.out.println("------ 이미지 파일 입력 : FileInputStream ------");
		File file = new File("C:\\iotest\\오로라.jpg");
		try(FileInputStream fis = new FileInputStream(file)) {
			//이미지 파일 크기 알아오기
			System.out.println(file.length());
			//이미지 파일 내용을 저장할 임시 변수 생성
			byte [] buffer = new byte[(int) file.length()];
			//파일 내용을 임시 변수에 저장
			fis.read(buffer);
			//임시 변수에 저장된 파일 내용 출력
			System.out.write(buffer);
		} catch (IOException e1) {
			System.out.println("이미지 파일 입력 오류");
		}
	}

	public void method06() {
		System.out.println("------ 파일 출력 : FileWriter ------");
		try(FileWriter fw = new FileWriter("C:\\iotest\\test03.txt")) {
			fw.write("HiHi\n");
			fw.write("Welcome");
			System.out.println("파일 출력 완료");
		} catch (IOException e) {
			System.out.println("파일 쓰기 실패");
		}
	}

	public void method07() {
		System.out.println("------ 파일 입력 : FileReader ------");
		try(FileReader fr = new FileReader("C:\\iotest\\test03.txt")) {
			//한 개 문자 읽어서 정수형태로 리턴
			System.out.println(fr.read());
			//char 배열에 읽어 온 파일 내용 저장
			char[] str = new char[100];
			fr.read(str);
			//배열 내용 출력
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("파일 입력 실패");
		}
	}

	public void method08() throws IOException {
		System.out.println("------ 보조 스트림 : OutputStream ------");
		//파일 출력 스트림
		FileOutputStream fos = new FileOutputStream("C:\\iotest\\test04.txt");
		//데이터 출력 보조 스트림 생성
		DataOutputStream dos = new DataOutputStream(fos);
		//파일에 데이터 쓰기
		dos.writeUTF("Hello\n");
		dos.writeUTF("안녕하세요");
		dos.writeInt(65);
		//스트림 객체 닫기
		dos.close();
		fos.close();
		
		System.out.println("------ 보조 스트림 : DataInputStream ------");
		//파일 입력 스트림 생성
		FileInputStream fis = new FileInputStream("C:\\iotest\\test04.txt");
		//데이터 입력 보조 스트림 생성
		DataInputStream dis = new DataInputStream(fis);
		//파일에서 데이터 읽어오기
		System.out.println(dis.readUTF());
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
		//스트림 객체 닫기
		dis.close();
		fis.close();
	}
}
