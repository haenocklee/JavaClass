package cha00_player;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X값:");
        int X = scanner.nextInt();
        System.out.print("Y값:");
        int Y = scanner.nextInt();

        int n = 0;

        if(X > 0 && Y > 0){
            n = 1;
        }else if(X < 0 && Y > 0){
            n = 2;
        }else if(X < 0 && Y < 0){
            n = 3;
        }else{
            n = 4;
        }
        System.out.println("Quadrant" + n);
    }
}
