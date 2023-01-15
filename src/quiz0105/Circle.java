package quiz0105;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

//		반지름값을 입력받아서 PI함수를 사용한 원의 넓이를 구하는 클래스를 생성하고 main클래스에서 호출하세요.
//
//		Math : 파이함수, 거듭제곱함수 사용
//
//		---
//
//		<출력예시>
//
//		원의 반지름은 :
//		3
//		원의 넓이는 : 28.274333882308138
		
		Circle app = new Circle();
		app.circleArea();
	}

	public void circleArea() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름은 : ");
		int radius = sc.nextInt();
		
		System.out.println("원의 넓이는 : " + (Math.PI * radius * radius));
		
	}
	
}
