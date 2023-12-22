package ch11_array.ex9.service;

import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.dto.BoardDTO;
import ch11_array.ex9.dto.CommentDTO;
import ch11_array.ex9.repository.BoardRepository;
import ch11_array.ex9.repository.CommentRepository;
import java.util.Scanner;
public class BoardService {
    Scanner scanner = new Scanner(System.in);
    BoardRepository boardRepository = new BoardRepository();
    CommentRepository commentRepository = new CommentRepository();
    public void boardMenu() {
        boolean run = true;
        while (run) {
            String loginEmail = CommonVariables.loginEmail;
            System.out.println("====== 게시판 ======");
            System.out.println("--------------------------------------------------------");
            System.out.println("1.글작성 | 2.목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.메인메뉴");
            System.out.println("--------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 0) {
                System.out.println("메인메뉴로 나갑니다.");
                run = false;
            } else if (selectNo == 1) {
                write(loginEmail);
            } else if (selectNo == 2) {
                wFindAll();
            } else if (selectNo == 3) {
                wFindbyid(loginEmail);
            } else if (selectNo == 4) {
                wUpate(loginEmail);
            } else if (selectNo == 5) {
                wDelete(loginEmail);
            } else if (selectNo == 6) {
                wSearch(loginEmail);
            } else if (selectNo == 99) {
                sample();
            }
        }
    }
    //글작성
    public void write(String loginEmail) {
        System.out.print("제목: ");
        String boardTitle = scanner.next();
        System.out.println("저자: " + loginEmail);
        String boardWriter = loginEmail;
        System.out.print("내용: ");
        String boardContents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents);
        BoardDTO result = boardRepository.write(boardDTO);
        if (result != null) {
            System.out.println("작성성공");
            System.out.println("result = " + result);
        } else {
            System.out.println("작성실패");
        }
    }
    //글목록
    public void wFindAll() {
        boardRepository.wFindAll();
    }
    //글조회 댓글기능
    public void wFindbyid(String loginEmail) {
        System.out.print("조회할 id: ");
        Long boardid = scanner.nextLong();
        BoardDTO result = boardRepository.idChack(boardid);
        if (result != null) {
            System.out.println("조회완료 id: " + boardid);
            boardRepository.wFindbyid(boardid);
            boolean run = true;
            while (run) {
                System.out.println("1.댓글쓰기 | 2.메뉴로 돌아가기");
                System.out.print("선택> ");
                int select = scanner.nextInt();
                if (select == 1) {//댓글쓰기
                    System.out.print("댓글: ");
                    String commentContents = scanner.next();
                    CommentDTO commentDTO = new CommentDTO(boardid, loginEmail, commentContents);
                    commentRepository.comment(commentDTO);
                } else if (select == 2) {//메뉴로돌아가기
                    System.out.println("메뉴로 돌아갑니다");
                    run = false;
                }
            }
        } else {
            System.out.println("조회한 id가 없습니다.");
        }
    }
    //글수정
    public void wUpate(String loginEmail) {
        System.out.println("사용자: " + loginEmail + "의글>");
        boardRepository.findbylogin(loginEmail);
        System.out.print("수정할 id: ");
        Long boardid = scanner.nextLong();
        BoardDTO clearid = boardRepository.idChack(boardid);
        if (clearid != null) {
            boardRepository.wUpate(boardid, loginEmail);
        } else {
            System.out.println("없는 id입니다");
            wUpate(loginEmail);
        }
    }
    //글삭제
    public void wDelete(String loginEmail) {
        System.out.println("사용자: " + loginEmail + "의글>");
        boardRepository.findbylogin(loginEmail);
        System.out.print("삭제할 글 id: ");
        Long boardid = scanner.nextLong();
        BoardDTO clearid = boardRepository.idChack(boardid);
        if (clearid != null) {
            boardRepository.wDelete(boardid, loginEmail);
        } else {
            System.out.println("없는 id입니다");
            wUpate(loginEmail);
        }
    }
    //검색
    public void wSearch(String loginEmail) {
        System.out.println("이용자:" + loginEmail);
        System.out.println("찾을 제목: ");
        String title = scanner.next();
        boardRepository.wSearch(title);
    }
    //sample
    public void sample() {

    }
}


