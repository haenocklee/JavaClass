package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		//3의 배수인지, 5의 배수인지, 3과5의 공배수 인지, 조건에 없는지

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력:");
		int num = scanner.nextInt();
		
//		if(num % 3 == 0 && num % 5 == 0 ) {
//			System.out.print("3과5의 공배수");
//		}else if (num % 3 == 0) {
//			System.out.print("3의배수");
//		}else if (num % 5 == 0) {
//			System.out.print("5의배수");
//		}else {
//			System.out.print("조건에 없음");
//		}
		
		String sum ="";
		
		if(num % 3 == 0){
			if(num % 5 == 0) {
				sum = "3과 5의 공배수";
			}else {
				sum = "3의 배수";
			}System.out.println("입력한 숫자는"+ sum + "입니다");
		}else if(num % 5 == 0) {
			sum = "5의 배수";
			System.out.println("입력한 숫자는"+ sum + "입니다");
		}else {
			System.out.println("조건에 없음");
		}
			

	}

}
