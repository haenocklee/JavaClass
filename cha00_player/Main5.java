package cha00_player;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        /**
         * while로
         * 1~100 까지의 합 출력
         * 1+2+3+4+5+6+7+8+9+100 = 5050
         * */
        int i = 1,  sum = 0;
        while (i <= 100){
            System.out.print(i);
            sum = sum + i;
            if(i < 100){
                System.out.print("+");
            }else{
                System.out.print("=");
            }
            i++;
        }
        System.out.println(sum);
    }
}

