package kh.oop;

public class Member {
		//�Ӽ�(Field) - [����������] [�����] �ڷ��� ������;
		public String name; //��� ����
		public int age;
		
		//������(Constructor) - [����������] �����ڸ�() { }
		public Member() {
			System.out.println("Member ��ü ������");
		}
		
		//���(Method) - [����������] ��ȯ�� �޼ҵ��(�Ű�����) {��� ����}
		public String getName() { //��� �޼ҵ�
			return name;
		}
		public void setName(String name) { //��� �޼ҵ�
			this.name = name;
		}
		public int getAge() { //��� �޼ҵ�
         	return age;
		}
		public void setAge(int age) { //��� �޼ҵ� //��ȣ ���� �Ű������� �̸��� �޶� ��(this)
			this.age = age; //this�� Ŭ������ ����
		}
}
