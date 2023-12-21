package ch11_array.ex9.repository;

import ch11_array.ex9.dto.BoardDTO;
import ch11_array.ex9.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardRepository {
    Scanner scanner = new Scanner(System.in);
    List<BoardDTO> boardDTOList = new ArrayList<>();

    //글작성
    public void write(String loginE) {
        System.out.print("제목: ");
        String boardTitle = scanner.next();
        System.out.print("저자: " + loginE);
        String boardWriter = loginE;
        System.out.print("내용: ");
        String boardContents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents);
        boardDTOList.add(boardDTO);
        if (boardDTO != null) {
            System.out.println("작성성공");
            System.out.println("boardDTO = " + boardDTO);
        } else {
            System.out.println("작성실패");
        }
    }

    //글목록
    public void wFindAll(String loginE) {
        System.out.println("목록조회인" + loginE);
        System.out.println(boardDTOList);
    }

    //글조회
    public void wFindE(String loginE) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (loginE.equals(boardDTOList.get(i).getBoardWriter())) {
                System.out.println(boardDTOList.get(i));
            }
        }
    }

    //글수정
    public void wUpate(String loginE) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (loginE.equals(boardDTOList.get(i).getBoardWriter())) {
                System.out.println(boardDTOList.get(i));
            }
        }
        System.out.print("수정할 글의 id를선택하세요: ");
        Long id = scanner.nextLong();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && loginE.equals(boardDTOList.get(i).getBoardWriter())) {
                System.out.println("글수정");
                System.out.print("제목: ");
                String boardTitle = scanner.next();
                System.out.print("내용:");
                String boardContents = scanner.next();
                boardDTOList.get(i).setBoardTitle(boardTitle);
                boardDTOList.get(i).setBoardContents(boardContents);
            }
        }
    }

    public void wDelete(String loginE) {
    }

    public void wSearch(String loginE) {
    }

    public void sample() {
    }
}
