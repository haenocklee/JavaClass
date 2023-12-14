package ch11_array.ex2;

public class Student {
    /**
     * 필드
     * 관리번호(id)
     * 이름(studentName)
     * 학번(studentNumer)
     * 학과(studentMajar)
     * 전화번호(studentMobile)
     * getter and setter
     * 생성자 2개
     * toString
     * */

    private Long id;
    private String studentName ;
    private String studentNumer;
    private String studentMajar;
    private String studentMobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumer() {
        return studentNumer;
    }

    public void setStudentNumer(String studentNumer) {
        this.studentNumer = studentNumer;
    }

    public String getStudentMajar() {
        return studentMajar;
    }

    public void setStudentMajar(String studentMajar) {
        this.studentMajar = studentMajar;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }
    public Student(){}

    public Student(Long id, String studentName, String studentNumer, String studentMajar, String studentMobile) {
        this.id = id;
        this.studentName = studentName;
        this.studentNumer = studentNumer;
        this.studentMajar = studentMajar;
        this.studentMobile = studentMobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentNumer='" + studentNumer + '\'' +
                ", studentMajar='" + studentMajar + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
