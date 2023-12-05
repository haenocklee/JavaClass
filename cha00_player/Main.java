package cha00_player;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("시험점수 입력:");
		int score = scanner.nextInt();

		String sum = "";

		if (score>=90 && score<=100){
			sum = "A";
		}else if (score>=80 && score<=89){
			sum = "B";
		}else if (score>=70 && score<=79){
			sum = "C";
		}else if (score>=60 && score<=69){
			sum = "D";
		}else{
			sum = "F";
		}
		System.out.println(sum);

	}
}