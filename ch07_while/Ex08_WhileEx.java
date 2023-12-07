package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        boolean run = true;
        int dep = 0;//잔고

        System.out.println("_____________________________________");
        //1.예금 2.출금 3.잔고 .4종료
        while(run){
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
            System.out.println("_____________________________________");
            System.out.print("선택> ");
            int menu = scanner.nextInt();
            if(menu == 1){//입급
                System.out.print("예금액> ");
                int deposit = scanner.nextInt();
                dep = dep + deposit;
                System.out.println("현재잔액은 "+ dep +"입니다");
            }else if(menu == 2){//출금
                System.out.print("출금액> ");
                int deposit = scanner.nextInt();
                if(dep < deposit){
                    System.out.println("잔고가 부족합니다");
                }else {
                    dep = dep + (deposit * -1);
                }System.out.println("현재잔액은 " + dep + "입니다");
            }else if(menu == 3){//잔고
                System.out.println("현재잔액은 "+ dep +"입니다");
            }else if(menu == 4){//종료
                System.out.println("종료합니다.");
                break;
            }
            System.out.println("1 ~ 4 내에서 정확히 선택해주세요.");
        }
    }
}
