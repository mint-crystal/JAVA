package kh.project1.test1;

//Scanner Class 포함
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//Scanner 생성
		Scanner scan = new Scanner(System.in);
		//정수 입력받기
		int num1;
		System.out.print("정수를 입력하세요 : "); 
		num1 = scan.nextInt();
		System.out.println("입력값 : "+num1);
		//실수 입력받기
		System.out.print("실수(float)를 입력하세요 : ");
		float num2;
		num2=scan.nextFloat(); 
		System.out.println("입력값 : "+num2);	
		
		System.out.print("실수(double)를 입력하세요 : ");
		double num3;
		num3=scan.nextDouble();
		System.out.println("입력값 : "+num3);
		//문자열 입력
		System.out.print("문자열을 입력하세요 : ");
		String str1;
		str1 = scan.next(); //공백을 기준으로 가져오기 때문에 a b라고 입력했을 때 공백 앞 부분인 a만 출력됨
		System.out.println("입력값 : "+str1);
		
		System.out.print("문자열을 입력하세요 : ");
		String str2;
		scan.nextLine(); /* 아래의 nextLine 공백을 인식해 출력하기 때문에 공백(엔터)를 받기 위해 선언
						위의 next에 a를 출력한다고 가정하면 엔터를 입력하게 되어 buffer에 엔터 값이 남아있으므로
						= scan.skip("[\\r\\n]+"); \\r\\n은 엔터를 뜻함-엔터가 있으면 skip시켜라
						[]+는 skip의 문법 패턴
						\\r\\n로 하는 이유 \r\n으로 입력하면 escape문자로 인식하기 때문
						\r : 줄의 가장 앞으로 커서 이동
						\n : 줄의 다음 줄로 커서 이동 */
		str2 = scan.nextLine(); 
		System.out.println("입력값 : "+str2);
		
		//예제)이름, 나이, 전화번호를 입력받아서 출력
		//이름 : (입력)
		//나이 : (입력)
		//전화번호 : (입력)
		//제 이름은 ??이고, 나이는 ??이고, 전화번호는 ??입니다.
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("전화번호 : ");
		//scan.nextLine(); //아래 명령어를 nextLine으로 하면 공백을 포함하므로 nextLine으로 입력했을때 엔터값을 받기 위해 사용
		String phone= scan.next();
		System.out.println("제 이름은 " + name + "이고, 나이는 "+age+"이고, 전화번호는 "+phone+"입니다.");
	}

}
