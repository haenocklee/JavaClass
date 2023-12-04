package ch04_if;

import java.util.Scanner;

public class Ex05_UfExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력:");
		int num = scanner.nextInt();
		if(num > 0 ) {
			System.out.print("양수");
		}else if (num < 0) {
			System.out.print("음수");
		}else if (num == 0) {
			System.out.print("0 입니다.");
		}
	}
}
		
