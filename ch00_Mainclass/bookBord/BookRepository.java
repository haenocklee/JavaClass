package ch00_Mainclass.bookBord;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    List<BookDTO> bookDTOList = new ArrayList<>();

    public boolean regist(BookDTO bookDTO) {
        boolean result = bookDTOList.add(bookDTO);//리스트는 원래 불린 값이다.(true 값이 거의 대부분)
        return result;
    }

    public List<BookDTO> list() {
        return bookDTOList;
    }

    public BookDTO askId(Long id) {
        BookDTO bookDTO = null;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                bookDTO = bookDTOList.get(i);
            }
        }
        return bookDTO;
    }

    public BookDTO askTitle(String bookTitle) {
        BookDTO bookDTO = null;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (bookTitle.equals(bookDTOList.get(i).getBookTitle())) {
                bookDTO = bookDTOList.get(i);
            }
        }
        return bookDTO;
    }

    public boolean fixPrice(Long id, int bookPrice) {
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                bookDTOList.get(i).setBookPrice(bookPrice);
                result = true;
            }
        }
        return result;
    }

    public boolean deletet(Long id) {
        boolean result = false;
        for (int i = 0; i < bookDTOList.size(); i++) {
            if (id.equals(bookDTOList.get(i).getId())) {
                bookDTOList.remove(i);//삭제기능을 가짐
                result = true;
            }
        }
        return result;
    }

    public List<BookDTO> serch(String bookTitle) {
        List<BookDTO> bookDTOS = new ArrayList<>();
        for (int i = 0; i < bookDTOList.size(); i++) {
            //.contain() 은 괄호 안에 무언가가 써지면 그것이 포함된 모든것이 true;
            if(bookDTOList.get(i).getBookTitle().contains(bookTitle)){
                BookDTO bookDTO =  bookDTOList.get(i);
                bookDTOS.add(bookDTO);
            }
        }
        return bookDTOS;
    }
}
