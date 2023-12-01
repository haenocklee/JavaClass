package ch04_if;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		/**
		 * 중첩 if문을 적용한 학점 출력
		 * 100점을 초과하거나 0 점 미만의 점수를 입력하면 '입력범위를 초과'출력
		 * 0~100점 사이의 값을 입력시 앞의 예제에서 했던 학점 출력
		 * 단, 각 조건마다 학점값을 출력하는 것이 아니라 학점 출력을 위한 (print)문장은 한번만 사용
		 * */
		
        Scanner scanner = new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		int Score = scanner.nextInt(); 
		
		String sum = "";
		
		if(100>=Score && 0<=Score) {
			if(Score>=90) {
				sum = "A";
			}else if(Score>=80) {
				sum = "B";
			}else if(Score>=70) {
				sum = "C";
			}else if(Score>=60) {
				sum = "D";
			}else {
				sum = "F";
			}
			System.out.print(sum);
		}else {
			System.out.print("입력범위 초과");
		}
	}

}
