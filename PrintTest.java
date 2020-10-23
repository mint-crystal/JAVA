package kh.project1.test1;

public class PrintTest {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 3.5;
		
		//print()
		System.out.print(10); //()안의 값들은 리터럴 상수
		System.out.print(3.5);
		System.out.print("Hello");
		
		//println()
		System.out.println(10);
		System.out.println(3.5);
		System.out.println("Hello");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(10+20);
		System.out.println("안녕하세요"+"집가야지~!");
		
		//printf("출력할 서식"[, 인자값, ...]); 대괄호는 생략가능 표시!
		System.out.printf("안녕하세요\n 프린트에프"); // \n뒤로 줄바꿈
		System.out.printf("벌써	시간이..."); //줄바꿈X tab사용해서 띄어씀
		System.out.printf("\\\\벌써\"시간이...\n"); //특수문자 사용 - \\벌써"시간이... 로 출력
		
		//저장된 값을 가져와서 문자열의 형태로 출력
		System.out.printf("제 이름은 %s이고, 나이는 %d입니다\n" , "홍길동", 20); 
		
		String name = "홍길동";
		int age = 20;
		System.out.printf("제 이름은 %s이고, 나이는 %d입니다\n" , name, age); 
		System.out.println("제 이름은 "+name+"이고, 나이는 "+age+"입니다"); //위와 같음
		System.out.printf("%d / %o / %x / %c \n", 65,65,65,65); //65 / 101 / 41 / A
		
		String name2 = "홍길동";
		int age2 = 20;
		String tel = "010-1234-1234";
		System.out.printf("이름\t: %s\n", name2);
		System.out.printf("나이\t: %d\n", age2);
		System.out.printf("전화번호\t: %s\n", tel);
		System.out.println("금액은 \\35,000원 입니다");
		System.out.println("이것은 큰따옴표\"입니다");
				
	}

}
