package wrapper;

public class WrapperExam {
	
	public static void main(String[] args) {
		Integer num1 = new Integer(17);	//�ڽ�
		int n1 = num1.intValue();	//��ڽ�
		System.out.println(n1);
	
		Integer num2 = 17;	//�ڵ� �ڽ�
		int n2 = num2;	//�ڵ� ��ڽ�
		System.out.println(n2);
		
		//����
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println("���ڿ� byte�� ��ȯ : " + b);
		System.out.println("���ڿ� int�� ��ȯ : "+i);
		System.out.println("���ڿ� short�� ��ȯ : " + s);
		System.out.println("���ڿ� long�� ��ȯ : "+l);
		System.out.println("���ڿ� float�� ��ȯ : "+f);
		System.out.println("���ڿ� double�� ��ȯ : "+d);
		System.out.println("���ڿ� bool�� ��ȯ : "+bool);
		
		//�� ��
		Integer num3 = new Integer(10);	//wrapperŬ����1
		Integer num4 = new Integer(10); //wrapperŬ����2
		int j = 10; //�⺻Ÿ��
		System.out.println("����Ŭ���� == �⺻Ÿ�� : "+(num3==j)); //true
		System.out.println("����Ŭ����.equals(�⺻Ÿ��) : " + num3.equals(i)); //true
		System.out.println("����Ŭ���� == ����Ŭ���� : "+(num3==num4)); //false
		System.out.println("����Ŭ����.equals(����Ŭ����)"+num3.equals(num4)); //true
		/*���� ��ü�� ��ü�� ���� �ּҸ� ���ϱ� ������ ������ ���� ���ϱ� ���� == ������ ��� �Ұ�
		 * ����==���� �񱳴� ������ �����ּҰ� �ٸ��� ������ false
		 * ��ü������ �񱳸� �Ϸ��� equals ���
		 * �⺻ �ڷ������� �񱳴� ==�����ڿ� equals ��� ��� ����(�����Ϸ��� �ڵ����� ����ڽ̰� �����ڽ��� ���ֱ� ����)
		 */
	}
}