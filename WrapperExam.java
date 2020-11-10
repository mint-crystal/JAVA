package wrapper;

public class WrapperExam {
	
	public static void main(String[] args) {
		Integer num1 = new Integer(17);	//박싱
		int n1 = num1.intValue();	//언박싱
		System.out.println(n1);
	
		Integer num2 = 17;	//자동 박싱
		int n2 = num2;	//자동 언박싱
		System.out.println(n2);
		
		//예제
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println("문자열 byte값 변환 : " + b);
		System.out.println("문자열 int값 변환 : "+i);
		System.out.println("문자열 short값 변환 : " + s);
		System.out.println("문자열 long값 변환 : "+l);
		System.out.println("문자열 float값 변환 : "+f);
		System.out.println("문자열 double값 변환 : "+d);
		System.out.println("문자열 bool값 변환 : "+bool);
		
		//값 비교
		Integer num3 = new Integer(10);	//wrapper클래스1
		Integer num4 = new Integer(10); //wrapper클래스2
		int j = 10; //기본타입
		System.out.println("래퍼클래스 == 기본타입 : "+(num3==j)); //true
		System.out.println("래퍼클래스.equals(기본타입) : " + num3.equals(i)); //true
		System.out.println("래퍼클래스 == 래퍼클래스 : "+(num3==num4)); //false
		System.out.println("래퍼클래스.equals(래퍼클래스)"+num3.equals(num4)); //true
		/*래퍼 객체는 객체의 참조 주소를 비교하기 때문에 내부의 값을 비교하기 위해 == 연산자 사용 불가
		 * 래퍼==래퍼 비교는 서로의 참조주소가 다르기 때문에 false
		 * 객체끼리의 비교를 하려면 equals 사용
		 * 기본 자료형과의 비교는 ==연산자와 equals 모두 사용 가능(컴파일러가 자동으로 오토박싱과 오토언박싱을 해주기 때문)
		 */
	}
}