package kh.oop;

public class PersonRun {

	public static void main(String[] args) {
		System.out.println("!!���� Ŭ���� ����!!");
		
		Person ps1 = new Person();
		ps1.name = "ȫ����";
		ps1.age = 29;
		ps1.phone = "010-4151-2845";
//		boolean result = ps1.setAge(10); 
//		if(result) { 
//			System.out.println("�Է� ����");			
//		}else {
//			System.out.println("�Է� ����");
//		} �Ʒ� if���� ���� 
		
		if(ps1.setAge(10)) {
			System.out.println("�Է� ����");			
		}else {
			System.out.println("�Է� ����");
		}
		
		Person ps2 = new Person();
		ps2.name = "ȫ����";
		ps2.age = 24;
		ps2.phone = "010-1234-1234";

	}

}
