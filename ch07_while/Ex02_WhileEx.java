package ch07_while;

public class Ex02_WhileEx {
    public static void main(String[] args) {
        /**
         * whiel 문으로 1~10까지 출력
         * 출력
         * 1+2+3+4+5+^+7+8+9+10=55
         * */

        int i = 1, sum = 0;
        while(i <= 10){
            System.out.print(i);
            sum = sum +i;

            if(i < 10){
                System.out.print("+");
            }else{
                System.out.print("=");
            }
            i++;
        }
        System.out.print(sum);
    }
}
