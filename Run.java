package kr.or.iei.project.array;

public class Run {

	public static void main(String[] args) {
		//일반 변수
			//자료형 변수 명 = 값;
			int num = 10;
			num = 20;
			
		//일반 배열
			//자료형[] 배열 명 = new 자료형[크기];
			int [] arr;
			arr = new int[5];	
			arr[0] = 10;	
			//arr - 참조변수, 참조변수의 주소를 따라가면 실제 정수형 공간이 5개 있음
			
		//객체
			//클래스 객체 명 = new 클래스 명();
			ObjectArrayExam01 oae; //클래스의 참조변수 생성
			oae = new ObjectArrayExam01();	//실제 객체생성
			oae.name = "홍길동";
			//oae - 참조변수, 참조변수의 주소를 따라가면 실제 객체 공간 1개가 있음
				//객체 공간 안에 여러 멤버들이 있음
			
		//객체 배열
			//클래스 명[] 객체배열 명 = new 클래스 명[크기];
			ObjectArrayExam01[] oaeArr;	//객체 배열의 참조변수 생성
			oaeArr = new ObjectArrayExam01[5];	//실제 클래스의 참조변수 생성
			//oaeArr - 참조변수1, 참조변수의 주소를 따라가면 객체의 주소를 저장하는 참조변수2 공간 5개 있음
				//참조변수2의 주소를 따라가면 실제 댇체공간 1개가 있음
			//인덱스를 이용한 접근
			oaeArr[0] = new ObjectArrayExam01();	//실제 객체 생성
			//위 코드가 없으면 데이터를 담으려고 하지만 실제 공간이 없어서 실행했을때 런타임오류
			oaeArr[0].name = "김길동";
			oaeArr[0].inform();
			
			//반복문을 이용한 접근
			for(int i = 0; i<oaeArr.length; i++) {
			oaeArr[i] = new ObjectArrayExam01();
			oaeArr[i].name = "김길동";
			oaeArr[i].inform();
			}
			
			//초기값
			int[] arr2 = {10,20,30};
			ObjectArrayExam01[] oaeArr2 = {new ObjectArrayExam01(), new ObjectArrayExam01()};
			
			int[] arr3 = new int[] {10,20,30};
			ObjectArrayExam01 [] oaeArr3 = new ObjectArrayExam01[] {new ObjectArrayExam01(), new ObjectArrayExam01()};
			
	}

}
