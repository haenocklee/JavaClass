package ch11_array.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

    /**
     * 도서등록 메서드
     * name: save
     * parameter: x
     * return: x
     * 실행내용
     *      스캐너로 도서명, 저자, 가격, 출판사정보를 입력받고
     *      BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     *      등록 여부를 출력한다.(등록성공 or 등록실패)
     */
    public void save () {
        System.out.println("도서명: ");
        String bookTitle = scanner.next();
        System.out.println("저자: ");
        String bookAuthor = scanner.next();
        System.out.println("가격: ");
        int bookPrice = scanner.nextInt();
        System.out.println("출판사: ");
        String bookPublisher = scanner.next();
        BookDTO bookDTO = new BookDTO(bookTitle,bookAuthor,bookPrice,bookPublisher);
        boolean result = bookRepository.save(bookDTO);
        if(result == true) {
            System.out.println("등록성공");
        }else{
            System.out.println("등록실패");
        }
    }

    /**
     * 도서목록 메서드
     * name: findAll
     * parameter: x
     * return: x
     * 실행내용
     *      Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
     */
    public void findAll(){
        List<BookDTO> bookDTOList = bookRepository.findAll();
        for (BookDTO bookDTO:
             bookDTOList) {
            System.out.println("bookDTO = " + bookDTO);
        }
    }


    /**
     * 도서조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     *      id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
     *      없으면 없다고 출력
     */
    public void findById (){
        System.out.print("조회 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if(bookDTO != null){
            System.out.println("bookDTO = " + bookDTO);
        }else{
            System.out.println("도서 정보가 없습니다");
        }
    }

    /**
     * 도서조회 메서드
     * name: findByTitle
     * parameter: x
     * return: x
     * 실행내용
     *      도서제목을 입력받고 Repository로 부터 해당 하는 도서 정보를 출력(제목이 정확히 일치하는 것만)
     *      없으면 없다고 출력
     */
    public void findByTitle (){
        System.out.print("도서명: ");
        String bookTitle = scanner.next();
        BookDTO result = bookRepository.findByTitle(bookTitle);
        if(result != null){
            System.out.println("result = " + result);
        }else {
            System.out.println("도서 정보가 없습니다");
        }
    }

    public void search() {
        System.out.print("검색어: ");
        //변수 bookTile에 스케너로 입력받음
        String bookTile = scanner.next();
        //Repository의Search에 변수bookTile을 보내고 search로부터 값을 받아옴
        //List<>BookDTO형태의 변수bookDTOList에 받아온 search값을 넣는다
        List<BookDTO> bookDTOList = bookRepository.search(bookTile);
        //리스트 변수 bookDTOList의 크기 보다 0이 작을시 if를 실행
        if(bookDTOList.size() > 0){
            //if가실행됬으면 BookDTO형태의 변수 bookDTO를 bookDTOList
            for (BookDTO bookDTO: bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        }else{
            // bookDTOList.size() == 0 => 결과가 없다
            System.out.println("검색 결과가 없습니다!");
        }
    }

    public void update() {
        //수정할 id를 입력받음
        //해당 id도서가 있다면 수정할 가격을 입력받고 수정 처리
        //없으면 없다고 출력
        System.out.print("수정할 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if(bookDTO != null){
            int bookPrice = scanner.nextInt();
            boolean updateRuselt = bookRepository.update(id,bookPrice);
            if(updateRuselt){
                System.out.println("수정성공");
            }else{
                System.out.println("수정 실패");
            }

        }else{
            System.out.println("도서 정보가 없습니다");
        }
    }

    public void delete() {
        System.out.print("삭제할 id: ");
        Long id = scanner.nextLong();
        boolean result = bookRepository.delete(id);
        if(result){
            System.out.println("삭제 성공");
        }else{
            System.out.println("삭제 실패");
        }
    }
}
