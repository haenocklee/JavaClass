package ch04_if;

import java.util.Scanner;

public class EX08_IfExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째:");
		int num1 = scanner.nextInt();
		System.out.print("두번째:");
		int num2 = scanner.nextInt();
		System.out.print("세번째:");
		int num3 = scanner.nextInt();

		
		if(num1 > num2 && num1 > num3) {
			System.out.print("가장 큰숫자는 " + num1 + "입니다");
		}else if(num2 > num1 && num2 > num3) {
			System.out.print("가장 큰숫자는 " + num2 + "입니다");
		}else {
			System.out.print("가장 큰숫자는 " + num3 + "입니다");
		}
	}
}
		
		
//		int max = 0;
//		if (num1 > num2) {
//			if(num1 >num3) {
//				max = num1;
//			}else {
//				max = num3;
//			}
//		}else {
//			if(num2 > num3) {
//				max = num2;
//			}else {
//				max = num3;
//			}
//		}
//		System.out.print("가장 큰숫자는 " + max + "입니다");
//		
