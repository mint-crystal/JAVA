package kh.project1.test1;

public class Variable {

	public static void main(String[] args) {
		//���� ����
		int num;
		//���� ��� - �� ����
		num = 10;
		//���� ��� - �� �б�
		System.out.println(num); //10
		
		num = 10+20;
		System.out.println(num); //30
		
		//���� ���� �� �ٷ� �� ����(�ʱⰪ)
		int num2 = 20;
		//���� ���� ���� ���ÿ� ����(���� �ڷ����� ����)
		int num3, num4, num5;
		//���� ���� ���� ���ÿ� ���� �� �ٷ� �� ����(�ʱⰩ)
		int num6, num7 = 40, num8 = 50; //num6�� ���� ���� �ʾұ� ������ �ƹ��͵� ���� ����
		
		//���� ���� �ٸ� ������ ����
		int num9 = 10;
		int num10 = num9;
		
		//���� ���� �̿��� ���� �� �ٽ� ����
		int num11 = 100;
		System.out.println(num11); //100
		num11 = num11 + 1;
		System.out.println(num11); //101
		
		//������ Ÿ�Կ� ���� ���� ����
		byte num01 = 100; //1byte ũ���� �������� ����
		System.out.println(num01); //100
		System.out.println("num01���� �� : "+num01);
		short num02 = 10000; //2byte ũ���� �������� ����
		System.out.println("num02���� �� : "+num02); //10000
		int num03 = 10000000; //4byte ũ���� �������� ����
		System.out.println("num03���� �� : "+num03); //10000000
		long num04 = 10000000000L; //8byte ũ���� �������� ����-���� l �Ǵ� L�� ����
		System.out.println("num04���� �� : "+num04); //10000000000
		float num05 = (float)3.5; //=3.5F; //4byte ũ���� �Ǽ����� ����
		System.out.println("num05���� �� : "+num05); //3.5
		double num06 = 12345.234; //8byte ũ���� �Ǽ����� ����
		System.out.println("num06���� �� : "+num06); //12345.234
		char ch = '��'; //2byte ũ���� ���Ϲ������� ����
		System.out.println("ch���� �� : "+ch); //��
		String str = "��θ�~!!"; //����ũ���� ���ڿ����� ����
		System.out.println("str���� �� : "+str); //��θ�~!!
		System.out.println("str���� �� : "+str.charAt(1)); //Ư�� ��ġ �ѱ��� ����
		System.out.println("str���� �� : "+str.length()); //���� ����
		boolean bl = true; //1byte ũ���� ������ ����
		System.out.println("bl���� �� : "+bl); //true
		bl = false;
		System.out.println("bl���� �� : "+bl); //false
		
		//������ �ٸ� ���� ������ ����
//		int in1 = 3.5; //�Ǽ��� �������� ũ�⶧���� ����
		int in2 = 'A'; //���Ϲ��ڴ� ���ڷ� ������ �ǹǷ� ������ ȥ��
		System.out.println("in2���� �� : "+in2);//65
		char ch1 = 65; //������ ���Ϲ��ڴ� �Ȱ��� ó��. int=char
		System.out.println("ch1���� �� : "+ch1); //A
		float fl = 5; 
		System.out.println("fl���� �� : "+fl); //5.0 
		double fl2 = 100; 
		System.out.println("fl2���� �� : "+fl2); //100.0
//		String str1 = 'A'; //����
		String str1 = ""+ 'A'+100; //���ڿ��� �ٸ� ������ Ÿ���� �����ϸ� ��밡��
		System.out.println("str1���� �� : "+str1); //A100
		
		//���� ��� ����
		int var1 = 10;
		System.out.println(var1); //10 ���� ���
		{//���ο� ���
//			int var1 = 30; //����. �ϳ��� ���� �ȿ����� ���� �̸��� ����� �� ����
			int var2 = 20;
			System.out.println(var1); //10 - ���� {}��� �ȿ��� var1�� ã�� ������ �� ū ��Ͽ��� ã�Ƴ�
			System.out.println(var2); //20
		}
//		System.out.println(var2); //��� �ȿ� �����Ƿ� ����. ū ���->���� ������δ� ã�� ����
		
		//final ��� - ������ �ʴ� ��
		final int num100;
		num100 = 20; //���� �� �� ���� �� ���� ����
		System.out.println(num100); //20
//		num100 = 30; //final ����� ���� ���� �߻�
		final int NUM = 101; //����� ���ÿ� �ʱ�ȭ
		System.out.println(NUM); //101
//		NUM = 100; //final ����� ���� ���� �߻�
		
		//���� ����ȯ
		int number = 10;
		System.out.println((byte)number);
		number = 290; //���� ������ �սǷ� ���� 2������ ���� ����
		System.out.println((byte)number); //34
	}

}
