package ch06_for;

public class Ex06_forEx {
    public static void main(String[] args) {
        int num1 = 0;
        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0){
                num1 = num1 + i;
                System.out.println("3의배수: " + i);
            }

        }
        System.out.println("3의 배수의 합: " + num1);
    }
}
