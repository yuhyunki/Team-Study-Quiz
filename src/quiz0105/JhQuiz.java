package quiz0105;

public class JhQuiz {

	public static void main(String[] args) {

//		[부호, 삼항연산자, 리턴값 메소드]
//
//		클래스명은 ***JhQuiz***로 작성하시오.
//		토끼(rabbit)가 가지고 있는 값은 `9`이며, 고양이(cat)가 가지고 있는 값은 (소문자) `c`이다.
//		무조건 리턴값을 반환하는 메소드로 만드시오. 메소드명은 ***falseMethod***이다.
//		단, 삼항연산자으로 조건에는 **토끼와 고양이는 같지 않다고** 제시해야 한다.
//		시스템 출력코드 안에 한번에 작성하시오.
//
//		——-출력 예시——-
//
//		토끼와 고양이는 같지 않다.
		
		int rabbit = 9;
		char cat = 'c';
		
		JhQuiz app = new JhQuiz();
		System.out.println(app.falseMethod(rabbit, cat));
		
	}

	public String falseMethod(int rabbit, int cat) {
		String str = (rabbit == cat)? "토끼와 고양이는 같다.": "토끼와 고양이는 같지 않다.";
		return str;
	}
	
}
