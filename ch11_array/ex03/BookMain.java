package ch11_array.ex03;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        // Book 객체를 담기위한 bookList 객체 선언
        List<Book> bookList = new ArrayList<>();

        // 기본생성자로 Book 객체(book1) 생성 후 bookList에 추가
        Book book1 = null;
        book1 = new Book();
//        book1.setId(9788937460197L);
        book1.setBookTitle("파리 대왕");
        book1.setBookAuthor("윌리엄 골딩");
        book1.setBookPrice("8100원");
        book1.setBookPublisher("민음사");
        bookList.add(book1);

        // 매개변수 생성자로 Book 객체(book2) 생성 후 bookList에 추가
        Book book2 = new Book("오만과 편견","제인 오스틴","11700원","민음사");
        bookList.add(book2);

        Book book3 = new Book("트렌드 코리아 2024","김난도","19000","미래의 창");
        bookList.add(book3);

        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList.get(i) = " + bookList.get(i));
        }

        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book book:
             bookList) {
            System.out.println("book = " + book);
        }

        // list의 0번 인덱스에 담긴 책의 가격을 50000으로 변경
        bookList.get(0).setBookPrice("50000원");

        // list의 1번 인덱스에 담긴 출판사의 제목을 "안녕출판사"로 변경
        bookList.get(1).setBookPublisher("안녕출판사");

        // for를 이용하여 bookList의 전체 데이터 출력
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("bookList.get(i) = " + bookList.get(i));
        }


        // for each를 이용하여 bookList의 전체 데이터 출력
        for (Book book:
                bookList) {
            System.out.println("book = " + book);
        }

    }
}
