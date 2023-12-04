package ch04_if;

import java.util.Scanner;

public class EX07_IFExample {

	public static void main(String[] args) {
		/*
		 * *성적 출력 예제를 응용
		 * 입력값: 학년(year), 점수(score)
		 * 처리
		 * - 1~3학년은 60점 이상이면 합격
		 * - 4학년 이상은 70점 이상이면 합격
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학년를 입력하세요:");
		int year = scanner.nextInt();
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		
		if(year <= 3 && year > 0) {
			if(score >= 60) {
				System.out.print("합격");
			}else {
				System.out.print("불합격");
			}
		}else if(year >3 && year <= 6) {
			if(score >= 70) {
				System.out.print("합격");
			}else {
				System.out.print("불합격");
			}
		}else {
			System.out.print("학년의 정확히 입력하세요");	
		}
		
//		if(year > = 1 && year <= 4 && score >= 0 && score <= 100) {
//			if(score >= 60) {
//				if(year !=4 ) {
//					//1~3학년 합격
//					System.out.print("합격");
//				}else if (score > =70) {
//					//4학년 합격
//					System.out.print("합격");
//				}else {
//					//위의 두조건을 만족하지 않기 때문에 불합격
//					System.out.print("불합격");
//				}
//				
//			}else {
//				System.out.print("불합격");
//			}
//		}else {
//			System.out.print("점수, 학년 값이 입력 범위를 벗어났습니다.");
//		}
	}
}
