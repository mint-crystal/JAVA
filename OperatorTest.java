package kh.project1.test1;

public class OperatorTest {

	public static void main(String[] args) {
		//���������
		int a = 10, b = 20, c = 0;
		c = a*b;
		System.out.println(c);	//200
		c = a/b; //b�� ���� 0���� �ٲ�� ����. ��� ���� 0���� ���� �� ����. ����ó���� �ذ��ϱ�
		System.out.println(c);	//0
		c = a%b;
		System.out.println(c);	//10
		c = a+b;
		System.out.println(c);	//30
		c = a-b;
		System.out.println(c); //-10
		
		//����������
		int d = 10;
		int e = ++d;
		System.out.println(d + ", " + e); //11, 11
		d= 10;
		e = d++;
		System.out.println(d + ", " + e); //11,10
		
		//�񱳿�����
		System.out.println(3>5); //false
		System.out.println(3<5); //true
		
		//��������
		int num = 10;
		System.out.println(0<num && num<100); //�� && �� -> ��
		System.out.println(0>num && num<100); //���� && �� -> ����
		System.out.println(0>num && num>100); //���� && ���� -> ����
		System.out.println(0<num || num<100); //�� || �� -> ��
		System.out.println(0>num || num<100); //���� || �� -> ��
		System.out.println(0>num || num>100); //���� || ���� -> ����
		
		//���׿�����
		int num1 = 10;
		System.out.println((num1 > 0) ? "0���� ŭ" : "0���� �۰ų� ����"); //0���� ŭ
		int num2 = -10;
		System.out.println((num2 > 0) ? "0���� ŭ" : "0���� �۰ų� ����"); //0���� �۰ų� ����
	}

}
