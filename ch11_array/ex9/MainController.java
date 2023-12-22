package ch11_array.ex9;

import ch10_class.ex7.Calculator;
import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.service.BoardService;
import ch11_array.ex9.service.MemberService;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardService boardService = new BoardService();
        MemberService memberService = new MemberService();
        boolean run = true;
        while (run) {
            String loginEmail = CommonVariables.loginEmail;
            System.out.println("====== 회원관리 ======");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 0) {
                System.out.println("종료합니다.");
                run = false;
            } else if (selectNo == 1) {
                memberService.saveMember();
            } else if (selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3) {
                memberService.memberList();
            } else if (selectNo == 4) {
                memberService.memberUpate();
            } else if (selectNo == 5) {
                memberService.memberdelete();
            } else if (selectNo == 6) {
                memberService.logout();
            } else if (selectNo == 7) {
                if (loginEmail == null) {
                    System.out.println("회원전용 매뉴입니다.");
                } else {
                    boardService.boardMenu();
                }
            }
        }
    }
}
