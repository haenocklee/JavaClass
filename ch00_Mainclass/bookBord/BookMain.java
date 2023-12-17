package ch00_Mainclass.bookBord;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        boolean run = true;

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.도서등록 | 2.도서목록 | 3.도서조회(id) | 4.도서조회(제목) | 5.가격수정 | 6.도서삭제 | 7.도서검색 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();
            if(selectNo == 0){
                run = false;
            } else if (selectNo == 1) {
                bookService.regist();
            } else if (selectNo == 2) {
                bookService.list();
            }else if (selectNo == 3) {
                bookService.askId();
            }else if (selectNo == 4) {
                bookService.askTitle();
            }else if (selectNo == 5) {
                bookService.fixPrice();
            }else if (selectNo == 6) {
                bookService.delete();
            }else if (selectNo == 7) {
                bookService.serch();
            }
        }
    }
}
