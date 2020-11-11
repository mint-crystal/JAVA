package com.kh.project.exam02.run;

import com.kh.project.exam02.controller.AnimalController;
import com.kh.project.exam02.model.vo.Animal;
import com.kh.project.exam02.model.vo.Beer;
import com.kh.project.exam02.model.vo.Cat;
import com.kh.project.exam02.model.vo.Tiger;

public class AnimalRun {

	public static void main(String[] args) {
//		//다형성을 이용해서 여러 객체 사용
//		AnimalController ac1 = new AnimalController(new Tiger()); 
//		AnimalController ac2 = new AnimalController(new Cat());
//		ac1.ani.move();
//		ac1.ani.move();
//		//ac1.ani.speak();	//speak()메서드는 자식에서 만들어진 메소드이기 때문에 접근 불가
//		//다운 캐스팅을 이용해서 접근해야함
//		if(ac1.ani instanceof Tiger)
//			((Tiger)(ac1.ani)).speak();	
//		else if(ac1.ani instanceof Cat)
//			((Cat)(ac1.ani)).spak();
//		
//		//제네릭을 이용해서 여러 객체 사용
//		AnimalController<Tiger> ac1 =  new AnimalController<Tiger>(new Tiger());
//		ac1.ani.move();	//부모 클래스의 있는 내용 잘 실행됨
//		ac1.ani.speak();	//자식클래스의 메소드도 잘 실행됨
//		
//		AnimalController<Cat> ac2 = new AnimalController(new Cat());
//		ac2.ani.move();
//		ac2.ani.spak();
		
		//AnimalController<Beer> ac3 = new AnimalController(new Beer());
		
		//제네릭 와일드카드
		//기본적 사용
		Animal<Integer> ani1 = new Animal<Integer>(10);
		Animal<Double> ani2 = new Animal<Double>(1.5);
		
		/* - AnimalController에서 생성자 매개변수를 
		 *   public AnimalController(Animal <Integer> ani)로 고정 시켜놨으면 Double 사용을 못함
		 *
		 * - Run에서 자유롭게 쓸 수 있도록 public AnimalController(Animal <?> ani)로 했기 때문에
		 *   Integer와 Double 모두 사용 가능 
		 */
		AnimalController ac1 = new AnimalController(new Animal(10));
		AnimalController ac2 = new AnimalController(new Animal<Double>(1.5));
		AnimalController ac3 = new AnimalController(new Animal("Hello"));
		AnimalController ac4 = new AnimalController(new Animal<Number>(1.5));
		
		//제네릭 상속
		AnimalController ac5 = new AnimalController(new Tiger<Integer,Double>());
	}

}
