package ch11_array.ex9.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommentDTO {
    private Long id;
    private Long boardId;
    private String commentWriter;
    private String commentContents;
    private String createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getCommentWriter() {
        return commentWriter;
    }

    public void setCommentWriter(String commentWriter) {
        this.commentWriter = commentWriter;
    }

    public String getCommentContents() {
        return commentContents;
    }

    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    private static Long idValue = 1L;
    public CommentDTO(){}

    public CommentDTO(Long boardId, String commentWriter, String commentContents) {
        this.id = idValue++;
        this.boardId = boardId;
        this.commentWriter = commentWriter;
        this.commentContents = commentContents;
        this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분ss초"));
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "id=" + id +
                ", boardId='" + boardId + '\'' +
                ", commentWriter='" + commentWriter + '\'' +
                ", commentContents='" + commentContents + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}

