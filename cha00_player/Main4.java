package cha00_player;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("현재 시각 시: ");
        int A = scanner.nextInt();
        System.out.print("현재 시각 분: ");
        int B = scanner.nextInt();
        System.out.print("요리할 시간(분단위): ");
        int C = scanner.nextInt();

        int num1 = 0;
        int num2 = 0;

        if((0 <= A && A <= 23) && (0 <= B && B <= 59) && (0 <= C && C <= 1000)){
            if(1440 >= (A * 60) + B + C && (B + C <= 59)){
                System.out.println( A + "시 " + (B + C) + "분에 완료됩니다.");
            }else if(1440 <= (A * 60) + B + C){
                num1 = (A * 60) + B + C;
                num2 = 1440 - num1;
                A = num2 / 60;
                B = num2 % 60;
                System.out.println( A + "시 " + B + "분에 완료됩니다.");
            }
        }else{
            System.out.println("현재 시각과 요리할 시간(분)을 정확히 입력하세요.");
        }
    }
}
