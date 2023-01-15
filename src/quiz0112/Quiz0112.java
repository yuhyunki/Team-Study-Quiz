package quiz0112;

import java.util.Scanner;

public class Quiz0112 {

	public static void main(String[] args) {

		/* 도정 */
//		입력(num), 배열(arr), 메소드명(randomMaker(int i)) * 메소드는 클래스를 따로 만들 필요 없음
//
//		스캐너를 통해 **원하는 배열의 길이값**을 입력받은 뒤
//		**1 ~ 50까지의 난수를 발생시키는 static 메소드**를 이용하여
//		입력한 배열의 길이만큼 **난수들을 정수 배열의 인덱스에 각각 대입**하고 출력하세요.
//
//		*발생한 난수들의 중복 상관없음
//
//		———출력 예시———
//
//		원하는 배열의 길이를 입력하시오 : 7
//		47 42 7 37 13 17 22

		Scanner sc = new Scanner(System.in);
//		System.out.println("원하는 배열의 길이를 입력하시오 : ");
//		int num = sc.nextInt();
//		
//		Quiz0112 app = new Quiz0112();
//		int[] arr = new int[num];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = app.randomMaker();
//			System.out.print(arr[i] + " ");
//		}
		
//		- 과일 4개와 가격을 입력받고
//		- 배열을 선언하고 할당한 후
//		- 조건문을 사용하여 저장 및 각 과일의 이름과 가격을 출력하세요.
//
//		입력 예) 
//		1번째과일을 입력하세요 : 사과
//		1번째과일 가격을 입력하세요 : 100
//		’
//		’4개입력
//
//		출력 예)
//
//		1번쩨과일은 사과, 가격은 100 입니다.
//		2번쩨과일은 귤, 가격은 200 입니다.
//		3번쩨과일은 포도, 가격은 250 입니다.
//		4번쩨과일은 바나나, 가격은 400 입니다.

//		String[] fruit = new String[4];
//		int[] price = new int[4];
//		for (int i = 0; i < 4; i++) {
//			System.out.println((i + 1) + "번째 과일을 입력하세요 : ");
//			fruit[i] = sc.nextLine();
//			System.out.println((i + 1) +"번째 과일의 가격을 입력하세요 : ");
//			price[i] = sc.nextInt();
//			sc.nextLine();
//		}
//		
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i + "번째 과일은 " + fruit[i] + ", 가격은 " + price[i] + "입니다.");
//		}
		
//		짜장면 짬뽕 탕수육 중에 오늘 어떤 반반 메뉴를 먹을지 고르는 문제이다.
//		메뉴는 랜덤으로 골라지며, 배열을 통하여 메뉴를 생성한다.
//		만일 골라진 두개의 메뉴가 같으면 “아쉽지만 오늘은 00만 먹어야겠네” 라고 출력하고 
//		만일 다른 두 메뉴를 고르면 “오늘은 oo xx 메뉴 반반을 먹자!”라고 출력한다.
//
//		===출력 예제===
//		오늘은 짬뽕 탕수육 반반을 먹자!
//
//		========
//		아쉽지만 오늘은 탕수육만 먹어야겠네
		
//		String[] menu = new String[2];
//		
//		for (int i = 0; i < menu.length; i++) {
//			int random = (int) (Math.random() * 3);
//			switch(random) {
//			case 0:
//				menu[i] = "짜장면";
//				break;
//			case 1:
//				menu[i] = "짬뽕";
//				break;
//			case 2:
//				menu[i] = "탕수육";
//				break;
//			}
//		}
//		
//		if(menu[0].equals(menu[1])) {
//			System.out.println("아쉽지만 오늘은 " + menu[0] + "만 먹어야겠네.");
//		} else {
//			System.out.println("오늘은 " + menu[0] + " " + menu[1] + " 반반을 먹자!");
//		}
		
//		<aside>
//		<img src="/icons/subtitles_red.svg" alt="/icons/subtitles_red.svg" width="40px" /> 배열을 사용하여 구구단 2단을 만들어 출력하기
//
//		배열을 사용하여 구구단 2단을 만들어 출력하라 
//		단, 배열은 2개를 만들어서 사용할것
//
//		——————————-출력 예시 —————————
//
//		=========== 구구단 2단 ===========
//		2 * 1 = 2
//		2 * 2 = 4
//		2 * 3 = 6
//		2 * 4 = 8
//		2 * 5 = 10
//		2 * 6 = 12
//		2 * 7 = 14
//		2 * 8 = 16
//		2 * 9 = 18
//
//		</aside>
		
		int[] dan = new int[] {2};
		int[] su = new int[9];
				
		int value = 1;
		for (int i = 0; i < su.length; i++) {
			su[i] = value++;
		}
		
		for (int i = 0; i < dan.length; i++) {
			for (int j = 0; j < su.length; j++) {
				System.out.println(dan[i] + " * " + su[j] + " = " + (dan[i] * su[j]));
			}
		}
		
		
	}

	public static int randomMaker() {
		int random = (int) (Math.random() * 50 + 1);
		return random;
	}
}
