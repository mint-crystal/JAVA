package object.overloading;

public class OverloadingRun {

	public static void main(String[] args) {
		OverloadingExam ole = new OverloadingExam();
		//인자값 or Argument
		ole.func();
		ole.func(10);			//int num
		ole.func(10, 20, 30);	//int ...num
		ole.func('A');			//char ch
		ole.func(100, 200);		//int num1, int num2
		ole.func(16.8);			//double num
		ole.func("수정");			//String name
	}

}
