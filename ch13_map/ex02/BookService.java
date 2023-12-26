package ch13_map.ex02;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookService {
    Scanner scanner =new Scanner(System.in);
    BookRepository bookRepository = new BookRepository();
    public void save() {
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

    public void findAll() {
        Map<Long, BookDTO> bookDTOMap = bookRepository.findAll();
        for(Long i :bookDTOMap.keySet()){
            System.out.println(bookDTOMap.get(i));
            //도서 제목만 본다면
            System.out.println(bookDTOMap.get(i).getBookTitle());
        }
    }

    public void findById() {
        System.out.print("조회 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if(bookDTO != null){
            System.out.println("bookDTO = " + bookDTO);
        }else{
            System.out.println("도서 정보가 없습니다");
        }
    }

    public void update() {
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
}
