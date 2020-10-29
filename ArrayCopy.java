package kh.project1.test1;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		//얕은 복사 - 객체의 주소값만 가지고 와서 참조
		int[] arr1 = {10, 20, 30, 40, 50}; //int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = arr1;
		arr1 [0] = 100;
		System.out.println("arr1 주소 : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}System.out.println();
		System.out.println("arr2 주소 : "+arr2); //같은 주소 출력
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		//깊은 복사 - 새로운 배열 객체를 생성하여 기존 배열의 데이터를 복사
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = new int[5];
				//for문 사용
		for(int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr1[0] = 100; //서로 다른 공간에 저장이 되어있기 때문에 arr2[0]의 값은 안 바뀜
		System.out.println("arr1 주소 : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 주소 : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
				//[2]부터 복사
		for(int i = 2; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr1 주소 : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 주소 : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
				//arr1[2]부터 3개 복사
		//int[] arr1 = new int[] {10, 20, 30, 40, 50};
		//int[] arr2 = new int[3]; //3으로 바꾸면 뒤에 두자리가 사라지고 3개의 수만 나옴
		for(int i = 2; i<arr1.length; i++) {
			arr2[i-2] = arr1[i];
		}
		System.out.println("arr1 주소 : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 주소 : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			//System.arraycopy(원본배열, 원본 시작위치, 목적지 시작위치, 복사할 길이);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);  //전체 데이터 복사
		System.arraycopy(arr1, 3, arr2, 3, arr1.length-3); //특정 데이터 복사
			//arr2의 크기를 위에 선언한대로 3으로 한다면 arr2.length로 적어야함
		System.out.println("arr1 주소 : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 주소 : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			//Arrays.copyOf(원본배열, 복사할 길이);
		//arr2 = Arrays.copyOf(arr1, arr1.length); //전체 데이터 복사
		//arr2 = Arrays.copyOf(arr1, 3); // 특정 데이터 복사
		arr2 = Arrays.copyOfRange(arr1, 3, 5);
		System.out.println("arr1 주소 : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 주소 : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			//Arrays.copyOfRange(원본배열, 시작위치, 끝위치+1);
		arr2 = Arrays.copyOfRange(arr1, 3, arr1.length); //특정 데이터 복사
		arr2 = Arrays.copyOfRange(arr1, 3, 5);
		System.out.println("arr1 주소 : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 주소 : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
			//clone
		arr2 = arr1.clone(); //전체 데이터 복사
		System.out.println("arr1 주소 : "+arr1);
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("arr2 주소 : "+arr2);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
