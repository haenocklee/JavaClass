package ch00_Mainclass.Bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService();
        boolean run =true;
        while (run){
            System.out.println("------------");
            System.out.println("1.신규계좌 등록 | 2.잔액 조회 3.입금 4.출금 5.입출금 내역 6.계좌이체");
            System.out.println("------------");
            System.out.println("선택> ");
            int select = scanner.nextInt();
            if(select == 1){
                System.out.println("신규등록");
                bankService.saveClient();
            } else if (select == 2) {
                System.out.println("잔액 조회");
                bankService.balance();
            }else if (select == 3) {
                System.out.println("입금");
                bankService.deposit();
            }else if (select == 4) {
                System.out.println("출금");
                bankService.withdraw();
            }else if (select == 5) {
                System.out.println("입출금내역 조회");
                bankService.FABanking();
            }else if (select == 6) {
                System.out.println("계좌이체");
                bankService.transfer();

            }
        }
    }
}
