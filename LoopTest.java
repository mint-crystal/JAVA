package kh.project1.test1;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		//while문
		int i=1; //초기식
		while(i<=10) {	//조건식
			System.out.println("i 변수 값 : "+i);
			i++;	//증감식
		}
		//수를 입력 받아서 입력받은 수 만큼 출력 
		Scanner sc = new Scanner(System.in);
		System.out.print("반복할 횟수 : ");
		int a = sc.nextInt();
		int j = 1;
		while(j<=a) {
			System.out.println(j+"번째 반복");
			j++;
		}
				//if문을 활용
		while(true) {
			if(j>=a)
				//return;	//메소드 자체를 종료하는 분기문
				break;		//while문을 종료하는 분기문(if문은 break에 영향을 받지X)
			j++;
			System.out.println(j+"번째 반복");
		}
				//반대로 수를 출력
		System.out.print("반복할 횟수 : ");
		int count = sc.nextInt(); //초기식
		while(count>0) { //조건식
			System.out.println(count+"반복");
			count--; //증감식
		}
		System.out.println("프로그램 종료부분");
		
		//수를 입력받아 0부터 입력 받은 수까지의 합 구하기 - 방법1
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int x = 0; //x=1로 해도 상관없음
		int sum = 0;
		while(x<=num) {
			//int sum; 선언 후 sum=x; 넣어서 사용할 수도 있음
			sum = sum+x;
			x++;
		}
		System.out.println(sum);
		
		//수를 입력받아 0부터 입력 받은 수까지의 합 구하기 - 방법2
		int num = sc.nextInt();
		int sum = 0;
		while(num>=0) {
			sum = sum+num;
			num--;
		}
		System.out.println(sum);
		
		//수를 입력받아 0부터 입력받은 수까지의 짝수들 합 구하기 1
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int x = 0; 
		int sum = 0;
		while(x<=num) {
			if(x%2==0) {
			sum = sum+x;
			}
			x++;
		}
		System.out.println(sum);

		//수를 입력받아 0부터 입력받은 수까지의 짝수들 합 구하기 2 - 다시
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int x = 0; 
		int sum = 0;
		while(x<=num) {
			sum = sum+x;
			x+=2;
			}
		System.out.println(sum);
		
		//구구단 출력하기(입력받은 단 하나)
		System.out.print("몇 단을 출력하시겠습니까? ");
		int y = sc.nextInt();
		int n = 1;
		while(n<=9) {
			System.out.println(y+" x "+n+" = "+y*n);
			//System.out.printf("%d x %d = %d \n", y, n, y*n);
			n++;
		}
		
		//do while
		int i = 1;
		do {
			System.out.println(i+"출력");
			i++;
		}while(i<=10);
		
		Scanner scan = new Scanner(System.in);
		int num;
		do{
			System.out.print("정수 입력(종료:0) : ");
			num = scan.nextInt();
			System.out.println("입력 값 : "+num);
		}while(num!=0);
				///while문으로 처리
		int num = 1;
		while (num!=0) {
			System.out.print("정수 입력(종료:0) : ");
			num = scan.nextInt();
			System.out.println("입력 값 : "+num);
		}

		//for문
		for(int i = 1; i<=10; i++) {
			System.out.println(i+"출력");
		} //위 아래의 i는 서로 다른 i. 변수를 넣어 새로 초기화하였기 때문에
		for(int i = 1, j=10; i<=10; i++, j--) {
			System.out.println(i+"출력");
			System.out.println(j+"출력");
		}		
		//수를 입력 받아서 입력 받은 수 만큼 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("반복할 횟수 : ");
		int e = sc.nextInt();
		for(int f = 1; f<=e; f++) {
			System.out.println(f+"번째 반복");
		}
		
		//중첩 for문
		for(int i = 0; i<10; i++) {
			System.out.println("## 외부 반복문"+i);
			for(int j=0; j<10; j++) {
				System.out.println("외부"+i+"에 대한 내부 반복문"+j);
			}
		}
		//구구단 출력하기(2~9단)
		for(int a = 2; a<10; a++) {
			for(int b=1; b<10; b++) {
				System.out.println(a+" x "+b+" = "+a*b);
				// = System.out.printf("%d x %d = %d\n", a, b, a*b)
			}
		}
		int j = 2;
		while(j<10) {
			int i = 1;
		while(i<10) {
			System.out.printf("%d x %d = %d\n", j, i, j*i);
			i++;
		} j++;
		}
		for(int a = 2; a<10; a++) {
			for(int b = 1; b<10; b++) {
				System.out.printf("%d x %d = %d\t", a, b, a*b);
			} System.out.println();
		} 
		System.out.println();
		for	(int y = 1; y<10; y++) {
			for(int z = 2; z<10; z++) {
				System.out.printf("%d x %d = %d\t", z, y, z*y);
			} System.out.println();
		}
	}

}
