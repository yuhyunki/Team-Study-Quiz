package quiz0106;

import java.util.Scanner;

public class Qqqqqq {

	public static void main(String[] args) {

//		[입력값의 홀수, 짝수 판별] - 5분
//		* 메인클래스에서 호출, 별도의 계산 클레스를 만드세요.
//		1. 1~100사이 1개 정수를 입력 받으세요.  "1~100사이 정수 입력값 : "  
//		2. if문, for문을 활용하여 홀수,짝수 판별식을 만드세요.
//		  <출력 내용>
//		  홀수일때 : "입력하신 수는 홀수 입니다." + a
//		  짝수일때 : "입력하신 수는 짝수 입니다." + a
//		  1~100사이 값이 아닐때 : "1~100사이 정수를 입력하세요"
		
		Qqqqqq app = new Qqqqqq();
		app.calculator();
		
	}
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 100 사이 정수 입력값 : ");
		int num = sc.nextInt();
		
		if(num <= 100 && num >= 1) {
			if(num % 2 == 0) {
				System.out.println("짝수입니다." + num);
			} else {
				System.out.println("홀수입니다." + num);
			}
		} else {
			System.out.println("1 ~ 100 사이 정수를 입력하세요.");
		}
	}

}
