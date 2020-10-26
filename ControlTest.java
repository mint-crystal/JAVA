package kh.project1.test1;

import java.util.Scanner;

public class ControlTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//if문
		if(num>0) {
			System.out.println("양수입니다.");
			System.out.println("조건이 참입니다.");
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
		System.out.println("프로그램 종료");
		
		if(num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		if(num>0) {
			System.out.println("0보다 큰 수");
		} else if (num<0) {
			System.out.println("0보다 작은 수");
		} else {
			System.out.println("0과 같은 수");
		}
		
		
		//이렇게 하면 0을 입력받았을 때 짝수로 인식되어 "짝수입니다"가 출력됨.(0%2=0이므로)
		if(num%2==0) {
			System.out.println("짝수입니다");
		} else if (num%2==1) {
			System.out.println("홀수입니다");
		}else {
			System.out.println("0입니다");
		}
		//0을 입력받았을 때 "0입니다"를 출력하기 위해서는 조건식의 순서를 바꿈
		if(num==0) {
			System.out.println("0입니다");
		} else if (num%2==1) {
			System.out.println("홀수입니다");
		}else {
			System.out.println("짝수입니다");
		}
		//또는 if를 중첩해서 사용
		if(num%2==0) {
			if(num==0) {
				System.out.println("0입니다");
			} else{
			System.out.println("짝수입니다");
			}
		}else {
			System.out.println("홀수입니다");
		}
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		String season="";
		if(month==1||month==2||month==12) {
			season = "겨울";
		} else if(month>=3 && month<=5) {
			season = "봄";
		} else if(month>=6 && month<=8) {
			season="여름";
		} else if(month>=9 && month<=11) {
			season = "가을";
		} else {
			//season = "해당하는 계절이 업습니다.";
			System.out.println("해당하는 계절이 없습니다.");
		}
		System.out.println(season);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		System.out.print("온도 입력 : ");
		int temperature = sc.nextInt();
		String season;
		if (month == 1 || month == 2 || month ==12) {
			season = "겨울";
			if(temperature <= -15) {
				season += "\n한파 경보";
			} else if (temperature <= -12){
					season += "\n한파 주의보";
			}
		} else if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";
			if(temperature >= 35) {
				season += "\n폭염 경보";
			} else if(temperature >= 33) {
				season += "\n폭염 주의보";
			}
		} else if (month >= 9 && month <=11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season);
	
		
		//switch문
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int select = scan.nextInt();
		switch (select)
		{
		case 1 : System.out.println("1 입력");
		case 2 : System.out.println("2 입력");
		case 3 : System.out.println("3 입력");
		case 4 : System.out.println("4 입력");
		default : System.out.println("기타입력");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int select = scan.nextInt();
		switch (select)
		{
		case 1 : System.out.println("1 입력");
			break;
		case 2 : System.out.println("2 입력");
			break;
		case 3 : System.out.println("3 입력");
			break;
		case 4 : System.out.println("4 입력");
			break;
		default : System.out.println("기타입력");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int select = scan.nextInt();
		switch (select/10)
		{
		case 0 : System.out.println("0~9입력");
			break;
		case 1 : System.out.println("10~19 입력");
			break;
		case 2 : System.out.println("20~29 입력");
			break;
		case 3 : System.out.println("30~39 입력");
			break;
		case 4 : System.out.println("40~49 입력");
			break;
		default : System.out.println("기타입력");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int select = scan.nextInt();
		switch (select)
		{
		case 0 : 
		case 5 : System.out.println("0 또는 5 입력");
			break;
		case 3 : 
		case 7 : 
		case 9 : System.out.println("3,7,9 입력");
			break;
		default : System.out.println("기타입력");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름를 입력하세요 : ");
		String select = scan.next();
		switch (select)
		{
		case "이은지" : 
		case "김우영" : System.out.println("1팀입니다.");
			break;
		case "최민재" : 
		case "김지민" : 
		case "박주희" : System.out.println("2팀입니다.");
			break;
		//default : System.out.println("기타입력");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String team;
		switch(num%5) {
		case 1 : team = "1조";
			break;
		case 2 : team = "2조";
			break;
		case 3 : team = "3조";
			break;
		case 4 : team = "4조";
			break;
		default : team = "다시";
		}
		System.out.println(team);
	}
}

		
	

