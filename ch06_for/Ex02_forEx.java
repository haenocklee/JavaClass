package ch06_for;

public class Ex02_forEx {
    public static void main(String[] args) {
        //1~10 출력
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //2.4.6.8.10 출력
        for (int i = 1; i < 11; i++) {
            if(i % 2 == 0 )
                System.out.println(i);
        }

        /*
        for (int i = 0; i <=10; i+2) {
            System.out.println(i);
        }
        */

        //5~1 출력
        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);

        }
    }
}
