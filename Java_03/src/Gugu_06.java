
public class Gugu_06 {

	public static void main(String[] args) {

		int intGu = 2;
		int intEle = 2;
		
		// intEle++;
		System.out.println(intGu+"x"+intEle+"="+intGu*intEle);
		intEle++;
		
		intEle = intEle + 1;
		System.out.println(intGu+"x"+intEle+"="+intGu*(intEle++));
		// System.out.println(intGu+"x"+intEle+"="+intGu*(intEle+=1));
		System.out.println(intGu+"x"+intEle+"="+intGu*(intEle++));
		System.out.println(intGu+"x"+intEle+"="+intGu*(intEle++));
		System.out.println(intGu+"x"+intEle+"="+intGu*(intEle++));

		intEle++;
		System.out.println(intGu+"x"+intEle+"="+intGu*intEle);
		System.out.println(intGu+"x"+(++intEle)+"="+intGu*intEle);
		
	}

}
