package object.Field;

public class StaticFieldExam {
	public int var1;		//인스턴스변수 = 멤버변수
	public static int var2;	//클래스 변수

	//다른거
	public String name;
	public int age;
	public static int count=0;
	public StaticFieldExam() {
		count+=1;	//객체가 만들어진 개수를 세기 위해
	}
}
