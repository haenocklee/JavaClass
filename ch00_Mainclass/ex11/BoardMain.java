package ch00_Mainclass.ex11;

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
        Board board = null;
        boolean run = true;
        while(run){
            System.out.println("-----------[메뉴]-----------");
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("---------------------------");
            System.out.print("선택> ");
            int selectNom = scanner.nextInt();
            //글작성
            if(selectNom == 1){
                System.out.println("[글작성]");
                System.out.print("글번호: ");
                Long id = scanner.nextLong();
                System.out.print("제목: ");
                String boardTitle = scanner.next();
                System.out.print("작성자: ");
                String boardWriter = scanner.next();
                System.out.println("___내용___");
                String boardContents = scanner.next();
//                매개변수 있는 생성자이용
                board = new Board(id,boardTitle,boardWriter,boardContents);
                System.out.println("글작성 완료");

                //글조회
            } else if (selectNom == 2) {
                System.out.println("[글조회]");
                System.out.print("조회할 글번호: ");
                Long id = scanner.nextLong();
                board.findById(id);

                //종료
            } else if (selectNom == 3) {
                System.out.println("[종료]");
                run = false;

                //toString 값 조회
            }else {
                System.out.println(board);
            }
        }
    }
}
