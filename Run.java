package object.encapsulation;

public class Run {

	public static void main(String[] args) {
		//���� ��Ű�� ���� �ٸ� Ŭ����
		EncalsulationExam01 ee = new EncalsulationExam01();
		ee.print();
		ee.var1 = 100;
		//ee.var2 = 200;	//private ��� ���� - ���� �Ұ��� ���� �߻�
		ee.var3 = 300;
		ee.method01();	//public - ��� ����
		//ee.method02();	//private - ��� �Ұ���
		ee.method03();	//default - ��밡��
	}

}
