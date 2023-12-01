package ch02_operator;

public class Ex03_AssignmentOperator {
	//대입연산자
	public static void main(String[] args) {
		int num1 = 10 , num2 = 7;
		System.out.println("num1: " + num1 + "num2: " + num2);
		//(Sysout)+ctrl+spacebal
		num1 += num2;//num1 = num1 + ++num2
		System.out.println("num1:" + num1 + "num2:" + num2);//17 , 7
		num1 -= num2;
		System.out.println("num1:" + num1 + "num2:" + num2);//10 , 7
		num1 *= num2;
		System.out.println("num1:" + num1 + "num2:" + num2);//70 , 7
		num1 /= num2;
		System.out.println("num1:" + num1 + "num2:" + num2);//10 , 7

	}

}
