package ch11_array.ex04;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    StudentRepository studentRepository = new StudentRepository();
    public void method1(){
        System.out.println("StudentService.method1");
        studentRepository.method1();
    }
    public void method2(){
        System.out.println("StudentService.method2");
        String str1 = "파이팅!";
        studentRepository.method2(str1);
    }

    /**
     * StudnetDTO 객체를 생성하고
     * Repsitory의 method3로 DTO 객체를 전달함.
     * */
    public void method3(){
        System.out.println("StudentService.method3");
        StudentDTO studentDTO = new StudentDTO("학생이름1","학번1","학과1","010-0000-00000");
        boolean result = studentRepository.method3(studentDTO);
    }

    /**
     * Repository로 부터 List 를 리턴 받아 for 문으로 출력
     * */
    public void method4(){
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for (StudentDTO studentDTO:
             studentDTOList) {
            System.out.println("studentDTO = " + studentDTO);
        }
    }

    /**
     * 조회할 id를 입력받고
     * id를  repository로 전달하고
     * repository로 부터 id에 해당하는 학생정보를 리턴 받고
     * 할생 정보 출력
     * */
    public void method5 (){
        System.out.print("조회할 id");
        Long id = scanner.nextLong();
        StudentDTO studentDTO = studentRepository.method5(id);
        if(studentDTO != null){
            // 조회결과 없음
            System.out.println("studentDTO = " + studentDTO);
        }else{
            // 조회결과 없음
            System.out.println("요청하신 정보를 찾을 수 없습니다");
        }
    }
}
