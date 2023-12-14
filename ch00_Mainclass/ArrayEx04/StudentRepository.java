package ch00_Mainclass.ArrayEx04;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    //모든 학생정보를 관리하는 역할 리스트
    //저장, 수정, 삭제 등의 처리는 Repository에서만 이루어 지도록 하기 위해 private
    //값을 계속 유지하기 위해 static
    List<StudentDTO> studentDTOList = new ArrayList<>();
    public void method1(){
        System.out.println("StudentRepository.method1_1");
    }
    /**
     * method name: method2
     * parameter: String
     * retune : x
     * 실행내용: 전달받은 매개변수 값 출력
     * */
    public void method2(String str1){
        System.out.println(str1);
    }
    /**
     * method name: method3
     * prameter: studentDTO
     * return: boolean
     * 실행내용: 전달받은 DTO 객체를 List에 저장하고 결과를 리턴
     * */
    public boolean method3(StudentDTO studentDTO){
//        boolean result = studentDTOList.add(studentDTO);//boolean값이 나온다
        return studentDTOList.add(studentDTO);
    }

    /**
     * return name: List
     * */
    public List<StudentDTO> method4(){
        return studentDTOList;
    }
}
