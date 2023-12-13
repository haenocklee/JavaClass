package ch10_class.ex11;

public class Board {
    /**
     게시글 클래스
     필드
     글번호(id) - Long 타입
     제목(boardTitle)
     작성자(boardWriter)
     내용(boardContents)
     조회수(boardHits)
     필드에 대한 getter/setter
     생성자 2가지
     toString method
     글조회 method
     name: findById
     parameter: id
     return: x
     실행내용
     main으로부터 글번호를 전달받고 글번호가 일치하면 해당 게시글의 내용을
     print로 출력해준다.
     단 출력하기 전에 조회수 값을 1 증가 시켜야 한다.
     */
    private long id;
    private String boardTitle;
    private String boardWriter;
    private String boardContents;
    private int boardHits;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWriter() {
        return boardWriter;
    }

    public void setBoardWriter(String boardWriter) {
        this.boardWriter = boardWriter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }
//    글번호(id) - Long 타입
//    제목(boardTitle)
//    작성자(boardWriter)
//    내용(boardContents)
//    조회수(boardHits)
    public Board(){}
    public Board(long id,String boardTitle,String boardWriter,String boardContents){}

//    toString method
    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardWriter='" + boardWriter + '\'' +
                ", boardContents='" + boardContents + '\'' +
                ", boardHits=" + boardHits +
                '}';
    }

//    글조회 method
//    name: findById
//    parameter: id
//     return: x
//            실행내용
//    main으로부터 글번호를 전달받고 글번호가 일치하면 해당 게시글의 내용을
//    print로 출력해준다.
//    단 출력하기 전에 조회수 값을 1 증가 시켜야 한다.
    public void findById(long id){//id = 글번호
        if(id == getId()){
            System.out.print("제목: " +  getBoardTitle());
            System.out.print("저자: " + getBoardWriter());
            System.out.println("본문 " + getBoardContents());
            this.boardHits = boardHits + 1;
            System.out.println("조회수:" + getBoardHits());
        }else{
            System.out.println("없는 글번호(id) 입니다.");
        }
    }
}
