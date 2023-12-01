package ch04_if;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		/**
		 * 스캐너로 점수(Score) 를 입력
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 60점 이상 D
		 * 60점 미만 F
		 * 출력
		 * */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요: ");
		int Score = scanner.nextInt();
		
		if(Score >= 90) {
			System.out.println("A");
		}else if(Score >= 80) {
            System.out.println("B");
		}else if(Score >= 70) {
            System.out.println("C");
		}else if(Score >= 60) {
            System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
