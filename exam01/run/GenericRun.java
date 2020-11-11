package com.kh.project.exam01.run;

import com.kh.project.exam01.model.vo.GenericExam01;

public class GenericRun {

	public static void main(String[] args) {
//		/* ���׸� ���� �� Ŭ���� ���
//		 * - �Ű����� ������ : public GenericExam01(int var1, int var2)
//		 */
//		GenericExam01 ge01 = new GenericExam01(10, 20);	//���� ��� ����
//		//GenericExam01 ge02 = new GenericExam01(1.5, 2.5);	//���� �߻�
//		GenericExam01 ge03 = new GenericExam01('A','B');	//���Ϲ���<=>����ȣȯ����. ���� ��밡���ϳ� �������� ������ ����
//		//GenericExam01 ge04 = new GenericExam01("Hi", "bye");	//�����߻�
//
//		
//		/* ���׸� ���� �� Ŭ���� ���
//		 * - Ŭ���� : public class GenericExam01<T>
//		 * - �Ű����� ������ : public GenericExam01(T var1, T var2)
//		 */
//		GenericExam01<Integer> ge01 = new GenericExam01<Integer>(10, 20);	
//		GenericExam01<Double> ge02 = new GenericExam01<Double>(1.5, 2.5);	
//		GenericExam01<Character> ge03 = new GenericExam01<Character>('A','B');	
//		GenericExam01<String> ge04 = new GenericExam01<String>("Hi", "bye");	
		
		
		/* ���׸� ��Ƽ �Ķ���� ���� �� Ŭ���� ���
		 * - Ŭ���� : public class GenericExam01<T,M>
		 * - �Ű����� ������ : public GenericExam01(T var1, M var2)
		 */
		GenericExam01<Integer,Integer> ge01 = new GenericExam01<Integer,Integer>(10, 20);	
		GenericExam01<Double,Double> ge02 = new GenericExam01<Double,Double>(1.5, 2.5);	
		GenericExam01<Character,Character> ge03 = new GenericExam01<Character,Character>('A','B');	
		GenericExam01<String,String> ge04 = new GenericExam01<String,String>("Hi", "bye");	
		GenericExam01<Integer, Double> ge5 = new GenericExam01(10, 1.5); //���׸� Ÿ�� ��������
		GenericExam01<Character, String>ge06;
		ge06 = new GenericExam01('a', "Hello");
		//ge06 = new GenericExam01() //�������� �Ű����� ���̵� ��밡��(�⺻������)
		
		GenericExam01<Integer, Double> ge07 = new GenericExam01();
		ge07.var1 = 10;	//���������� ���ż� �� ���� ����
		//ge07.var1 = 1.5; //������ ������ �Ǽ����� �����Ϸ����ؼ� ���� �߻�
		
		/* ���׸� �޼ҵ�
		 * - public <A> A method01(A num)
		 */
		System.out.println(ge07.<Integer>method01(10));	//����
		System.out.println(ge07.method01(10));	//���� ���� ���� ������ Ÿ���� �� �� �ֱ� ������ ���� ����
		System.out.println(ge07.method01(1.5));
		System.out.println(ge07.method01('A'));
	}

}
