package ch06_for;

import java.util.Scanner;

public class Ex10_ForEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 X까지의 X값: ");
        int X = scanner.nextInt();
        int num = 0;

        for (int i = 1; i <= X; i++) {
            if(i % 2 != 0 && i % 3 != 0){
                System.out.println("2,3의 배수를 제외한 X까지의 값: " + i);
                num = num + i; //num += i;
            }
        }
        System.out.println("2,3의 배수를 제외한 X까지의 수의 총합: " + num);
    }
}
