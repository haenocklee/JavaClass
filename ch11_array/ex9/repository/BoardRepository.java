package ch11_array.ex9.repository;

import ch11_array.ex9.dto.BoardDTO;
import ch11_array.ex9.dto.CommentDTO;
import ch11_array.ex9.dto.MemberDTO;
import ch11_array.ex9.service.BoardService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardRepository {
    Scanner scanner = new Scanner(System.in);
    List<BoardDTO> boardDTOList = new ArrayList<>();


    //id검사용 메서드
    public BoardDTO idChack(Long boardid) {
        BoardDTO result = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardid.equals(boardDTOList.get(i).getId())) {
                result = boardDTOList.get(i);
            }
        }
        return result;
    }

    //로그인 이메일의글 조회용 메서드
    public void findbylogin(String loginE) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (loginE.equals(boardDTOList.get(i).getBoardWriter())) {
                System.out.println(boardDTOList.get(i));
            }
        }
    }

    //글작성
    public BoardDTO write(BoardDTO boardDTO) {
        boardDTOList.add(boardDTO);
        return boardDTO;
    }

    //목록
    public void wFindAll() {
        for (int i = 0; i < boardDTOList.size(); i++) {
            System.out.println(boardDTOList.get(i));
        }
    }

    //글조회
    public void wFindbyid(Long boardid) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardid.equals(boardDTOList.get(i).getId())) {
                int hitSum = boardDTOList.get(i).getBoardHits();
                hitSum++;
                boardDTOList.get(i).setBoardHits(hitSum);
                System.out.println(boardDTOList.get(i));
                System.out.println("조회수: " + boardDTOList.get(i).getBoardHits());
            }
        }
    }

    //글수정
    public void wUpate(Long boardid, String loginE) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardid.equals(boardDTOList.get(i).getId()) && loginE.equals(boardDTOList.get(i).getBoardWriter())) {
                System.out.print("수정할 제목: ");
                String boardTitle = scanner.next();
                System.out.print("수정할 내용: ");
                String boardContents = scanner.next();
                boardDTOList.get(i).setBoardTitle(boardTitle);
                boardDTOList.get(i).setBoardContents(boardContents);
            } else {
                System.out.println("본인의 글만 수정가능합니다.");
            }
        }
    }
//글삭제
    public void wDelete(Long boardid, String loginE) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardid.equals(boardDTOList.get(i).getId()) && loginE.equals(boardDTOList.get(i).getBoardWriter())) {
                boardDTOList.remove(i);
                System.out.println("글삭제 완료");
            } else {
                System.out.println("본인의 글만 삭제가능합니다.");
            }
        }
    }
//검색
    public void wSearch(String title) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(title)) {
                System.out.println(boardDTOList.get(i));
            }else {
                System.out.println("검색결과가 없습니다.");
            }
        }
    }
}
