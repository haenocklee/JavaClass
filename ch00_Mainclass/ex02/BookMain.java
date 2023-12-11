package ch00_Mainclass.ex02;

public class BookMain {
    public static void main(String[] args) {
        //책 정보는 시중에 있는 실제 책으로 해봅시다.
//        마흔에 읽는 쇼펜하우어
//        저자 강용우
//        출판사 유노북스
//         isbn 9791192300818
//        가격 12150
        //기본생성자로 객체를 만들고 필드값 채우기
        //매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        //모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기

        Book book1 = new Book();
        book1.bookTitle = "마흔에 읽는 쇼펜하우어";
        book1.bookAuthor = "강용우";
        book1.bookPublisher = "유노북스";
        book1.isbn = "9791192300818";
        book1.bookPrice = 12150;

        Book book2 = new Book("마흔에 읽는 쇼펜하우어","강용우");
        book2.bookPublisher = "유노북스";
        book2.isbn = "9791192300818";
        book2.bookPrice = 12150;

        Book book3 = new Book("마흔에 읽는 쇼펜하우어","강용우","유노북스","9791192300818",12150);

    }
}
