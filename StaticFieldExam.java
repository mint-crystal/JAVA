package object.Field;

public class StaticFieldExam {
	public int var1;		//�ν��Ͻ����� = �������
	public static int var2;	//Ŭ���� ����

	//�ٸ���
	public String name;
	public int age;
	public static int count=0;
	public StaticFieldExam() {
		count+=1;	//��ü�� ������� ������ ���� ����
	}
}
