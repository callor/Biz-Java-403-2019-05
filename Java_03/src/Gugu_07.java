
public class Gugu_07 {

	public static void main(String[] args) {

		int intNum = 0;
		
		intNum += 1; // 1
		System.out.println(intNum); // 1
		
		System.out.println(intNum); // 1출력
		intNum += 1; // 13번째 줄 표시에 영향을 미친다
		
		System.out.println(intNum); // 2출력
		
		intNum = 0;
		// ++ 가 변수뒤에 있으며
		// 다른 명령문내에 포함이 되는 경우는
		// 다른 명령문이 모두 실행된 후 변수 값을 1증가 시킨다.
		// 따라서 현재 실행되는 명령문에는 아무런 영향을 미치지 않는다
		System.out.println(intNum++); // 0출력
		
		// 21번 명령문이 끝나면서 intNum를 1증가 시킨영향으로
		// 1이 출력된다.
		System.out.println(intNum); // 1 출력
		
		// ++ 가 단독(단독명령문)으로 실행될때는
		// 앞에있으나 뒤에있으나 똑같다.
		intNum++;
		++intNum;
		
		// 다른명령문과 함께 쓰일때는 위치에 따라 값이 달라진다.
		System.out.println(++intNum);
				
		
		
		
	}

}
