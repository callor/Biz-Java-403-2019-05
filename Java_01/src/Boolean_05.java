
public class Boolean_05 {

	public static void main(String[] args) {

		int intNum1 = 0;
		int intNum2 = 0;
		
		boolean bYes = true;
		
		intNum1 = 10;
		
		// 변수명 앞에 -를 붙이면 변수 * -1 연산을 수행한 것과 같다.
		intNum1 = -intNum1;
		System.out.println(intNum1);
		
		intNum1 = -1 * intNum1;
		
		bYes = intNum1 == -intNum1; // false
		bYes = intNum1 != -intNum1; // true
		
		bYes = !bYes; // bYes = not bYes;
		bYes = bYes != bYes; // false
		bYes = bYes == bYes; // true
		bYes = bYes == !bYes;// false
		bYes = bYes != !bYes;// true
		
		
		
	}

}
