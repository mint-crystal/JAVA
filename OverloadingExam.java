package object.overloading;

public class OverloadingExam {
	//필드
	//생성자
	//메소드
	public void func() {
		System.out.println("1번째 메소드");
	}
	public void func(int num) {
		System.out.println("2번째 메소드");
	}
	public void func(int ...num) {
		System.out.println("2-1번째 메소드");
	}
	public void func(char ch) {
		System.out.println("3번째 메소드");
	}
	public void func(int num1, int num2) {
		System.out.println("4번째 메소드");
	}
	public void func(double num) {
		System.out.println("5번째 메소드");
	}
	public void func(String name) {
		System.out.println("6번째 메소드");
	}
}
