package com.kh.project.exam02.run;

import com.kh.project.exam02.controller.AnimalController;
import com.kh.project.exam02.model.vo.Animal;
import com.kh.project.exam02.model.vo.Beer;
import com.kh.project.exam02.model.vo.Cat;
import com.kh.project.exam02.model.vo.Tiger;

public class AnimalRun {

	public static void main(String[] args) {
//		//�������� �̿��ؼ� ���� ��ü ���
//		AnimalController ac1 = new AnimalController(new Tiger()); 
//		AnimalController ac2 = new AnimalController(new Cat());
//		ac1.ani.move();
//		ac1.ani.move();
//		//ac1.ani.speak();	//speak()�޼���� �ڽĿ��� ������� �޼ҵ��̱� ������ ���� �Ұ�
//		//�ٿ� ĳ������ �̿��ؼ� �����ؾ���
//		if(ac1.ani instanceof Tiger)
//			((Tiger)(ac1.ani)).speak();	
//		else if(ac1.ani instanceof Cat)
//			((Cat)(ac1.ani)).spak();
//		
//		//���׸��� �̿��ؼ� ���� ��ü ���
//		AnimalController<Tiger> ac1 =  new AnimalController<Tiger>(new Tiger());
//		ac1.ani.move();	//�θ� Ŭ������ �ִ� ���� �� �����
//		ac1.ani.speak();	//�ڽ�Ŭ������ �޼ҵ嵵 �� �����
//		
//		AnimalController<Cat> ac2 = new AnimalController(new Cat());
//		ac2.ani.move();
//		ac2.ani.spak();
		
		//AnimalController<Beer> ac3 = new AnimalController(new Beer());
		
		//���׸� ���ϵ�ī��
		//�⺻�� ���
		Animal<Integer> ani1 = new Animal<Integer>(10);
		Animal<Double> ani2 = new Animal<Double>(1.5);
		
		/* - AnimalController���� ������ �Ű������� 
		 *   public AnimalController(Animal <Integer> ani)�� ���� ���ѳ����� Double ����� ����
		 *
		 * - Run���� �����Ӱ� �� �� �ֵ��� public AnimalController(Animal <?> ani)�� �߱� ������
		 *   Integer�� Double ��� ��� ���� 
		 */
		AnimalController ac1 = new AnimalController(new Animal(10));
		AnimalController ac2 = new AnimalController(new Animal<Double>(1.5));
		AnimalController ac3 = new AnimalController(new Animal("Hello"));
		AnimalController ac4 = new AnimalController(new Animal<Number>(1.5));
		
		//���׸� ���
		AnimalController ac5 = new AnimalController(new Tiger<Integer,Double>());
	}

}
