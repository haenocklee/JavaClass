package ch11_array.ex8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankService {
    BankRepository bankRepository = new BankRepository();
    Scanner scanner = new Scanner(System.in);

    //고객등록
    public void save() {
        System.out.println("고객등록");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        boolean accountCheck = bankRepository.accountCheck(accountNumber);
        if (accountCheck) {
            System.out.println("이미 존재하는 계좌 번호입니다.");
            save();
        }
        System.out.print("비밀번호: ");
        String clientPass = scanner.next();
        System.out.print("이름: ");
        String clientName = scanner.next();
        BankDTO bankDTO = new BankDTO(clientName, accountNumber, clientPass);
        BankDTO result = bankRepository.save(bankDTO);
        if (result != null) {
            System.out.println("등록이 완료되었습니다");
            System.out.println("result = " + result);
        } else {
            System.out.println("계좌번호가 중복됩니다.");
        }
    }

    //잔액조회
    public void balance() {
        System.out.println("잔액조회");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        long result = bankRepository.balance(accountNumber);
        if (result >= 0) {
            System.out.println("잔액조회 성공");
            System.out.println("잔액은: " + result);

        } else {
            System.out.println("없는 계좌 번호 입니다");
        }
    }

    //입금
    public void deposit() {
        System.out.println("입금");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        boolean accountCheck = bankRepository.accountCheck(accountNumber);
        if (accountCheck) {
            System.out.println("계좌가 확인되었습니다.");
            System.out.print("입금 액: ");
            long dep = scanner.nextInt();
            String createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분ss초"));

            long result = bankRepository.deposit(accountNumber, dep, createdAt);
            System.out.println("입금완료되었습니다");
            System.out.println("잔액: " + result);
        } else {
            System.out.println("없는 계좌입니다");
        }
    }

    //출금
    public void withdraw() {
        System.out.println("출금");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        boolean accountCheck = bankRepository.accountCheck(accountNumber);
        if (accountCheck) {
            System.out.println("계좌가 확인되었습니다.");
            System.out.print("비밀번호: ");
            String clientPass = scanner.next();
            System.out.print("출금 액: ");
            long draw = scanner.nextInt();
            String createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분ss초"));
            long result = bankRepository.withdraw(accountNumber, clientPass, draw, createdAt);
            System.out.println("잔액: " + result);
        } else {
            System.out.println("없는 계좌입니다");
        }
    }

    //입출금 내역 조회
    public void findAllBanking() {
        boolean run = true;
        while (run) {
            System.out.println("----------");
            System.out.println("1.모든내역 | 2.입금 내역 | 3.출금 내역 | 4.종료");
            System.out.println("----------");
            System.out.print("선택> ");
            int selectNum = scanner.nextInt();
            if (selectNum == 1) {
                System.out.println("모든내역 조회");
                System.out.print("계좌번호: ");
                String accountNumber = scanner.next();
                boolean result = bankRepository.findAllBanking(accountNumber);
                if (result == true) {
                    System.out.println("입출금 내역 조회완료");
                } else {
                    System.out.println("없는 계좌입니다");
                }
            } else if (selectNum == 2) {
                System.out.println("입금내역 조회");
                System.out.print("계좌번호: ");
                String accountNumber = scanner.next();
                boolean result = bankRepository.findDeposit(accountNumber);
                if (result == true) {
                    System.out.println("입금 내역 조회완료");
                } else {
                    System.out.println("없는 계좌입니다");
                }

            } else if (selectNum == 3) {
                System.out.println("출금내역 조회");
                System.out.print("계좌번호: ");
                String accountNumber = scanner.next();
                boolean result = bankRepository.findWithdraw(accountNumber);
                if (result == true) {
                    System.out.println("출금 내역 조회완료");
                } else {
                    System.out.println("없는 계좌입니다");
                }

            } else if (selectNum == 4) {
                run = false;
            }
        }
    }

    public void accountTransfer() {
    }
}
