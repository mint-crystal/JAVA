package object.Field;

public class Run {

	public static void main(String[] args) {
//		//static Field
//		//		StaticFieldExam.var2 = 10;
//		System.out.println(StaticFieldExam.var2);
//		StaticFieldExam sfe = new StaticFieldExam();
//		System.out.println(sfe.var1);
//		System.out.println(sfe.var2);
//		StaticFieldExam sfe2 = new StaticFieldExam();
//		System.out.println("�ʱ����");
//		System.out.println(sfe.var1);
//		System.out.println(sfe.var2);
//		System.out.println(sfe2.var1);
//		System.out.println(sfe2.var2);
//		sfe.var1 = 100;
//		sfe.var2 = 200;
//		System.out.println("sfe ��ü �� ����");
//		System.out.println(sfe.var1);
//		System.out.println(sfe.var2);
//		System.out.println(sfe2.var1);
//		System.out.println(sfe2.var2);
//		
//		System.out.println(StaticFieldExam.count);
//		StaticFieldExam sfe01 = new StaticFieldExam();
//		System.out.println(sfe01.count);
//		StaticFieldExam sfe02 = new StaticFieldExam();
//		System.out.println(sfe02.count);
//		StaticFieldExam sfe03 = new StaticFieldExam();
//		System.out.println(sfe03.count);
//		
//		//final Field
//		FinalFieldExam ffe = new FinalFieldExam();
//		ffe.num1 = 10;
//		//ffe.NUM2 = 100;	//final Field - �� ���� �Ұ���
//		System.out.println(ffe.NUM2);	//final Field - �� �д� �� �� ��
		
		//�ʱ�ȭ
//		InitialExam ie = new InitialExam();
//		System.out.println("### �ʱⰪ ###");
//		System.out.println(ie.var1);	//boolean
//		System.out.println(ie.var2);	//int
//		System.out.println(ie.var3);	//double
//		System.out.println(ie.var4);	//char
//		System.out.println(ie.var5);	//String
//		ie.var2 = 30;
//		InitialExam ie2 = new InitialExam(); //��ü�� �����Ǹ� �ʱ�ȭ�� �Ǳ� ������ var2 = 20 ���
			//static �ʱ�ȭ
		InitialExam.var2 = 100;
		System.out.println(InitialExam.var2);
		InitialExam ie201 = new InitialExam();
		System.out.println(ie201.var1);
		System.out.println(ie201.var2);
		
	}

}
