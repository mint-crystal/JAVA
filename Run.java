package object.method;

public class Run {

	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		//�޼ҵ� ǥ����
		me.func1();
		me.func2(10);
		double num = me.func3();
		System.out.println(num);
		int sum = me.func4(10, 20);
		System.out.println(sum);
		
		//�Ű����� �ǽ� - ���� �ڷ����� �Ű����� �Է�
		me.func5(10, '��', 5.7);
		
		//�Ű����� �ǽ� - �����ڷ��� �Ű�����
		int num2 = 100;
		System.out.println(num2);
		me.func6(num2);		//Call by Value : ���� �Ѱ��ָ鼭 �޼ҵ带 ȣ��
		System.out.println(num2);	//�ٽ�  100 ���
		
		//���������� �ּҸ� �Ѱ��ֱ� ������ �ٲ� ���� ���
		//Call by Address = Call by Reference
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		System.out.println(arr1[0]);
		me.func7(arr1);
		System.out.println(arr1[0]); //func7�� ���� 20 ���
		
		MethodExam02 meme = new MethodExam02();
		meme.name = "ȫ�浿";
		meme.age = 20;
		meme.height = 160.2;
		System.out.println("�̸� : "+meme.name+", ���� : "+meme.age+", Ű : "+meme.height);
		me.func8(meme);
		System.out.println("�̸� : "+meme.name+", ���� : "+meme.age+", Ű : "+meme.height);
		
		//�Ű����� �ǽ� - ��������
		me.func9(10, 20, 30);
		
		//��ȯ�ڷ��� �ǽ�
		me.func10(10);
		me.func10(0);	//�޼ҵ�10 ���� �� ���
		System.out.println(me.func10(0)); //���ϰ� ���
		System.out.println("���θ޼��� ����");
	}
	
}