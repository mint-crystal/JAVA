package com.kh.project.exam02.controller;

import com.kh.project.exam02.model.vo.Animal;
import com.kh.project.exam02.model.vo.Beer;
import com.kh.project.exam02.model.vo.Cat;
import com.kh.project.exam02.model.vo.Tiger;

//������
//public class AnimalController {
//	public Animal ani;
//	public Beer bg = new Beer();
//	
//	public AnimalController() {}
//	public AnimalController(Animal ani) {
//		this.ani = ani;
//	}
//	
//}

////���׸� - ���� ����
//public class AnimalController<T extends Animal> {
//	public T ani;
//	public Beer bg = new Beer();
//	
//	public AnimalController() {}
//	public AnimalController(T ani) {
//		this.ani = ani;
//	}

	//���׸� - ���ϵ�ī��
	public class AnimalController {
//		//Tiger�� Cat ��ü�� ���� ���ؼ��� ���� �� Ŭ������ ���������� ���� �ּҸ� �����ϰ� ����ؾ���
//		public Tiger tg;	//Tiger ��ü�� ��� ���� ��������
//		public Cat ca;		//Cat ��ü�� ������� ��������
//		//������ �����ε�
//		public AnimalController() {}
//		public AnimalController(Tiger ani) {
//			this.tg = ani;
//		}
//		public AnimalController(Cat ani) {
//			this.ca = ani;
//		}
//		
		// --------------------------------------
		//Tiger�� Cat ��ü�� ���� ���� �θ� Ŭ������ Animal Ŭ������ ���������� ����� �ּҸ� �����ؼ� ���
		public Animal ani;	//Tiger�� Cat ��ü�� ��� ���� �θ�Ŭ���� ��������(����������)
		//������
		public AnimalController() {}
		public AnimalController(Animal<?>ani) { 
			/*	ex. <Integer>�� ������ Animal Ŭ������ <T>�� Integer�� �����Ǿ� �ְ� �� -> Run������ ������ Integer ���·� ����ؾ���
			 * Run���� ����Ҷ� �����Ӱ� �����ؼ� �� �� �ֵ��� <?> ����
			 */
			this.ani = ani;
		}
		
//		public AnimalController(Animal<? super Number>ani) { 
//		//Number�� ����Ŭ����. Run���� Number���� ��� ����
//			this.ani = ani;
//		}
//		
//		public AnimalController(Animal<? extends Number>ani) { 
//		//Number�� ����Ŭ����. Run���� String ����
//			this.ani = ani;
//		}
		
		public Beer bg = new Beer();

}
