package ch00_Mainclass.Bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientDTO {
    private Long id;//id
    private String clientName;//이름
    private String accountNumber;//계좌번호
    private String clientPass;//비밀번호
    private long balance;//잔고
    private String clientCreatedAt;//가입일자

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientPass() {
        return clientPass;
    }

    public void setClientPass(String clientPass) {
        this.clientPass = clientPass;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getClientCreatedAt() {
        return clientCreatedAt;
    }

    public void setClientCreatedAt(String clientCreatedAt) {
        this.clientCreatedAt = clientCreatedAt;
    }
    private static Long idValue = 1L;
    public ClientDTO(){}

    public ClientDTO(String clientName, String accountNumber, String clientPass) {
        this.id = idValue++;
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.clientPass = clientPass;
        this.balance = 0;
        this.clientCreatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-DD   HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", clientPass='" + clientPass + '\'' +
                ", balance=" + balance +
                ", clientCreatedAt='" + clientCreatedAt + '\'' +
                '}';
    }
}
