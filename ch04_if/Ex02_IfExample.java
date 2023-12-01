package ch04_if;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		/*
		 * 성적 출력하기
		 * 자바점수(javaScore)가 60점이상 합격, 아닐시 불합격
		 * 스크린이용하여 입출력할것
		 * */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요: ");
		int num1 = scanner.nextInt();
		
		if(num1 >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}
