package ch10_class.ex4;
//이름(studentName),학번(studemtNumber),학과(studentMajor)
//필드
public class Student {
    String studentName;
    int studemtNumber;
    String studentMajor;

    //기본생성자
    public Student(){
        System.out.println("기본생성자");
    }

    //이름 학번 학과를 매개변수로 하는 생성자
    public Student(String studentName,int studentNumber,String studentMajor){
        System.out.println("studentName = " + studentName + ", studentNumber = " + studentNumber + ", studentMajor = " + studentMajor);

        this.studentName = studentName;
        this.studemtNumber = studentNumber;
        this.studentMajor = studentMajor;

    }
}
