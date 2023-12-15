package ch00_Mainclass.bookBord;

import java.util.Scanner;

public class BookService {
    /**
     도서관리번호(id) - Long 타입
     도서명(bookTitle)
     저자(bookAuthor)
     가격(bookPrice)
     출판사(bookPublisher)
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


    }
}
