package ch04_if;

public class Ex01_IfBasic {

	public static void main(String[] args) {
		//if문
		System.out.println("if전");
		boolean cond = false;
		if(!cond) {//(boolean)타입만 들어올수 있다
			System.out.println("조건을 만족");
		}
		System.out.println("if후");
		
		//if else
		if (cond) {
			System.out.println("if else 전");
			if(cond) {
				System.out.println("만족");
			}else {
				System.out.println("불만족");
			}
			System.out.println("if else 후");
			
			int num1 = 10, num2 = 20;
			if(num1 < num2) {
				System.out.println("num2가큼");
			}else {
				System.out.println("num1이 num2보다 크거나 같다");
			}
			
			//if else if
			if(num1 > num2) {
				System.out.println("num1이 큼");
			}else if (num1 < num2) {
				System.out.println("num2가 크다");
			}else if (num1 == num2) {
				System.out.println("둘이 같다");
			}else if (num1 != num2) {
				System.out.println("둘이 다르다");
			}
		}
	}

}
