package object.constructor;

public class ConstructorExam {
	//�ʵ�
	public String name;
	public int age;
	
	//������
	public ConstructorExam() {
		this("�̸�����,",0); //�Ʒ� �������� String, int
		////this()�� �̿��� �����ڸ� ȣ���� ������ �ڵ��� ���� ���� this �޼ҵ尡 �;��Ѵ�
		System.out.println("������1 ȣ��");
	}
	public ConstructorExam(String name, int age) {
		System.out.println("������2 ȣ��");
	}
}
