
public class HelloVar_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 실수형(소수점이하 6자리까지)
		// float으로 선언된 변수에 숫자값을 대입할때는
		// 끝에 영 소문자 f를 붙여준다.
		float korScore = 90.0f;
		float engScore = 80f;
		float mathScore = 70f;
		
		engScore = 88;
		float sum = korScore + engScore + mathScore;
		System.out.println("총점:" + sum);
		
		float avg = sum / 3;
		System.out.println("평균:" + avg);

	}

}
