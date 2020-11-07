package com.kh.project.poly;

import java.util.Scanner;

public class polyRun {

	public static void main(String[] args) {
		/*	업 캐스팅 : 상속 관계일 경우, 부모 클래스로 참조변수를 만들고, 자식 객체의 주소를 담아서 사용
					부모 참조변주를 이용해소 각 객체의 멤버에 접근 가능	*/
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
		
		//객체 배열과 다형성
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
		
		for(int i = 0; i<aniArr.length; i++) {	//반복문을 돌려 위 코드의 중복을 없앰
			aniArr[i].walk();
			aniArr[i].eat();
			aniArr[i].speak();
		}
		
		//다운 캐스팅
		Animal [] aniArr2 = new Animal[3];
		aniArr2[0] = new Cat();
		aniArr2[1] = new Dog();
		aniArr2[2] = new Rabbit();
		for(int i = 0; i<aniArr.length; i++) {	
			aniArr2[i].walk();
			aniArr2[i].eat();
			aniArr2[i].speak();
			if(i==0) {
				//aniArr2[i].grumming(); //부모클래스가 자식클래스를 담아줄 수 있지만 자식만의 기능은 담아줄 수 없음.
				((Cat)aniArr2[i]).grumming(); //다운캐스팅을 사용해 자식클래스만의 기능을 사용
			}else if(i == 1) {
				((Dog)aniArr[i]).protect();
			}else if(i == 2) {
				((Rabbit)aniArr2[i]).jump();
			}				
		/*	instanceof 연산자 - 몇 번째 인덱스에 값이 들어가야하는지 알 수 없을 때
		 * 	사용법 : 참조변수 instanceof 클래스 / 객체(=참조변수) + instanceof + 클래스
		 	결과 : 해당 참조변수가 가리키는 객체가 비교하고자 하는 클래스와 일치하면 true, 아니면 false	*/	
			if(aniArr2[i] instanceof Cat) {
				//aniArr2[i].grumming();
				((Cat)aniArr2[i]).grumming(); 
			}else if(aniArr2[i] instanceof Dog) {
				((Dog)aniArr[i]).protect();
			}else if(aniArr2[i] instanceof Rabbit) {
				((Rabbit)aniArr2[i]).jump();
			}
		}
	
		//메게변수와 다형성
		ZooController zoo = new ZooController();
//		zoo.catBehavior();
//		zoo.dogBehavior();
//		zoo.rabbitBehavior();
		zoo.behavoir(new Cat()); 	
		zoo.behavoir(new Dog());
		zoo.behavoir(new Rabbit());
		
		Scanner scan = new Scanner(System.in);
		Animal a = new Animal(); 
		/*	Animal a; 라고만 선언하면 default에 담을 값이 없기 때문에 오류가 떠서 객체를 생성해줌.
		 * 	Animal a; 라고 선언하고 default에 a = new Animal(); 이라고 해도 됨
		 */
		
		//동물원 프로그램
		System.out.println("==== 동물원 ====");
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		System.out.println("3. 토끼");
		System.out.println("4. 나가기");
		System.out.print("어떤 동물을 보고 싶으신가요?");
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
			System.out.println("잘못 선택하셨습니다.");
		}
		a.walk();
		a.eat();
		a.speak();
		
		
//		//기본적인 객체 사용 방법
//		//해당 클래스를 이용해서 참조변수를 만들고, 객체의 주소를 담아서 사용
//		//각 객체의 참조변수를 이용해서 멤버에 접근		
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
