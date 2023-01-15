package quiz0111;

public class Quiz {

	public static void main(String[] args) {

		char[] arr = {'D', 'B', 'C', 'E', 'A'};

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j <= i; j++) {

				if(arr[i] < arr[j]) {		
					char temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
//		1번~10번을 문자열 배열로 저장한다.
//		시험 결과 2번 ~ 4번  9번 ~10번은 탈락하였고,
//
//		나머지 인원은 합격 하였다.
//
//		문자열을 출력하는데
//		합격한 사람 뒤에는 "합격!"이 추가로 출력되고
//		탈락한 사람 뒤에는 뒤에는 "탈락"을 추가로 출력하시오.
//
//		-- 출력 예시 --
//		1번합격! 2번탈락 3번탈락 4번탈락 5번합격! 6번합격! 7번합격! 8번합격! 9번탈락 10번탈락
		
		String[] sarr = new String[] {
				"1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번", "10번"
		};
		
		for (int i = 0; i < sarr.length; i++) {
			if(i == 0 || (i >= 4 && i <= 7)) {
				System.out.print(sarr[i] + "합격! ");
			} else {
				System.out.print(sarr[i] + "탈락 ");
			}
		}
		
//		행의 길이가 num1, 열의 길이가 num2인 정수가 있다
//
//		 정수 num1은 1~10사이의 난수이며, 정수 num2는 1~20사이의 난수이다.
//
//		이때 , num2의 발생한 난수가 10를 초과하면 "난수가 10을 넘었습니다 재실행하세요." 라는 문구를 발생시켜라
//		 2차원 배열을 이용하여 선언 및 할당하며 그 값을 출력하는 코드를 만들어라
//
//		===예시1===
//		1  2  3  4  5
//
//		6  7  8  9  10
//
//		11  12  13  14  15
//
//		16  17  18  19  20
//
//		21  22  23  24  25
//
//		26  27  28  29  30
//
//		===예시2===
//		반드시 1~ 10까지의 정수를 입력해야 합니다. 다시 입력하세요.
		
		int num1 = (int) (Math.random() * 10 + 1);
		int num2 = (int) (Math.random() * 20 + 1);
		
		if(num2 > 10) {
			System.out.println("난수가 10을 넘었습니다. 재실행하세요.");
		} else {
			int[][] iarr = new int[num1][num2];
			int value = 1;
			for (int i = 0; i < iarr.length; i++) {
				for (int j = 0; j < iarr[i].length; j++) {
					iarr[i][j] = value++;
					System.out.print(iarr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
