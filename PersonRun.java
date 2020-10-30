package kh.oop;

public class PersonRun {

	public static void main(String[] args) {
		System.out.println("!!실행 클래스 시작!!");
		
		Person ps1 = new Person();
		ps1.name = "홍수명";
		ps1.age = 29;
		ps1.phone = "010-4151-2845";
//		boolean result = ps1.setAge(10); 
//		if(result) { 
//			System.out.println("입력 성공");			
//		}else {
//			System.out.println("입력 실패");
//		} 아래 if문과 같음 
		
		if(ps1.setAge(10)) {
			System.out.println("입력 성공");			
		}else {
			System.out.println("입력 실패");
		}
		
		Person ps2 = new Person();
		ps2.name = "홍정은";
		ps2.age = 24;
		ps2.phone = "010-1234-1234";

	}

}
