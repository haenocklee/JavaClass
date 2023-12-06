package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        int num1 = 0;
        int count = 0;

        System.out.print("정수를 입력하고 마지막에 0을 입력하세요: ");
        while (run) {
            int num = scanner.nextInt();
            count++;
            if (0 != num) {
                num1 = num1 + num;
            } else {
                num1 = num1 / (count - 1);
                System.out.println("입력한 숫자는 " + (count - 1) + "개 입니다.");
                System.out.println("평균은 " + num1 + "입니다");
                count = 0;
                System.out.print("정수를 입력하고 마지막에 0을 입력하세요: ");

            }
        }

    }
}
