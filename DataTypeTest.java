package kh.project1.test1;

public class DataTypeTest {

	public static void main(String[] args) {
		//2���� 01000001 ǥ�� (�������� �տ� 0b�� ���δ�.)
		System.out.println(0b01000001);
		System.out.println((double)0b01000001); //�Ǽ���
		System.out.println((char)0b01000001); //���Ϲ���
		
		//����
		System.out.println(100); //������ ���¸� ���� ������ �Ǵ�
		//java�� ���¸� ������ �ʾ����� �⺻������ int���� ����ϵ��� ���
		System.out.println(3.5); //������ ���¸� ���� �Ǽ��� �Ǵ�
		System.out.println((int)3.5); //�Ǽ��� ������ �ٲ㼭 ǥ��
		System.out.println('A'); //������ ���¸� ���� ���Ϲ��ڷ� �Ǵ�
		System.out.println((int)'A'); //���Ϲ��ڸ� ������ �ٲ㼭 ǥ��
		
		//�Ǽ�
		System.out.println(5.6); //������ ���¸� ���� �Ǽ��� �Ǵ�
		System.out.println(20); //������ ���¸� ���� ������ �Ǵ�
		System.out.println((double)20); //������ �Ǽ��� �ٲ㼭 ǥ��
		System.out.println('C'); //������ ���¸� ���� ���Ϲ��ڷ� �Ǵ�
		System.out.println((double)'C'); //���Ϲ��ڸ� �Ǽ��� �ٲ㼭 ǥ��
		
		//���Ϲ���
		System.out.println('J'); //������ ���¸� ���� ���Ϲ��ڷ� �Ǵ�
		System.out.println(100); //������ ���¸� ���� ������ �Ǵ�
		System.out.println((char)100); //������ ���Ϲ��ڷ� �ٲ㼭 ǥ��
		System.out.println(65.6); //������ ���¸� ���� �Ǽ��� �Ǵ�
		System.out.println((char)65.6); //�Ǽ��� ���Ϲ��ڷ� �ٲ㼭 ǥ��(�Ҽ��� ���ڸ� ����)
		System.out.println((char)0xcd5c); //�� (�����ڵ� Ȱ��)
		System.out.println((char)0xc218); //��
		System.out.println((char)0xc815); //��
		
		//���ڿ�
		System.out.println("Hello"); //������ ���¸� ���� ���ڿ��� �Ǵ�
		
		//����(Boolean)
		System.out.println(true); //������ ���¸� ���� Boolean������ �Ǵ�
		System.out.println(false); //������ ���¸� ���� Boolean������ �Ǵ�
		
		//�ڷ��� ũ�� �˾ƿ���(bit����)
		//�ڷ���.SIZE
		//String, Boolean�� �ȵ�
		//int = Integer, char = Character, �������� �ڷ��� ù ���ڸ� �빮�ڷ�
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Character.SIZE);
		}
}