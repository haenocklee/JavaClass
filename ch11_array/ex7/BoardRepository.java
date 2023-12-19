package ch11_array.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardRepository {
    List<BoardDTO> boardDTOList = new ArrayList<>();

    //쓰기
    public boolean writing(BoardDTO boardDTO) {
        boolean result = false;
        if (boardDTO != null) {
            boardDTOList.add(boardDTO);
            result = true;
        } else {
            System.out.println("글의 내용이 없습니다");
        }
        return result;
    }

    //목록

    //조회수 증가
    public void check(Long id) {

        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                int views = boardDTOList.get(i).getViews();
                boardDTOList.get(i).setViews(++views);
            }
        }
    }

    public BoardDTO view(Long id) {
        BoardDTO result = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                result = boardDTOList.get(i);
            }
        }
        return result;
    }


    //수정
    public BoardDTO update(Long id, String pass, String title, String contents) {
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && pass.equals(boardDTOList.get(i).getBoardPass())) {
                boardDTOList.get(i).setBoardTitle(title);
                boardDTOList.get(i).setBoardContents(contents);
                boardDTO = boardDTOList.get(i);
            }
        }
        return boardDTO;
    }

    //삭제
    public boolean delete(Long id, String pass) {
        boolean result = false;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId()) && pass.equals(boardDTOList.get(i).getBoardPass())) {
                boardDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }

    //검색
    public List<BoardDTO> search(String sTitle) {
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(sTitle)) {
                boardDTOS.add(boardDTOList.get(i));
            }
        }
        return boardDTOS;
    }

    public List<BoardDTO> list() {
        return boardDTOList;
    }
}

