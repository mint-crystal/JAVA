package object.overloading;

public class OverloadingExam {
	//�ʵ�
	//������
	//�޼ҵ�
	public void func() {
		System.out.println("1��° �޼ҵ�");
	}
	public void func(int num) {
		System.out.println("2��° �޼ҵ�");
	}
	public void func(int ...num) {
		System.out.println("2-1��° �޼ҵ�");
	}
	public void func(char ch) {
		System.out.println("3��° �޼ҵ�");
	}
	public void func(int num1, int num2) {
		System.out.println("4��° �޼ҵ�");
	}
	public void func(double num) {
		System.out.println("5��° �޼ҵ�");
	}
	public void func(String name) {
		System.out.println("6��° �޼ҵ�");
	}
}
