package ch02_operator;

public class Ex04_LogicalOperator {
	//논리연산자
	public static void main(String[] args) {
		System.out.println(true&&true);
		System.out.println(true&&false);
		//System.out.println(true||true);실행하면 2값이 전부 트루이기 때문에 올로쓸 이유가없음
		
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;
		
		System.out.println(bool1&&bool2);
		//불2불3의 (or)연산 결과를 (result)라는 변수에담고 (result)출력
		boolean result = bool2 || bool3;
		System.out.println(result);
		
		//num1, num2 정수형 변수에 각각 10, 20을 대입 선연
		//num1 > num2 result1에 저장
		//num1 != num2 결과를 result2에 저장
		//result1 && result2 결과를 result3에 저장
		//result3의 값을 출력
		int num1 = 10;
		int num2 = 20;
		boolean result1 = num1 > num2;
		boolean result2 = num1 != num2;
		boolean result3 = result1 && result2;
		System.out.println(result3);//f
		
		//밑에와 같이 할수도 있다
		boolean result4 = (num1 > num2) && (num1 != num2);
		System.out.println(result4);
		
		//!(NOT)연산자 값을 반전시킨다
		System.out.println(bool1);//t
		System.out.println(!bool1);//f
		System.out.println(bool1 && bool2);//f
		System.out.println(!(bool1 && bool2));//t
		
		System.out.println("Not 연산 수행전:" + bool2);
		bool2 = !bool2;
		System.out.println("Not 연산 수행전:" + bool2);
		
	}
}
