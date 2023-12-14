package ch11_array.ex2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        // Student 클래스 객체를 담위기한 List
        // studentlist
        List<Student> studentList = new ArrayList<>();
//        studentList.add(12);//x

//        String studentName = "학생1";
//        studentList.add(studentName)//X

        //Student객체//Student 객체 필드값 입력
        Student student1= new Student(1L,"학생1","2031111","현대무용","010-1111-1111");
        //studentList 추가
        studentList.add(student1);

        //for과 사용이 가능해보인다
        //student[i]로 정의하고 i를 for문으로 돌릴경우 쓸대마다 객체 설정이 가능
        //scanner를 이용에 값을 넣는 식으로 가능해 보인다.
        Student student2= new Student(2L,"학생2","2031112","현대무용","010-1222-1221");
        studentList.add(student2);

        System.out.println("studentList학생1 = " + studentList.get(0));
        System.out.println("studentList학생2 = " + studentList.get(1));
        
        Student a = studentList.get(0);
        System.out.println("a = " + a);

        //1번 인덱스 에 담긴 객체의 학과만 출력
        System.out.println(studentList.get(1).getStudentMajar());

        //반복문
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("studentList = " + studentList.get(i));
            //학생의 이름만 따로 출력
            System.out.println("studentList = " + studentList.get(i).getStudentName());
        }

        for (Student stu: studentList) {
            System.out.println("stu = " + stu);
            //이름만
            System.out.println("stu.getStudentName() = " + stu.getStudentName());
        }
    }
}
