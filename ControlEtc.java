package kh.project1.test1;

public class ControlEtc {

	public static void main(String[] args) {
		//���߹ݺ����� ����ϴ� break
		for(int j=0; j<10; j++) {
			System.out.println(j+" �ܺ� ���");
			for(int i = 0; i<10; i++) {
				System.out.println(i+" ���� ���");
				if(i==5) {
					break; /*���� ����� ���(for)�� ��������.
						   if���� break�� ������ ���� �ʴ´�!*/
				}
			}
		}
		//return
		for(int j = 0; j<10; j++) {
			System.out.println(j+" �ܺ� ���");
			for(int i = 0; i<10; i++) {
				System.out.println(i+" ���� ���");
				if(i==5) {
					return; //��� ��ü�� ��������
				}
			}
		}
		//continue
		for(int i = 1; i<=10; i++) {
			System.out.println("for�� �ȿ� ����");
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i+" ���");
		}
				//���� ����
		for(int i = 1; i<=10; i++) {
			System.out.println("for�� �ȿ� ����");
			if(i%2 != 0) {
				System.out.println(i+" ���");
			}
		}
		
		/* break;	//��� ����
		 * return;	//�޼��� ����
		 * System.exit(0)	//���α׷� ����
		 */

	}

}
