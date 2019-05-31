
public class Boolean_02 {

	public static void main(String[] args) {

		int intNum = 20;
		boolean bYes = true;

		bYes = intNum == 50;
		System.out.println(bYes);
		
		// 1. intNum에 담긴 20을 연산장치로 가져오기
		// 2. 어딘가 저장된 30을 연산장치로 가져오기
		// 3. intNum에서 30을 뺄셈, 결과 : -10
		// 4. intNum에 담긴 20을 또 연산장치로 가져오기
		// 5. 3에서 계산된 결과 -10을 연산장치로 가져오기
		// 6. 두 값을 비교(같냐?) 
		// 7. 결과인 false를 bYes에 담기
		bYes = intNum == intNum - 30;
		bYes = 20 == 20 - 30;
		bYes = 20 == -10;
		bYes = 1 == -1;
		
		
		
	}

}
