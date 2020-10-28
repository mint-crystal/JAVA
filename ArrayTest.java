package kh.project1.test1;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr); //배열의 주소가 출력. [I@15db9742
//		
//		/*초기값 설정을 안 했을 때(선언만 하고 출력할때)
//		초기 값  : boolean - false, char - \u0000
//		정수형 - 0 , 실수형 - 0.0, 참조형 - null*/
//		
//		//for문을 사용한 배열
//		int[] arr = new int[5];
//		for(int i = 0; i<5; i++) {
//			arr[i] = (i+1)*10;
//		}
//		for(int i = 0; i<5; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int[] arr1 = new int[100];
//		for(int i = 0; i<arr1.length; i++) { 
//			//arr1.length = 배열의 크기만큼 알아서 반복문을 진행
//			arr1[i] = (i+1)*10;
//		}
//		for(int i = 0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		
//		//규칙이 없는 배열 입력받기
//		String [] cClass = new String[5];
//		Scanner scan = new Scanner(System.in);
//		for(int i = 0; i<cClass.length; i++) {
//			System.out.print("이름 입력 : ");
//			cClass[i] = scan.next();
//		}
//		System.out.println("## C강의장 학생목록 ##");
//		for(int i=0; i<cClass.length; i++){
//			System.out.println("이름 : "+cClass[i]);
//		}
//		System.out.println("우리 반의 다섯번째 학생은"+cClass[4]+"님 입니다."); //따로 꺼내와서 사용
//		cClass[4] = "이서윤";
//		System.out.println("우리 반의 다섯번째 학생은"+cClass[4]+"님 입니다."); //값 덮어씌우기
//		
//		int[] arr2 = {10, 20, 30, 40, 50};
//		//arr2 = {20, 30, 40, 50, 60}	-변수를 처음 초기화할때만 한꺼번에 값 선언가능
//		//for문을 이용해 초기값을 바꾸기
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println("초기 값 : "+arr2[i]);
//		}
//		for(int i=0; i<arr2.length; i++){
//			arr2[i] = ((i+1)*10)+10;
//		}
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println("변경된 값 : "+arr2[i]);
//		}
//		
//		//5개의 수를 입력받아 합을 구하는 프로그램 만들기(배열이용)
//		Scanner sc = new Scanner(System.in);
//		int[] arr0 = new int[5];
//		int sum = 0;
//		for(int i = 0; i<arr0.length; i++) {
//			System.out.print((i+1)+"번째 수 입력 : ");
//			arr0[i] = sc.nextInt();
//			}
//		for(int i = 0; i<arr0.length; i++) {
//			sum+=arr0[i];
//		} 
//		System.out.printf("%d + %d + %d + %d + %d = %d",arr0[0],arr0[1],arr0[2],arr0[3],arr0[4],sum);
		//5개의 수를 입력받아 합을 구하는 프로그램 만들기(배열이용) 방법2
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		int sum = 0;
		for(int i=0; i<number.length; i++) {
			System.out.print(i+1+"번째 수 입력 : ");
			number[i] = scan.nextInt();
			sum += number[i];
		}
		for(int i = 0; i<number.length; i++) {
			System.out.print(number[i]);
			if(i!=number.length-1) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = "+sum);
//		//랜덤값 추출
//			//실수 형태의 랜덤값 추출(0.0<=랜덤값 <1.0)
//		System.out.println(Math.random());
//			//(형변환)(Math.random()*갯수+시작수)
//		System.out.println((int)(Math.random()*45+1));
	}

}
