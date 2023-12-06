package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    /**
     * random() 메서드를 이용해서 1 ~ 100 사이의 숫자를 하나 만들고
     * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력 받도록 하고
     * 숫자를 맞추면 종료하고 몇 번만에 맞혔는지를 출력해줌
     */

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int i = (int)(Math.random() * 100)+1;
//        System.out.println(i);
//
//        System.out.print("1~100 사이의 숫자 입력:");
//        int num = scanner.nextInt();
//
//        int num1 = 1;
//
//        while(i != num){
//            System.out.println("시도횟수 " + num1 +"번");
//            System.out.println("random은 "+ num +"이 아닙니다.");
//            num1++;
//            System.out.print("다시 입력:");
//            num = scanner.nextInt();
//
//        }
//        System.out.println("시도횟수 " + num1 +"번 정답 입니다");
//    }
//}



//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int i = (int)(Math.random() * 100)+1;//random = i
//        System.out.println(i);
//
//        System.out.print("1~100입력:");
//        int num = scanner.nextInt();
//
//        int num1 = 1;
//
//        if(0 < num && num <= 100){
//            while(num != i){
//                if(num > i){
//                    System.out.println("시도횟수"+num1+"번");
//                    System.out.println("Random 숫자는" + num + "보다 작습니다");
//                }else if(i > num){
//                    System.out.println("시도횟수"+num1+"번");
//                    System.out.println("Random 숫자는" + num + "보다 큽니다");
//                }else{
//                    System.out.println("시도횟수"+num1+"번");
//                    System.out.println("Random 숫자는" + num + "정답입니다");
//                }
//                System.out.print("다시입력:");
//                num = scanner.nextInt();
//                num1++;
//            }
//            System.out.println("시도횟수"+num1+"번");
//            System.out.println("Random 숫자는 " + num + " 정답입니다");
//        }else{
//            System.out.println("1~100 까지의 숫자를 입력하세요.");
//        }
//    }
//}



    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         * 반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */
        Scanner scanner = new Scanner(System.in);
        int input = 0, count = 0;
        boolean run = true;
        System.out.println("up & down");
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println("answer = " + answer);

        while (run) {
            System.out.print("숫자를 입력하세요: ");
            input = scanner.nextInt();
            count++;
            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요!");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요!");
            } else {
                System.out.println("맞았습니다!");
                System.out.println("시도 횟수는 " + count + "회 입니다.");
            }
        }

    }
}
