package ch00_Mainclass.ArrayEx04;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        int selectNo = 0;
        boolean run = true;
        while (run)
            System.out.println("------");
        System.out.println("1.method1 호출 | 2.method2 호출 | 3.method3 호출 | 4.종료");
        System.out.println("------");
        System.out.print("선택> ");
        selectNo = scanner.nextInt();
        if (selectNo == 1) {
            studentService.method1();
        } else if (selectNo == 2) {
            studentService.method2();
        } else if (selectNo == 3) {
            studentService.method3();
        } else if (selectNo == 4) {
            run = false;
        }

    }
}
