package ch06_for;

import java.util.Scanner;

public class Ex05_forEx {
    public static void main(String[] args) {
        //두개의 정수를 입력받아 시작값부터 끝깞까지의 합계 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작값:");
        int num1 = scanner.nextInt();
        System.out.print("끝값:");
        int num2 = scanner.nextInt();

        int num3 = 0;

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                num3 = num3 + i;
            }
            System.out.println(num1 + "부터 " + num2 + "까지의 합은 " + num3 + "입니다");
        } else {
            System.out.println("시작값은 끝값보다 작아야합니다");
        }
    }
}
