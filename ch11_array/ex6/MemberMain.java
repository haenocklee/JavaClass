package ch11_array.ex6;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        //1.회원가입,2.로그인,3.회원목록조회,4.회원정보수정,5.회원탈퇴,6.로그아웃
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        boolean run = true;
        while (run){
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록조회 | 4. 회원정보수정 | 5.회원탈퇴 | 6.로그아웃");
            System.out.print("선택> ");
            int select = scanner.nextInt();
            if(select == 1){
                memberService.join();
            } else if (select == 2) {
                memberService.login();
            }else if (select == 3) {
                memberService.findAll();
            }else if (select == 4) {
                memberService.fix();
            }else if (select == 5) {
                memberService.cancel();
            }else if (select == 6) {
                memberService.logout();
            }
        }
    }
}
