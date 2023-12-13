package ch00_Mainclass.ex4;

public class Student {
    /**
     * 필드
     * 이름(studentName)
     * 학번(studentNumber)
     * 학과(studentMajor)
     * 전화번호(studentMobile)
     * */
    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;
    //각 필드으 getter/setter 메서드
    //art+insert => Getter and Setter

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }


    //기본생성자
    public Student(){

    }
    //모든 필드를 매개변수로 하는 생성자
    //art+insert => constructor

    public Student(String studentName, String studentNumber, String studentMajor, String studentMobile) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }
    //art+insert => toString
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }

    //필드에 저장된 값을 출력하는 print() 메서드
   public void print(){
       System.out.println("studentName= " + studentName + "studentNumber= " +studentNumber + "studentMajor= " +studentMajor + "studentMobile= " +studentMobile);
   }
}
