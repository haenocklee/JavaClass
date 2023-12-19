package ch11_array.ex7;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoardService boardService = new BoardService();
        boolean run = true;
        while (run) {
            System.out.println("----------------------");
            System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정  |5.글삭제 | 6.검색");
            System.out.println("----------------------");
            System.out.print("선택> ");
            int select = scanner.nextInt();
            if (select == 1) {//글작성
                boardService.writing();

            } else if (select == 2) {//글목록
                boardService.list();

            } else if (select == 3) {//글조회 조회수
                boardService.view();

            } else if (select == 4) {//글수정 수정시 비밀번호 입력
                boardService.update();

            } else if (select == 5) {//글삭제 실행시 비번입력
                boardService.delete();

            } else if (select == 6) {//검색 제목으로 검색
                boardService.search();

            }

        }

    }
}
