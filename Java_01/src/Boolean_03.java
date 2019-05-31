
public class Boolean_03 {

	public static void main(String[] args) {

		int intNum1 = 30;
		int intNum2 = 50;
		
		boolean bYes = true;
		
		// intNum1에 담긴 값과 intNum2에 담긴 값이 같냐?
		bYes = intNum1 == intNum2;
		
		// intNum1에 담긴 값이 intNum2에 담긴 값보다 크냐
		bYes = intNum1 > intNum2;
		
		// intNum1에 담겨(저장)있는 값을 복사(읽기)해서
		// intNum2에 저장(대입,할당)하라
		// 변수가 변수에 저장되는 것이 아니다!!!!
		intNum2 = intNum1;
		bYes = intNum1 > intNum2 ; // 결과 : false
		
		// intNum1이 intNum2보다 크거나 같냐?
		bYes = intNum1 >= intNum2 ; // 결과 : true
		
		// intNum1이 intNum2보다 작거나 같냐?
		bYes = intNum1 <= intNum2; // 결과 : true
		
		intNum1 = 100;
		bYes = intNum1 == intNum2; // 결과 : false
		
		
		
	}

}
