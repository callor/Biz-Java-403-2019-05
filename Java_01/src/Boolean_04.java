
public class Boolean_04 {

	public static void main(String[] args) {

		// intNum1�� intNum2�� ����� �غ� �ϴ� ����
		int intNum1 = 0;
		int intNum2 = 0;
		System.out.println(intNum1);
		
		// ������ �����Ҷ�
		// ���� �ƹ��͵� �������� ������
		// ������ ����� �غ� ���� ���� ���°� �ȴ�.
		// �׷��� ���������� �б⸦ �õ��ϸ�
		// ���������� ����.
		int intNum3;
		// System.out.println(intNum3); // �������� �߻�
		
		intNum3 = 30;
		System.out.println(intNum3);
		
		int intNum4;
		intNum4 = 0;
		
		boolean bYes = true;
		
		intNum1 = 40;
		intNum2 = 50;
		
		bYes = intNum1 == intNum2; // false
		bYes = intNum1 > intNum2; // false
		bYes = intNum1 < intNum2; // true
		bYes = intNum1 >= intNum2; // false;
		bYes = intNum1 <= intNum2; // true;
		
		// != : not ������
		// �ΰ��� �ٸ���?
		bYes = intNum1 != intNum2; // true
		
		intNum1 = intNum2;
		bYes = intNum1 != intNum2; // false
		
		
		
		
	}

}
