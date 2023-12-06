package ch07_while;

public class Ex04_WhileEx {
    public static void main(String[] args) {
        int i = 1;
        while(i != 6){
            i = (int)(Math.random() * 6)+1;
            if(i == 6){
                System.out.println("i="+i);
            }else{
                System.out.println("i="+i);
            }
        }
    }
}
