package cha00_player;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("A:");
		int num1 = scanner.nextInt();
		System.out.print("B:");
		int num2 = scanner.nextInt();
		
		System.out.println("A" + "+" + "B" + "=" + (num1 + num2));
	}

}
