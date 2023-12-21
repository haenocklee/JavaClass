package ch00_Mainclass.Bank;

import ch11_array.ex8.BankDTO;

import java.util.Scanner;

public class BankService {
    BankRepository bankRepository = new BankRepository();
    Scanner scanner = new Scanner(System.in);
    //신규등록
        public void saveClient () {
            System.out.print("이름: ");
            String clientName = scanner.next();
            System.out.print("계좌번호: ");
            String accountNumber = scanner.next();
            ClientDTO accountChack = bankRepository.ANChack(accountNumber);
            if(accountChack != null){
                System.out.println("등록된 계좌입니다. 다시입력해 주세요.");
                saveClient();
            }
            System.out.print("계좌비밀번호: ");
            String clientPass = scanner.next();
            ClientDTO newInfo = new ClientDTO(clientName,accountNumber,clientPass);
            ClientDTO result = bankRepository.saveClient(newInfo);
            if(result != null){
                System.out.println("계좌등록이 완료되었습니다.");
                System.out.println("result = " + result);
            }
        }
//잔액조회
    public void balance() {
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        ClientDTO anChack = bankRepository.ANChack(accountNumber);
        if(anChack != null){
            System.out.println("계좌 확인");
            System.out.println("anChack = " + anChack);
        }else {
            System.out.println("없는 계좌입니다.");
        }
    }
//입금
    public void deposit() {
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        ClientDTO anChack = bankRepository.ANChack(accountNumber);
        if(anChack != null){
            System.out.println("계좌 확인");
            System.out.print("입금액: ");
            long dep = scanner.nextInt();
            ClientDTO result = bankRepository.deposit(accountNumber,dep);
            System.out.println("입금이 완료되었습니다");
        }else {
            System.out.println("없는 계좌입니다");
        }
    }
//출금
    public void withdraw() {
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        ClientDTO anChack = bankRepository.ANChack(accountNumber);
        if(anChack != null) {
            System.out.print("비밀번호: ");
            String clientPass = scanner.next();
            ClientDTO cpChack = bankRepository.CPChack(clientPass);
            if(cpChack != null){
                System.out.print("출금액: ");
                long draw  = scanner.nextInt();
                ClientDTO result  = bankRepository.withdraw(accountNumber,draw);
                System.out.println("result = " + result);
            }else {
                System.out.println("입력정보가 틀렸습니다.");
            }
        }else {
            System.out.println("없는 계좌입니다.");
        }
    }

    public void FABanking() {
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        ClientDTO anChack = bankRepository.ANChack(accountNumber);
        if(anChack != null) {
            System.out.println();
        }else {
            System.out.println("없는 계좌입니다");
        }
    }

    public void transfer() {
    }
}
