
public class HelloVar_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Ǽ���(�Ҽ������� 6�ڸ�����)
		// float���� ����� ������ ���ڰ��� �����Ҷ���
		// ���� �� �ҹ��� f�� �ٿ��ش�.
		float korScore = 90.0f;
		float engScore = 80f;
		float mathScore = 70f;
		
		engScore = 88;
		float sum = korScore + engScore + mathScore;
		System.out.println("����:" + sum);
		
		float avg = sum / 3;
		System.out.println("���:" + avg);

	}

}
