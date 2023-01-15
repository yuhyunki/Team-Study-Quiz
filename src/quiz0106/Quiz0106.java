package quiz0106;

import java.util.Random;

public class Quiz0106 {

	public static void main(String[] args) {

//		for문을 이용하여 각각 보리와 쌀 단어만을 가지고
//		보리보리쌀이 나오게 세줄 반복하세요
//		단, 출력값 "보리보리쌀" 이렇게 넣으면 안됨. 보리와 쌀은 개별 출력값입니다.
//
//		——출력 예시——
//		보리보리쌀
//		보리보리쌀
//		보리보리쌀
		
//		랜덤한 수 1 ~ 100이 나오는 RandomStart 메소드를 만든 후
//		총 5번 나오도록 for문으로 호출하세요. (그 외 변수명 random으로)
//
//		——출력 예시——
//
//		62
//		51
//		97
//		83
//		96 
		
//		60~100사이의 무작위 난수로 점수를 생성하고
//
//		~70 까지 D
//
//		60~70 까지 C
//
//		70~80 까지 B
//
//		90~100 까지 A 등급이다.
//
//		A등급이 나올 때까지 점수에 10점씩 더하면서 출력하는 for문을 작성하시오.
//
//		———-출력 예시—--
//
//		이번 시험 성적은 D입니다.
//		이번 시험 성적은 C입니다.
//		이번 시험 성적은 B입니다.
//		이번 시험 성적은 B입니다.
//		이번 시험 성적은 A입니다.
//
		
//		[입력값의 홀수, 짝수 판별] - 5분
//		* 메인클래스에서 호출, 별도의 계산 클레스를 만드세요.
//		1. 1~100사이 1개 정수를 입력 받으세요.  "1~100사이 정수 입력값 : "  
//		2. if문, for문을 활용하여 홀수,짝수 판별식을 만드세요.
//		  <출력 내용>
//		  홀수일때 : "입력하신 수는 홀수 입니다." + a
//		  짝수일때 : "입력하신 수는 짝수 입니다." + a
//		  1~100사이 값이 아닐때 : "1~100사이 정수를 입력하세요"
		
		Quiz0106 app = new Quiz0106();
//		
//		String bori = "보리";
//		String rice = "쌀";
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(bori + bori + rice);
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(app.randomStart());
//		}
				
//		for(int i = app.scoreGenerator(); i < 90; i += 10) {
//			for(int j = i; j < 80; j += 10) {
//				for(int k = j; k < 70; k += 10) {
//					for(int l = k; l < 60; l += 10) {
//						System.out.println(l);
//					}
//					System.out.println("등급은 d");
//				}
//				System.out.println("등급은 c");
//			}
//			System.out.println("등급은 b");
//		}
//		System.out.println("A등급 축하드립니다!");
	}

//	public int randomStart() {
//		Random random = new Random();
//		int randInt = random.nextInt(100) + 1;
//		return randInt;
//	}
	
//	public int scoreGenerator() {
//		Random random = new Random();
//		int score = random.nextInt(41) + 60;
//		return score;
//	}
	
	
	
}
