
public class Gugu_05 {

	public static void main(String[] args) {

		int intGu = 0;
		int intEle = 0;

		// 자기자신(intGu)을 6 증가시키는 연산
		intGu += 6; // intGu = intGu + 6
		intEle = 1;
		
		// 자기자신(intEle)를 1증가시키는 연산
		intEle = intEle + 1;
		intEle += 1;
		intEle++ ;
		++intEle;
		
		// 자기자신(intEle)를 1감소시키는 연산
		intEle = intEle - 1;
		intEle -= 1;
		intEle--;
		--intEle;
		
		// 자기자신(??)을 1이아닌 어떤 값으로 가감승제하는 연산
		intGu += 3; // intGu를 3증가
		intGu -= 3; // intGu를 3감소
		intGu *= 3; // intGu = intGu * 3
		intGu /= 3; // intGu = intGu / 3
		intGu %= 2; // intGu = intGu % 2
		
		intGu = 5;
		intEle = 1;
		
		intEle++;
		System.out.println(intGu + "x" + intEle 
				+ "=" + intGu * intEle);
		
		intEle++;
		System.out.println(intGu + "x" + intEle 
				+ "=" + intGu * intEle);

		intEle++;
		System.out.println(intGu + "x" + intEle 
				+ "=" + intGu * intEle);

		intEle++;
		System.out.println(intGu + "x" + intEle 
				+ "=" + intGu * intEle);

		
	}

}
