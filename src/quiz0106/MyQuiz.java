package quiz0106;

import java.util.Scanner;

public class MyQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 혈액형은?");
		String bloodType = sc.nextLine();
		
		switch(bloodType) {
		case "A":
			System.out.println("당신은 완벽주의자입니다.");
			break;
		case "B":
			System.out.println("당신은 자유로운 사람입니다.");
			break;
		case "O":
			System.out.println("당신은 개그본능이 가득한 사람입니다.");
			break;
		case "AB":
			System.out.println("당신은 4차원입니다.");
			break;
		}
		
		int month = 1;
		while(month <= 12) {
			System.out.println(month + "월의 시작입니다.");
			month++;
		}
		System.out.println("한 해를 마무리했습니다.");
		
	}

}
