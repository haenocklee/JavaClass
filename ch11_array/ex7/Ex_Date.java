package ch11_array.ex7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex_Date {
    public static void main(String[] args) {
        //날짜 정보 다루기
        //현재시간 확인 0.0...초까지 다확인한다.
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        //날짜 데이터를 원하는 형식으로 다루기
        String yyyy = now.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("yyyy = " + yyyy);
        String month = now.format(DateTimeFormatter.ofPattern("MM"));
        System.out.println("month = " + month);
        String day = now.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("day = " + day);
        String hour = now.format(DateTimeFormatter.ofPattern("HH"));
        System.out.println("hour = " + hour);
        String minute = now.format(DateTimeFormatter.ofPattern("mm"));
        System.out.println("minute = " + minute);
        String second = now.format(DateTimeFormatter.ofPattern("ss"));
        System.out.println("second = " + second);
        String createdAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("createdAt = " + createdAt);
        createdAt = now.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분ss초"));
        System.out.println("createdAt1 = " + createdAt);
    }
}
