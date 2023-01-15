package quiz0109;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10 이하의 정수 1개를 입력해주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("10 이하의 정수 1개를 입력해주세요 : ");
		int num2 = sc.nextInt();
		
		for (int i = 1; i <= 100; i++) {
			if(!(i % num1 == 0 && i % num2 == 0)) {
				continue;
			}
			System.out.println(i + "는 " + num1 + "과 " + num2 + "의 공배수이다.");
		}
		
	}

}
