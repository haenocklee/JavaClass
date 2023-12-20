package ch11_array.ex8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    List<BankDTO> clientList = new ArrayList<>();//고객정보 리스트
    List<AccountDTO> bankingList = new ArrayList<>();//입출금리스트
    //현재시간
    String createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분ss초"));

    //게좌번호확인 전용 매서드
    public boolean accountCheck(String accountNumber) {
        boolean result = false;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                result = true;
            }
        }
        return result;
    }

    //고객등록
    public BankDTO save(BankDTO bankDTO) {
        BankDTO result = null;
        clientList.add(bankDTO);
        for (int i = 0; i < clientList.size(); i++) {
            if (bankDTO.equals(clientList.get(i))) {
                result = clientList.get(i);
            }
        }
        return result;
    }

    //잔액조회
    public long balance(String accountNumber) {
        long result = 0;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                result = clientList.get(i).getBalance();
            }
        }
        return result;
    }

    //입금
    public long deposit(String accountNumber, long dep, String createdAt) {
        long result = 0;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                long bal = clientList.get(i).getBalance();
                long sum = bal + dep;
                clientList.get(i).setBalance(sum);
                result = clientList.get(i).getBalance();
                AccountDTO accountDTO = new AccountDTO(accountNumber, dep, 0,createdAt);
                bankingList.add(accountDTO);
            }
        }
        return result;
    }


    //출금
    public long withdraw(String accountNumber, String clientPass, long draw, String createdAt) {
        long result = 0;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                if (clientPass.equals(clientList.get(i).getClientPass())) {
                    long sumBal = clientList.get(i).getBalance();
                    if (sumBal >= draw) {
                        long bal = sumBal - draw;
                        clientList.get(i).setBalance(bal);
//                        bankingList.get(i).setWithdraw(draw);
//                        bankingList.get(i).setBankingAt(createdAt);
                        result = clientList.get(i).getBalance();
                        AccountDTO accountDTO = new AccountDTO(accountNumber, 0, draw, createdAt);
                        bankingList.add(accountDTO);
                    } else {
                        System.out.println("출금액이 부족합니다");
                    }
                } else {
                    System.out.println("입력 정보다 틀립니다.");
                }
            }
        }
        return result;
    }

    //입출금내역 조회
    public boolean findAllBanking(String accountNumber) {
        boolean result = false;
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNumber.equals(bankingList.get(i).getAccountNumber())) {
                System.out.println(bankingList.get(i));
                result = true;
            }
        }
        return result;
    }

    //입금내역 조회
    public boolean findDeposit(String accountNumber) {
        boolean result = false;
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNumber.equals(bankingList.get(i).getAccountNumber())) {
                System.out.println(bankingList.get(i).getDeposit());
                result = true;
            }
        }
        return result;
    }

    //출금내역 조회
    public boolean findWithdraw(String accountNumber) {
        boolean result = false;
        for (int i = 0; i < bankingList.size(); i++) {
            if (accountNumber.equals(bankingList.get(i).getAccountNumber())) {
                System.out.println(bankingList.get(i).getWithdraw());
                result = true;
            }
        }
        return result;
    }
}