package kh.project1.test1;

public class ControlEtc {

	public static void main(String[] args) {
		//다중반복문에 사용하는 break
		for(int j=0; j<10; j++) {
			System.out.println(j+" 외부 출력");
			for(int i = 0; i<10; i++) {
				System.out.println(i+" 내부 출력");
				if(i==5) {
					break; /*가장 가까운 제어문(for)를 빠져나옴.
						   if문은 break의 영향을 받지 않는다!*/
				}
			}
		}
		//return
		for(int j = 0; j<10; j++) {
			System.out.println(j+" 외부 출력");
			for(int i = 0; i<10; i++) {
				System.out.println(i+" 내부 출력");
				if(i==5) {
					return; //제어문 전체를 빠져나옴
				}
			}
		}
		//continue
		for(int i = 1; i<=10; i++) {
			System.out.println("for문 안에 들어옴");
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i+" 출력");
		}
				//위와 같음
		for(int i = 1; i<=10; i++) {
			System.out.println("for문 안에 들어옴");
			if(i%2 != 0) {
				System.out.println(i+" 출력");
			}
		}
		
		/* break;	//제어문 종료
		 * return;	//메서드 종료
		 * System.exit(0)	//프로그램 종료
		 */

	}

}
