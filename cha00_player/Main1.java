package cha00_player;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요:");
        int year = scanner.nextInt();

        if((year % 4 == 0) && (year % 100 != 0)){
            System.out.println("1");
        }else if (year % 400 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
