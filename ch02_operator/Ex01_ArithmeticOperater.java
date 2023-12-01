package ch02_operator;

public class Ex01_ArithmeticOperater {

	public static void main(String[] args) {
		//산술연산자
		//num1, num2 두개의 정수형 변수선언후 산술연산자를 이용하여 print()로 출력해보자
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("덧셈결과: " + num1+num2);//문자로판단해 연결을함 값이105로나온다
		System.out.println("덧셈결과: " + (num1+num2));//위에 내용을 재대로 된 결과값이 나오기 위해서는 num1+num2를 괄호로 묶어서 먼저계산하게 해야한다
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		//프린트에 직접 계산식을 넣는 것보다는 따로 변수를 지정해주는 것이 좋다

		// 계산 결과를 담을 변수 활용 
		int result = 0;
		result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);

		// 계산 결과 변수를 따로 선언
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		int subResult = num1 - num2;
		System.out.println(subResult);
		int mulResult = num1 * num2;
		System.out.println(mulResult);
		int divResult = num1 / num2;
		System.out.println(divResult);
		int remainResult = num1 % num2;
		System.out.println(remainResult);
	}
}
