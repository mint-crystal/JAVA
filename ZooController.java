package com.kh.project.poly;

public class ZooController {
	//�ʵ��
	private Animal ani;
//	private Cat c;
//	private Dog d;
//	private Rabbit r;
	
	//�����ں�
	
	//�޼����
//	public void catBehavior() { //��ȣ �ȿ� (Animal a)�� ������ �Ʒ� �ڵ带 ����� ani = a; ��� ��ü ���� �� ��� ����
//		c = new Cat();		//ani = new Cat(); //������� ��ü �ּҸ� ani�� ��� ���.
//		c.walk();			//ani.walk();
//		c.eat();			//ani.eat();
//		c.speak();			//ani.speak();
//	}
//	public void dogBehavior() {
//		d = new Dog();		//ani = new Dog();	
//		d.walk();			//ani.walk();
//		d.eat();			//ani.eat();
//		d.speak();			//ani.speak();
//	}
//	public void rabbitBehavior() {
//		r = new Rabbit();	//ani = new Rabbit();
//		r.walk();			//ani.walk();
//		r.eat();			//ani.eat();
//		r.speak();			//ani.speak();
//	}
	
	//�� ��ɵ��� ���� �ߺ��� �ڵ带 �ٿ��ִ� �޼���
	public void behavoir(Animal ani) {
		/*	�޼ҵ��� �Ű����� �κп��� ��ü�� �ּҸ� �޾Ƽ� ����ϴ� ���
			���� �ڽ� Ŭ������ �ּҸ� ��ƾ��� ��쿡�� �θ�Ŭ������ ���� ������ ����� ����� �� �ִ�. */
		this.ani = ani;
		ani.walk();
		ani.eat();
		ani.speak();
	}
}
