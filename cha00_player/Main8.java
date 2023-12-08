package cha00_player;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sum = {"둘","셋","넷","하나"};
        /**
         * 위와 같은 배열이 있을 때
         * 하나 둘 셋 넷 사이의 문자 중에서 하나를 입력했을때
         * 그 문자가 몇 번 인덱스에 있는지 출력
         * */
        System.out.print("문자: ");
        String count = scanner.nextLine();
        for (int i = 0; i < sum.length; i++) {
            if(count.equals(sum[i])){
                System.out.println(count + "는 " + i +"번 인덱스에 있습니다.");
            }
        }
    }
}
