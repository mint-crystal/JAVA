package object.encapsulation;

public class EncalsulationExam01 {
	public int var1 = 10;	//��ü����
	private int var2 = 20;	//�ش� Ŭ���� ����
	int var3 = 30;			//default - ���� ��Ű�� ������
	
	public void print() {
		//���� Ŭ���� ��
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		method01();
		method02();
		method03();
	}
	public void method01() {
		System.out.println("public �޼ҵ�");
	}
	private void method02() {
		System.out.println("private �޼ҵ�");
	}
	void method03() {
		System.out.println("default �޼ҵ�");
	}
}
