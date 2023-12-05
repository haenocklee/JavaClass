package ch06_for;

public class Ex03_forEx {
    public static void main(String[] args) {
        //1~10까지의 합계 출력
        int num = 0;
        for (int i = 1; i < 11; i++) {
            num = num+i ;
        }
        System.out.println("num = " + num);
    }
}