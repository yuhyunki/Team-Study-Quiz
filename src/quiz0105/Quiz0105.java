package quiz0105;

import java.util.Random;

public class Quiz0105 {

	public static void main(String[] args) {

//		세가지 정수 20, 30, 40 이 있다.
//
//		큰 두 수를 먼저 더하고 작은 수를 뺀 값을 구하여라
//
//		- 변수명은 제시된 순서대로 first, second, third로 한다.
//
//		- 메소드를 이용할 것
//
//		-----결과 예시 ----
//
//		큰 두 수를 먼저 더하고 작은 수를 뺀 결과 : 50
		
		Quiz0105 app = new Quiz0105();
		
		int first = 20;
		int second = 30;
		int third = 40;
		
		app.calculator(first, second, third);
		
		app.randomRandom();
	}
	
	public void calculator(int first, int second, int third) {
		int large = 0;
		int middle = 0;
		int small = 0;
		
		if(first >= second && first >= third) {
			large = first;
		} else if (first >= second || first >= third) {
			middle = first;
		} else {
			small = first;
		}
		if(second >= first && second >= third) {
			large = second;
		} else if (second >= first || second >= third) {
			middle = second;
		} else {
			small = second;
		}
		if(third >= second && third >= first) {
			large = third;
		} else if (third >= second || third >= first) {
			middle = third;
		} else {
			small = third;
		}
				
		System.out.println("큰 두 수를 먼저 더하고 작은 수를 뺀 결과 : " + (large + middle - small));
	}
	
//	[원하는 범위의 난수 생성, 상항연산자]
//			-100부터 100사이의 정수를 구하는 난수를 생성하고
//			난수가 음수인지 양수인지 0인지 구하는 상항연산자를 작성하시오.
//			난수 변수명 = randomy
//			상항 연산자 = resulty
//
//			밑 출력 예시 중 하나만 나오면 됩니다.
//
//			——————- 출력 예시 ——————
//			39은 양수입니다.
//			——————————-
//			-85은 음수입니다.
//			——————————
//			0입니다.
	
	public void randomRandom() {
		
		int randomy = 0;
//		Random random = new Random();
		randomy = (int) (Math.random() * 201 + -100);
		
		String resulty = (randomy == 0)? "0입니다." : (randomy > 0)? randomy + "은 양수입니다." : randomy + "은 음수입니다.";
		System.out.println(resulty);
		
	}
	
}
