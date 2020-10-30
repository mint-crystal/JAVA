package kh.project1.test1;

class Test{
	int num1 = 10;
	
	public void func1() {
		int num1 = 20;
		System.out.println(num1);		//20 출력
		System.out.println(this.num1);	//10 출력
	}	
}

public class VariableArea {
	public static void main (String[] args) {
		Test ts = new Test();
		ts.func1();
	}

}
