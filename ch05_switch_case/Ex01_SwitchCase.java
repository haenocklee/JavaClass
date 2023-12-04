package ch05_switch_case;

import java.util.Scanner;

public class Ex01_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("단어입력:");
        String word = scanner.next();

        switch (word) {
            case "desk":
                System.out.println("책상");
                break;
            case "chair":
                System.out.println("의자");
                break;
            case "monitor":
                System.out.println("모니터");
                break;
            case "mouse":
                System.out.println("모니터");
                break;
            default:
                System.out.println("사전에 없는 단어입니다");
        } System.out.println("SwichCase 완료");
    }
}
