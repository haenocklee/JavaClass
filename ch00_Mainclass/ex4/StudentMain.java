package ch00_Mainclass.ex4;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        //기본생성자로 Student클래스 객체 만들고 setter를 이용하여 필드값 채우기
        //모든 필드를 매개변수로 하는 생성자로 Student 클라스 객체 만들기
        //각각의 객체에서 Print메서드 호출하여 필드값 출력
        Student student1 = null;
        Scanner scanner = new Scanner(System.in);
        student1 = new Student();
        student1.setStudentName("");

    }
}
