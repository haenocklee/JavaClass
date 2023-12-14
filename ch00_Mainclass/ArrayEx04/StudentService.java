package ch00_Mainclass.ArrayEx04;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();
    public void method1 (){
        System.out.println("StudentService.method1");
        studentRepository.method1();
    }
    public void method2 (){
        System.out.println("StudentService.method2");
        String str1 = "파이팅!";
        studentRepository.method2(str1);
    }
    /**
     * StudnetDTO 객체를 생성하고
     * Repsitory의 method3로 DTO 객체를 전달함.
     * */
    public void method3 (){
        System.out.println("StudentService.method3");
        StudentDTO studentDTO = new StudentDTO("학생2",2,"학과2","010-0000-0000");
    }
}
