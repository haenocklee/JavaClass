package ch11_array.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    //글쓰기
    public void writing() {
        System.out.print("제목: ");
        String title = scanner.next();
        System.out.print("작성자: ");
        String writer = scanner.next();
        System.out.print("내용: ");
        String contents = scanner.next();
        System.out.print("비밀번호: ");
        String pass = scanner.next();
        BoardDTO boardDTO = new BoardDTO(title, writer, contents, pass);
        boolean WRresult = boardRepository.writing(boardDTO);
        if (WRresult == true) {
            System.out.println("글작성 완료");
        } else {
            System.out.println("작성 실패");
        }
    }


    //글목록
    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        listPrint(boardDTOList);
//        for (int i = 0; i < boardDTOList.size(); i++) {
//            System.out.println("boardDTOList = " + boardDTOList.get(i));
//    }

    }


    //글조회
    public void view() {
        System.out.print("조회할 id 입력: ");
        Long id = scanner.nextLong();
        boardRepository.check(id);
        BoardDTO boardDTO = boardRepository.view(id);
        if (boardDTO != null) {
            System.out.println("boardDTO = " + boardDTO);
            System.out.println("조회 완료");
        } else {
            System.out.println("조회한 글이 없습니다");
        }
    }

    //글수정
    public void update() {
        System.out.print("id입력 확인: ");
        Long id = scanner.nextLong();
        System.out.print("비밀번호 확인: ");
        String pass = scanner.next();
        System.out.println("-----");
        System.out.print("수정할 제목 입력: ");
        String title = scanner.next();
        System.out.print("수정할 내용 입력: ");
        String contents = scanner.next();
        BoardDTO boardDTO = boardRepository.update(id, pass, title, contents);
        if (boardDTO != null) {
            System.out.println("수정완료 되었습니다.");
            System.out.println("boardDTO = " + boardDTO);
        } else {
            System.out.println("입력한 정보가 틀립니다.");
        }
    }

    //글삭제
    public void delete() {
        System.out.print("id 확인: ");
        Long id = scanner.nextLong();
        System.out.print("비밀번호 확인: ");
        String pass = scanner.next();
        boolean delResult = boardRepository.delete(id, pass);
        if (delResult == true) {
            System.out.println("삭제완료");
        } else {
            System.out.println("입력한 내용이 틀렸습니다");
        }

    }

    //검색
    public void search() {
        System.out.print("제목 검색: ");
        String sTitle = scanner.next();
        List<BoardDTO> boardDTOList = boardRepository.search(sTitle);
        if (boardDTOList.size() > 0) {
            System.out.println("검색 결과");
            listPrint(boardDTOList);
//            for (int i = 0; i < boardDTOS.size(); i++) {
//                System.out.println("제목 검색 결과 리스트: " + boardDTOS.get(i));
//            }

        } else {
            System.out.println("검색결과가 없습니다.");
        }
    }

    //목록 출력 전용 메서드
    //findAll,search 메서드로 부터 list데이터를 전달 받아서 출력하는 메서드
    private void listPrint(List<BoardDTO> boardDTOList) {
        System.out.println("id\t" + "title\t" + "writer\t" + "views\t" + "date\t");
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println(boardDTO.getId() + "\t" + boardDTO.getBoardTitle() + "\t" +
                    boardDTO.getBoardWriter() + "\t" + boardDTO.getViews() + "\t" +
                    boardDTO.getCreatedAt() + "\t");
        }
    }//Refectoring:반복되는 코드를 정돈시키는것

    public void testData() {
        for (int i = 0; i < 11; i++) {
            BoardDTO boardDTO = new BoardDTO("Title" + i,"Writer" + i,"contents" + i,"1234" + i);
            boardRepository.writing(boardDTO);
        }
    }
}