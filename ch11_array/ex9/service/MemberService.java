package ch11_array.ex9.service;

import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.repository.BoardRepository;
import ch11_array.ex9.repository.MemberRepository;

import java.util.Scanner;

public class MemberService {
    public void boardMenu() {
        Scanner scanner = new Scanner(System.in);
        BoardRepository boardRepository = new BoardRepository();
        String loginE = CommonVariables.loginEmail;
        boolean run = true;
        while (run) {
            System.out.println("====== 게시판 ======");
            System.out.println("--------------------------------------------------------");
            System.out.println("1.글작성 | 2.목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.메인메뉴");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 0) {
                System.out.println("메인메뉴로 나갑니다.");
            } else if (selectNo == 1) {
                boardRepository.write(loginE);
            } else if (selectNo == 2) {
                boardRepository.wFindAll(loginE);
            } else if (selectNo == 3) {
                boardRepository.wFindE(loginE);
            } else if (selectNo == 4) {
                boardRepository.wUpate(loginE);
            } else if (selectNo == 5) {
                boardRepository.wDelete(loginE);
            } else if (selectNo == 6) {
                boardRepository.wSearch(loginE);
            } else if (selectNo == 99) {
                boardRepository.sample();


            }
        }
    }

}

