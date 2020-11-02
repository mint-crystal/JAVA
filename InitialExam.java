package object.Field;

public class InitialExam {
	//JVM초기화
	public boolean var1;	//논리형
	public int var2;		//정수형
	public double var3;		//실수형
	public char var4;		//문자형
	public String var5;		//문자열형
	
	//명시적 초기화
	public boolean var1 = true;		//논리형
	public int var2 = 10;			//정수형
	public double var3 = 1.5;		//실수형
	public char var4 = 'A';			//문자형
	public String var5 = "Hello";	//문자열형
	
	//static 초기화
	static{
		var2 = 20;
	}
	public int  var1= 10;
	public static int var2 = 10;	//클래스 자체에 만들어진 변수(static field)

	
	//인스턴스 초기화 블록
	{
		var1 = false;
		var3 = 5.6;
		var4 = 'B';
		var5 = "안녕하세요";
	}	
	
}
