package ch08_string;

import java.util.Scanner;

public class Ex02_StringEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
        while(run){
            System.out.print("> ");
            //nextLine으로 선언해야지 스페이스 가 들어간 문장도 출력가능
            //next만 입력시 스페이스마다 while이 다시 실행됨
            String enter = scanner.nextLine();
            if("종료".equals(enter)){
                System.out.println("종료");
                break;
            }else{
                System.out.println(enter);
            }
        }
    }
}



//    public static void main(String[] args) {
//        System.out.println("메시지를 입력하세요");
//        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
//        Scanner scan = new Scanner(System.in);
//        String inputString = "";
//        boolean run = true;
//        String answer = "종료";
//        // 프로그램을 종료하는 키워드인 종료 가 절대로 바뀌지 않을 경우
//        final String ANSWER = "종료";
//        // final 키워드를 붙인 변수는 변수값을 바꿀 수 없음.
////		ANSWER = "다른값저장";
//        do {
//            System.out.print(">");
//            inputString = scan.nextLine();
//            System.out.println(inputString);
//            if(inputString.equals(ANSWER)) {
//                run = false;
//            }
//        } while(run);
//
//    }
//}

