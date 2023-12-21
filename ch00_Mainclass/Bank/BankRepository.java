package ch00_Mainclass.Bank;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    List<ClientDTO> clientList = new ArrayList<>();
    List<AccountDTO> bankingList = new ArrayList<>();
//계좌번호 체크 메서드
    public ClientDTO ANChack(String accountNumber) {
        ClientDTO result = null;
        for (int i = 0; i < clientList.size(); i++) {
            if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
                result = clientList.get(i);
            }
        }
        return result;
    }
//비밀번호 체크 메서드
    public ClientDTO CPChack(String clientPass) {

        ClientDTO result = null;
        for (int i = 0; i < clientList.size(); i++) {
            if (clientPass.equals(clientList.get(i).getClientPass())) {
                result = clientList.get(i);
            }
        }
        return result;
    }
//고객등록
    public ClientDTO saveClient(ClientDTO newInfo) {
        clientList.add(newInfo);
        return newInfo;
    }
//입금
    public ClientDTO deposit(String accountNumber, long dep) {
        ClientDTO result = null;
        for (int i = 0; i < clientList.size(); i++) {
            if(accountNumber.equals(clientList.get(i).getAccountNumber())){
                long bal = clientList.get(i).getBalance();
                bal = bal + dep;
                clientList.get(i).setBalance(bal);
                AccountDTO deposit =new AccountDTO(accountNumber,dep,0);
                bankingList.add(deposit);
                result = clientList.get(i);
            }
        }
        return result;
    }
//출금
    public ClientDTO withdraw(String accountNumber, long draw) {
        ClientDTO result = null;
        for (int i = 0; i < clientList.size(); i++) {
            if(accountNumber.equals(clientList.get(i).getAccountNumber())){
                long bal = clientList.get(i).getBalance();
                bal = bal - draw;
                clientList.get(i).setBalance(bal);
                AccountDTO dr =new AccountDTO(accountNumber,0,draw);
                bankingList.add(dr);
                result = clientList.get(i);
            }
        }
        return result;
    }
}
