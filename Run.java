package kr.or.iei.project.array;

public class Run {

	public static void main(String[] args) {
		//�Ϲ� ����
			//�ڷ��� ���� �� = ��;
			int num = 10;
			num = 20;
			
		//�Ϲ� �迭
			//�ڷ���[] �迭 �� = new �ڷ���[ũ��];
			int [] arr;
			arr = new int[5];	
			arr[0] = 10;	
			//arr - ��������, ���������� �ּҸ� ���󰡸� ���� ������ ������ 5�� ����
			
		//��ü
			//Ŭ���� ��ü �� = new Ŭ���� ��();
			ObjectArrayExam01 oae; //Ŭ������ �������� ����
			oae = new ObjectArrayExam01();	//���� ��ü����
			oae.name = "ȫ�浿";
			//oae - ��������, ���������� �ּҸ� ���󰡸� ���� ��ü ���� 1���� ����
				//��ü ���� �ȿ� ���� ������� ����
			
		//��ü �迭
			//Ŭ���� ��[] ��ü�迭 �� = new Ŭ���� ��[ũ��];
			ObjectArrayExam01[] oaeArr;	//��ü �迭�� �������� ����
			oaeArr = new ObjectArrayExam01[5];	//���� Ŭ������ �������� ����
			//oaeArr - ��������1, ���������� �ּҸ� ���󰡸� ��ü�� �ּҸ� �����ϴ� ��������2 ���� 5�� ����
				//��������2�� �ּҸ� ���󰡸� ���� ��ü���� 1���� ����
			//�ε����� �̿��� ����
			oaeArr[0] = new ObjectArrayExam01();	//���� ��ü ����
			//�� �ڵ尡 ������ �����͸� �������� ������ ���� ������ ��� ���������� ��Ÿ�ӿ���
			oaeArr[0].name = "��浿";
			oaeArr[0].inform();
			
			//�ݺ����� �̿��� ����
			for(int i = 0; i<oaeArr.length; i++) {
			oaeArr[i] = new ObjectArrayExam01();
			oaeArr[i].name = "��浿";
			oaeArr[i].inform();
			}
			
			//�ʱⰪ
			int[] arr2 = {10,20,30};
			ObjectArrayExam01[] oaeArr2 = {new ObjectArrayExam01(), new ObjectArrayExam01()};
			
			int[] arr3 = new int[] {10,20,30};
			ObjectArrayExam01 [] oaeArr3 = new ObjectArrayExam01[] {new ObjectArrayExam01(), new ObjectArrayExam01()};
			
	}

}
