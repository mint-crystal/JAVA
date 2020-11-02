package object.encapsulation;

public class EncalsulationExam01 {
	public int var1 = 10;	//전체공개
	private int var2 = 20;	//해당 클래스 내부
	int var3 = 30;			//default - 같은 패키지 내에서
	
	public void print() {
		//같은 클래스 내
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		method01();
		method02();
		method03();
	}
	public void method01() {
		System.out.println("public 메소드");
	}
	private void method02() {
		System.out.println("private 메소드");
	}
	void method03() {
		System.out.println("default 메소드");
	}
}
