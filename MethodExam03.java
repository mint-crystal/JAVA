package object.method;

public class MethodExam03 {
		//필드
	private String name = "홍길동";
	private int age;
	private double height;
	private boolean sex;
		//생성자
	
		//메소드
	//this
	public void printName() {
		String name = "이길동";
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
		if(sex == '남')
			this.sex = true;
		else if (sex == '여')
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
			return '남';
		else
			return '여';
	}
}
