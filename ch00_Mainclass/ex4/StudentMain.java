package ch00_Mainclass.ex4;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        //기본생성자로 Student클래스 객체 만들고 setter를 이용하여 필드값 채우기
        //모든 필드를 매개변수로 하는 생성자로 Student 클라스 객체 만들기
        //각각의 객체에서 Print메서드 호출하여 필드값 출력

        //for문을 이용해서 student[i] 값으로바꿔주면
        //각 클라스 객체를 지정하고 값을 입력가능할 것 으로 보임
        Scanner scanner = new Scanner(System.in);

        Student student1 = null;
        student1 = new Student();
        System.out.print("이름1: ");
        student1.setStudentName(scanner.next());
        System.out.print("학번1: ");
        student1.setStudentNumber(scanner.next());
        System.out.print("학과1: ");
        student1.setStudentMajor(scanner.next());
        System.out.print("전화번호1: ");
        student1.setStudentMobile(scanner.next());

        Student student2 = null;
        System.out.print("이름2: ");
        String name1 = scanner.next();
        System.out.print("학번2: ");
        String number2 = scanner.next();
        System.out.print("학과2: ");
        String major3 = scanner.next();
        System.out.print("전화번호2: ");
        String Mobile4 = scanner.next();
        student2 = new Student(name1,number2,major3,Mobile4);

        student1.print();
        student2.print();
    }
}
