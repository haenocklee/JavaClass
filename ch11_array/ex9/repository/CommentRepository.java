package ch11_array.ex9.repository;

import ch11_array.ex9.dto.CommentDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommentRepository {
    List<CommentDTO> commentDTOList = new ArrayList<>();
    public void comment(CommentDTO commentDTO) {
        commentDTOList.add(commentDTO);
        for (int i = 0; i < commentDTOList.size(); i++) {
            System.out.println(commentDTOList.get(i));
        }
    }
}


