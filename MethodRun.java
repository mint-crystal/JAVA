package object.method;

public class MethodRun {

	public static void main(String[] args) {
		MethodExam03 me03 = new MethodExam03();
		//this
		me03.printName();
		
		//getter and setter
		me03.setName("박서함");
		System.out.println(me03.getName());
		me03.setSex('남');
		System.out.println(me03.getSex());
		me03.setAge(28);
		System.out.println(me03.getAge());
		me03.setHeight(190.1);
		System.out.println(me03.getHeight());
	}

}
