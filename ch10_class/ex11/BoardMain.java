package ch10_class.ex11;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 글작성(매개변수 있는 생성자이용)
         *      글작성 정보는 스캐너로 받음. 글번호도 같이 입력함.
         * 2. 글조회
         *      글번호를 입력 받고 Board 클래스의 findById로 글번호를 넘긴다.
         * 3. 종료
         */
        Scanner scanner = new Scanner(System.in);
        Board board =null;
        boolean run = true;
        int selectNo = 0;

        while (run) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {//boardContents = 글작성, id = 글번호
                board = new Board();
                System.out.print("제목: ");
                String boardTitle = scanner.next();
                System.out.print("작성자: ");
                String boardboardWriter = scanner.next();
                System.out.println("글작성...");
                String boardContents = scanner.next();
                System.out.print("글번호(id):");
                long id = scanner.nextLong();
                board.setBoardTitle(boardTitle);
                board.setBoardWriter(boardboardWriter);
                board.setBoardContents(boardContents);
                board.setId(id);
            } else if (selectNo == 2) {//id = 글번호
                System.out.print("[글번호 입력]: ");
                long id = scanner.nextLong();
                board.findById(id);
            } else if (selectNo == 3) {
                System.out.println("[종료]");
                run = false;
            } else {
                System.out.println(board);
            }
        }
    }
}