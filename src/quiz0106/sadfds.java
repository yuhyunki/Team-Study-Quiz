package quiz0106;

import java.util.Scanner;

public class sadfds {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 정수 입력값 : ");
		int a = sc.nextInt();
		if (a > 0 && a <= 100) {
			for (int i = a; i % 2 != 0; i++) {
				System.out.println("입력하신 수는 홀수 입니다." + a);
			} for (int i = a; i % 2 == 0; i++) {
				System.out.println("입력하신 수는 짝수 입니다." + a);
			}
		} else {
			System.out.println("1~100사이 정수를 입력하세요");
		}

	}

}
