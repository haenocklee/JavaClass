package ch02_operator;

public class Ex02_ComparisonOperator {

	public static void main(String[] args) {
		//비교연산자
		System.out.println(10 > 5);
		System.out.println(10 < 5);
		boolean result = 77 <= 60;
		System.out.println(result);
		result = (8 == 100);
		System.out.println(result);
		result = false;
		boolean bool1 = true;
		//변수값을 다른 변수에대입하는 것은  복사 붙여넣기 개념
		result =  bool1;
		System.out.println(result);
		System.out.println(bool1);
	}

}
