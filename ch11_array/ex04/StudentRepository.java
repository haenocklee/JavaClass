package ch11_array.ex04;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    //모든 학생정보를 관리하는 역할 리스트
    //저장, 수정, 삭제 등의 처리는 Repository에서만 이루어 지도록 하기 위해 private
    //값을 계속 유지하기 위해 static
    private static List<StudentDTO> studentDTOList = new ArrayList<>();
    public void method1(){
        System.out.println("StudentRepository.method1");
    }

    /**
     * method name: method2
     * parameter: String
     * retune : x
     * 실행내용: 전달받은 매개변수 값 출력
     * */
    public void method2(String str1){
        System.out.println("param1 = " + str1);
    }

    /**
     * method name: method3
     * prameter: studentDTO
     * return: boolean
     * 실행내용: 전달받은 DTO 객체를 List에 저장하고 결과를 리턴
     * */
    public boolean method3 (StudentDTO studentDTO) {// public 타입 [...] (타입 매개변수) 이렇게 정의해야한다... 타입은 Class도 들어갈수 있다.
        System.out.println("studentDTO = " + studentDTO);
//       boolean result= studentDTOList.add(studentDTO);
//       return result;
//       밑에 식과 위의 식은 같다
        return studentDTOList.add(studentDTO);
    }

    /**
     * return name: List
     * */
    public List<StudentDTO> method4(){
        return studentDTOList;
    }

    /**
     * name: method5
     * parameter: Long
     * return: StudentDTO
     * */
    public StudentDTO method5(Long id){
        //id 와 일치하는 데이터가 있으면 해당 DTO객체를 리턴하고
        // 없으면 null을 리턴함
        StudentDTO studentDTO = null;
        for (int i = 0; i < studentDTOList.size(); i++) {
            if (id.equals(studentDTOList.get(i).getId())) {
                studentDTO = studentDTOList.get(i);
            }
        }
        return studentDTO;
    }
}
