package kh.oop;
//�ϳ��� �ҽ� ���� �ȿ� ���� ���� Ŭ������ ���� �� ����
class Member2{ //public�� ���� ���� ���� : ���� �̸��� ���Ͼ� Ŭ���� ���� public 
				//default��� ���� ������ ����
	public int num;
	public Member2() {
		System.out.println("Member2 ��ü ����");
	}
}
/*  �ϳ��� �ҽ� ���� �ȿ� ���� ���� Ŭ������ ���� �� ������
	�����δ� ������ Ŭ���� ������ ���������.
 	- Navigator ��� Ȯ�� 	*/
public class Run { //Ŭ���� ���� ������ �̸��� �ݵ�� ���ƾ��Ѵ�.

	public static void main(String[] args) { //���� Ŭ����
		System.out.println("!!���� Ŭ���� ����!!");
		Member mb = new Member(); //Member Ŭ������ �̿��� ��ü ����
								  //�ּҸ� ������ �� �ִ� mb��� �̸��� �������� �������
		Member2 mb2 = new Member2(); //Member2 Ŭ������ �̿��� ��ü ����
		
		mb.name = "ȫ�浿"; //mb ��ü�� name ������� ���
		mb.setAge(20); //mb ��ü�� setAge() ����޼ҵ� ���
		
		System.out.println("�̸��� : " + mb.name);
		System.out.println("���̴� : " + mb.getAge());
		
		Member mbmb = new Member(); //Member Ŭ������ �̿��ؼ� �� �ٸ� ��ü ����
		mbmb.age = 30;
		mbmb.name = "������";
		System.out.println(mbmb.age);
		System.out.println(mbmb.name);
	}

}
