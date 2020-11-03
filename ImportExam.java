package object.constructor;

import object.method.MethodExam01;
import object.method.*; // *을 쓰면 object.method 안의 모든 클래스를 사용 가능

/*import object.*; 
	object 안의 바로 하위 패키지로 설정했을 때는 하위-하위 클래스 파일을 읽을 수 없음
*	*은 클래스 파일만 인식 - object 안의 클래스들만 인식할 수 있고 
*					  object 아래의 하위 클래스 들은 인식하지 못한다.*/

public class ImportExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다른 패키지 내 클래스 사용
		//1.패키지와 클래스 명을 모두 적어 사용
		object.method.MethodExam02 me02;
		//2.import문 사용 - 클래스 이름만 불러서 사용한다.
		MethodExam01 me01;
		MethodExam03 me03;
	}

}
