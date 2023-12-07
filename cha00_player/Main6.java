package cha00_player;

public class Main6 {
    public static void main(String[] args) {
        /**
         * (-1) + 2 + (-3) + 4 + (-5) + 6 ~~~
         * 처럼 계산을 했을 때 합계가 150이 됐을 때의 숫자를 출력
         * 정답 : ??
         */
        boolean run = true;
        int sum = 0; //전채합
        int num = 0; //(-1) + 2 + (-3) + 4 + (-5) + 6...씩 늘린 값의 핪
        int count = 1; // 1,2,3,4...
        int s = -1; // -,+

        while(run){
            sum = sum + num;
            if(sum >= 150){
                run = false;
            }else{
                num =s * count;
                s = -s;
                count++;
            }
        }
        System.out.println("num = " + num);
        System.out.println("sum = " + sum);

    }
}
