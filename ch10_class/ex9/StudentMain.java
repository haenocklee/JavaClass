package ch10_class.ex9;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        //기본생성자로 Student클래스 객체 만들고 setter를 이용하여 필드값 채우기
        //모든 필드를 매개변수로 하는 생성자로 Student 클라스 객체 만들기
        //각각의 객체에서 Print메서드 호출하여 필드값 출력

        //기본생성자로 Student클래스 객체 만들고 setter를 이용하여 필드값 채우기
        Student student = new Student();
        System.out.println("student = " + student);
        student.setStudentName("김매미");
        student.setStudentNumber("1234123412");
        student.setStudentMajor("컴공과");
        student.setStudentMobile("010-1234-1234");
        System.out.println();

        //모든 필드를 매개변수로 하는 생성자로 Student 클라스 객체 만들기
        Student student1 = new Student("김말이", "4321432143", "컴공과", "010-1111-1111");
        System.out.println("student1 = " + student1);
        System.out.println();

        //각각의 객체에서 Print메서드 호출하여 필드값 출력
        student1.print();
        student.print();

        System.out.println("student1 = " + student1);
        System.out.println("student = " + student);
    }
}
