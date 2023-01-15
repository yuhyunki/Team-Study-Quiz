package quiz0106;

import java.util.Scanner;

public class dong {

	public static void main(String[] args) {

//		1번째 수와 2번째 수를 입력하고 두 수 중에 1번째 수가 크면 두 수를 더하고
//		2번째 수가 더 크면 두수를 빼어리 (빼는 순서는 1번째 수에서 두번째 수를 밴다.)
//
//		*변수는 1번째 수는 num1으로 , 2번째 수는 num2로 정한다.
//
//		*class 명은 dong
//
//		===결과 예시 ===
//
//		1번째 수 입력 : 4
//
//		2번째 수 입력: 8
//
//		결과 : -4
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("2번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		if(num1 > num2) {
			result = num1 + num2;
		} else if (num2 > num1) {
			result = num1 - num2;
		}
		
		System.out.println("결과 : " + result);
		
	}

}
