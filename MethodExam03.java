package object.method;

public class MethodExam03 {
		//�ʵ�
	private String name = "ȫ�浿";
	private int age;
	private double height;
	private boolean sex;
		//������
	
		//�޼ҵ�
	//this
	public void printName() {
		String name = "�̱浿";
		System.out.println("name : "+name);
		System.out.println("this.name : "+this.name);
	}
	
	//getter and setter
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age>0 && age<=150)
			this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setSex(char sex) {
		if(sex == '��')
			this.sex = true;
		else if (sex == '��')
			this.sex = false;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public char getSex() {
		if(sex)
			return '��';
		else
			return '��';
	}
}
