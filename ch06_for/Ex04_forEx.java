package ch06_for;

public class Ex04_forEx {
    public static void main(String[] args) {
        int num = 0;
        String sum = "";
        for (int i = 1; i < 11; i++) {
            num = num + i;
            if(i < 10){
                sum = i + "+";
                System.out.print(sum);

            }else{
                System.out.print(i + "=");
            }

        }System.out.print(num);
    }
}
