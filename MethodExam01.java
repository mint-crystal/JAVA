package object.method;

public class MethodExam01 {
	//Field
	//�޼ҵ� ǥ����
	public void func1() { //��ȯ��X, �Ű�����X
		System.out.println("�޼ҵ�1 ����");
	}
	public void func2(int num) { //��ȯ��X, �Ű�����O
		System.out.println("�޼ҵ�2 ����");
		System.out.println("�Է� �� : "+num);
	}
	public double func3() { //��ȯ��O, �Ű�����X
		System.out.println("�޼ҵ�3 ����");
		return 3.5;
	}
	public int func4(int num1, int num2) { //��ȯ��O, �Ű�����O
		System.out.println("�޼ҵ�4 ����");
		return num1+num2;
	}
	
	//�Ű����� �ǽ� - ���� �ڷ����� �Ű����� �Է�
	public void func5(int num1, char ch, double num2) {
		System.out.println("�޼ҵ�5 ����");
		System.out.println(num1+" , "+ch+" , "+num2);
	}
	
	//�Ű����� �ǽ� - �����ڷ��� �Ű�����
	public void func6(int num) {
		num+=10;
		System.out.println("�޼ҵ�6 ���� : "+num);
	}
	public void func7(int [] arr) {
		arr[0]+=10;
		System.out.println("�޼ҵ�7 ���� : "+arr[0]);
	}
	public void func8(MethodExam02 me02) {
		me02.name = "�̱浿";
		me02.age += 5;
		me02.height = 175.5;
		System.out.println("�޼ҵ�8 ���� : "+me02.name);
		System.out.println("�޼ҵ�8 ���� : "+me02.height);
		System.out.println("�޼ҵ�8 ���� : "+me02.age);
	}
	
	//�Ű����� �ǽ� - ��������
	public void func9(int ...num) {
		System.out.println("�޼ҵ�9 ����");
		System.out.println(num);
	}
	
	//��ȯ�ڷ��� �ǽ�
	public int func10(int num) {
		System.out.println("�޼ҵ�10 ����");
		if(num==0)
			return 10;
		System.out.println("�޼ҵ�10 ����2");
		return 20;	//��� ��쿡 ��ȯ���� ������ �� �ֵ��� ����
	}
}
