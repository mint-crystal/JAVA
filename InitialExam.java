package object.Field;

public class InitialExam {
	//JVM�ʱ�ȭ
	public boolean var1;	//����
	public int var2;		//������
	public double var3;		//�Ǽ���
	public char var4;		//������
	public String var5;		//���ڿ���
	
	//����� �ʱ�ȭ
	public boolean var1 = true;		//����
	public int var2 = 10;			//������
	public double var3 = 1.5;		//�Ǽ���
	public char var4 = 'A';			//������
	public String var5 = "Hello";	//���ڿ���
	
	//static �ʱ�ȭ
	static{
		var2 = 20;
	}
	public int  var1= 10;
	public static int var2 = 10;	//Ŭ���� ��ü�� ������� ����(static field)

	
	//�ν��Ͻ� �ʱ�ȭ ���
	{
		var1 = false;
		var3 = 5.6;
		var4 = 'B';
		var5 = "�ȳ��ϼ���";
	}	
	
}
