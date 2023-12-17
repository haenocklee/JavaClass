package ch00_Mainclass.bookBord;

import java.util.List;
import java.util.Scanner;

public class BookService {
    /**
     * 도서관리번호(id) - Long 타입
     * 도서명(bookTitle)
     * 저자(bookAuthor)
     * 가격(bookPrice)
     * 출판사(bookPublisher)
     */
    Scanner scanner = new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();

    public void regist() {
        System.out.print("도서명 입력: ");
        String bookTitle = scanner.next();
        System.out.print("저자 입력: ");
        String bookAuthor = scanner.next();
        System.out.print("가격 입력: ");
        int bookPrice = scanner.nextInt();
        System.out.print("출판사 입력: ");
        String bookPublisher = scanner.next();
        BookDTO bookDTO = new BookDTO(bookTitle, bookAuthor, bookPrice, bookPublisher);
        boolean result = bookRepository.regist(bookDTO);
        if (result == true) {
            System.out.println("등록성공");
        } else {
            System.out.println("등록실패");
        }
    }

    public void list() {
        List<BookDTO> bookDTOList = bookRepository.list();
        for (BookDTO bookDTO : bookDTOList) {
            System.out.println("bookDTO for each = " + bookDTO);
        }
        for (int i = 0; i < bookDTOList.size(); i++) {
            System.out.println("bookDTOList.get(i) = " + bookDTOList.get(i));
        }
        System.out.println("-----");
    }

    public void askId() {//id를 입력받고 ?집어 넣어서 결과갑을 ?부터 가져와야함
        System.out.println("찾을 id를 입력 하세요: ");
        Long id = scanner.nextLong();
        BookDTO result = bookRepository.askId(id);
        if (result != null) {
            System.out.println("result = " + result);
        } else {
            System.out.println("없는 id 입니다.");
        }
        System.out.println("-----");
    }

    public void askTitle() {
        System.out.print("찾을 bookTitle을 입력 하세요: ");
        String bookTitle = scanner.next();
        BookDTO result = bookRepository.askTitle(bookTitle);
        if (result != null) {
            System.out.println("result = " + result);
        } else {
            System.out.println("없는 bookTitle 입니다.");
        }
    }

    public void fixPrice() {
        System.out.println("가격을 수정할 책의 id를 입력 하세요: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.askId(id);
        if (bookDTO != null) {
            int bookPrice = scanner.nextInt();
            boolean fixPriceResult = bookRepository.fixPrice(id, bookPrice);
            if (fixPriceResult == true) {
                System.out.println("수정성공");
            } else {
                System.out.println("수정실패");
            }
        }else{
            System.out.println("도서정보가 없습니다.");
        }
    }


    public void delete() {
        System.out.println("제거할 책의 id를 입력 하세요: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.askId(id);
        if(bookDTO != null){
            boolean delete = bookRepository.deletet(id);
            if(delete == true){
                System.out.println("삭제가 완료되었습니다");
            }
        }else{
            System.out.println("도서정보가 없습니다.");
        }

    }

    public void serch() {
        System.out.print("검색어: ");
        String bookTitle = scanner.next();
        List<BookDTO> bookDTOS = bookRepository.serch(bookTitle);
        if(bookDTOS.size() > 0){
            for (BookDTO bookDTO:bookDTOS){
                System.out.println("bookDTO = " + bookDTO);
            }
        }else{
            System.out.println("검색 결과가 없습니다");
        }
    }
}
