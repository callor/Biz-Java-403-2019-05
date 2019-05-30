
public class Boolean_06 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		boolean bYes = true;
		
		// && 두개 이상의 비교연산결과가 모두 true인가를 판단
		// AND 연산이라고 한다.
		bYes = (num1 == num2) && (num3 == num4); // f and f : 결과 false
		bYes = num1 == num1 && num3 == num4; // t and f : 결과 false
		bYes = num1 == num2 && num3 == num3; // f and t : 결과 false
		bYes = num2 == num2 && num3 == num3; // t and t : 결과 true
		
		// || 두개 이상의 비교연산결과중 1개라도 true인가를 판단
		// OR 연산이라고 한다.
		bYes = num1 == num2 || num3 == num4; // f or f 결과 false
		bYes = num1 == num1 || num3 == num4; // t or f 결과 true
		bYes = num1 == num2 || num3 == num3; // f or t 결과 true
		bYes = num1 == num1 || num3 == num3; // t or t 결과 true
		
		// (false or true) and false ==> true and false
		bYes = (num1 == num2 || num3 == num3) && num4 == num3;
		System.out.println(bYes);
		
		num4 = 3 + (4 * ((5 - 2) % 3));
		
	}

}
