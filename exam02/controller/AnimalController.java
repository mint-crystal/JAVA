package com.kh.project.exam02.controller;

import com.kh.project.exam02.model.vo.Animal;
import com.kh.project.exam02.model.vo.Beer;
import com.kh.project.exam02.model.vo.Cat;
import com.kh.project.exam02.model.vo.Tiger;

//다형성
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

////제네릭 - 접근 제한
//public class AnimalController<T extends Animal> {
//	public T ani;
//	public Beer bg = new Beer();
//	
//	public AnimalController() {}
//	public AnimalController(T ani) {
//		this.ani = ani;
//	}

	//제네릭 - 와일드카드
	public class AnimalController {
//		//Tiger와 Cat 객체를 쓰기 위해서는 원래 각 클래스의 참조변수를 만들어서 주소를 저장하고 사용해야함
//		public Tiger tg;	//Tiger 객체를 담기 위한 참조변수
//		public Cat ca;		//Cat 객체를 담기위한 참조변수
//		//생성자 오버로딩
//		public AnimalController() {}
//		public AnimalController(Tiger ani) {
//			this.tg = ani;
//		}
//		public AnimalController(Cat ani) {
//			this.ca = ani;
//		}
//		
		// --------------------------------------
		//Tiger와 Cat 객체를 쓰기 위해 부모 클래스인 Animal 클래스의 참조변수를 만들고 주소를 저장해서 사용
		public Animal ani;	//Tiger와 Cat 객체를 담기 위한 부모클래스 참조변수(다형성구현)
		//생성자
		public AnimalController() {}
		public AnimalController(Animal<?>ani) { 
			/*	ex. <Integer>를 넣으면 Animal 클래스의 <T>가 Integer로 고정되어 있게 됨 -> Run에서는 무조건 Integer 형태로 사용해야함
			 * Run에서 사용할때 자유롭게 결정해서 쓸 수 있도록 <?> 넣음
			 */
			this.ani = ani;
		}
		
//		public AnimalController(Animal<? super Number>ani) { 
//		//Number와 상위클래스. Run에서 Number제외 모두 오류
//			this.ani = ani;
//		}
//		
//		public AnimalController(Animal<? extends Number>ani) { 
//		//Number와 하위클래스. Run에서 String 오류
//			this.ani = ani;
//		}
		
		public Beer bg = new Beer();

}
