package com.kh.project.poly;

import java.util.Scanner;

public class polyRun {

	public static void main(String[] args) {
		/*	�� ĳ���� : ��� ������ ���, �θ� Ŭ������ ���������� �����, �ڽ� ��ü�� �ּҸ� ��Ƽ� ���
					�θ� �������ָ� �̿��ؼ� �� ��ü�� ����� ���� ����	*/
		Animal ani;
		ani = new Cat();
		ani.walk();
		ani.eat();
		ani.speak();
		
		ani = new Dog();
		ani.walk();
		ani.eat();
		ani.speak();
		
		ani = new Rabbit();
		ani.walk();
		ani.eat();
		ani.speak();
		
		//��ü �迭�� ������
		Animal [] aniArr = new Animal[3];
		aniArr[0] = new Cat();
		aniArr[1] = new Dog();
		aniArr[2] = new Rabbit();
		
//		aniArr[0].walk();
//		aniArr[0].eat();
//		aniArr[0].speak();
//		
//		aniArr[1].walk();
//		aniArr[1].eat();
//		aniArr[1].speak();
//		
//		aniArr[2].walk();
//		aniArr[2].eat();
//		aniArr[2].speak();
		
		for(int i = 0; i<aniArr.length; i++) {	//�ݺ����� ���� �� �ڵ��� �ߺ��� ����
			aniArr[i].walk();
			aniArr[i].eat();
			aniArr[i].speak();
		}
		
		//�ٿ� ĳ����
		Animal [] aniArr2 = new Animal[3];
		aniArr2[0] = new Cat();
		aniArr2[1] = new Dog();
		aniArr2[2] = new Rabbit();
		for(int i = 0; i<aniArr.length; i++) {	
			aniArr2[i].walk();
			aniArr2[i].eat();
			aniArr2[i].speak();
			if(i==0) {
				//aniArr2[i].grumming(); //�θ�Ŭ������ �ڽ�Ŭ������ ����� �� ������ �ڽĸ��� ����� ����� �� ����.
				((Cat)aniArr2[i]).grumming(); //�ٿ�ĳ������ ����� �ڽ�Ŭ�������� ����� ���
			}else if(i == 1) {
				((Dog)aniArr[i]).protect();
			}else if(i == 2) {
				((Rabbit)aniArr2[i]).jump();
			}				
		/*	instanceof ������ - �� ��° �ε����� ���� �����ϴ��� �� �� ���� ��
		 * 	���� : �������� instanceof Ŭ���� / ��ü(=��������) + instanceof + Ŭ����
		 	��� : �ش� ���������� ����Ű�� ��ü�� ���ϰ��� �ϴ� Ŭ������ ��ġ�ϸ� true, �ƴϸ� false	*/	
			if(aniArr2[i] instanceof Cat) {
				//aniArr2[i].grumming();
				((Cat)aniArr2[i]).grumming(); 
			}else if(aniArr2[i] instanceof Dog) {
				((Dog)aniArr[i]).protect();
			}else if(aniArr2[i] instanceof Rabbit) {
				((Rabbit)aniArr2[i]).jump();
			}
		}
	
		//�ްԺ����� ������
		ZooController zoo = new ZooController();
//		zoo.catBehavior();
//		zoo.dogBehavior();
//		zoo.rabbitBehavior();
		zoo.behavoir(new Cat()); 	
		zoo.behavoir(new Dog());
		zoo.behavoir(new Rabbit());
		
		Scanner scan = new Scanner(System.in);
		Animal a = new Animal(); 
		/*	Animal a; ��� �����ϸ� default�� ���� ���� ���� ������ ������ ���� ��ü�� ��������.
		 * 	Animal a; ��� �����ϰ� default�� a = new Animal(); �̶�� �ص� ��
		 */
		
		//������ ���α׷�
		System.out.println("==== ������ ====");
		System.out.println("1. �����");
		System.out.println("2. ������");
		System.out.println("3. �䳢");
		System.out.println("4. ������");
		System.out.print("� ������ ���� �����Ű���?");
		int select = scan.nextInt();
		switch(select) {
		case 1:
			a = new Cat();
			((Cat)a).grumming();
			break;
		case 2:
			a = new Dog();
			((Dog)a).protect();
			break;
		case 3:
			a = new Rabbit();
			((Rabbit)a).jump();
			break;
		case 4:
			return;
		default : 
			System.out.println("�߸� �����ϼ̽��ϴ�.");
		}
		a.walk();
		a.eat();
		a.speak();
		
		
//		//�⺻���� ��ü ��� ���
//		//�ش� Ŭ������ �̿��ؼ� ���������� �����, ��ü�� �ּҸ� ��Ƽ� ���
//		//�� ��ü�� ���������� �̿��ؼ� ����� ����		
//		Cat c = new Cat();		
//		Dog d  = new Dog();		
//		Rabbit r = new Rabbit();
//
//		c.eat();
//		c.speak();
//		c.walk();
//
//		d.eat();
//		d.speak();
//		d.walk();
//		
//		r.eat();
//		r.speak();
//		r.walk();

	}

}
