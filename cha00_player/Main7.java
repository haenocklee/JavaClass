package cha00_player;

public class Main7 {
    public static void main(String[] args) {
        /**
         * *
         * **
         * ***
         * ****
         * *****
         * 만들기
         **/
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }

    }
}

//        for (int i = 1; i <= 5 ; i++) {// 줄수, 별을 출력할 횟수
//            for (int j = 1; j <= i; j++) {// 별을 줄수만큼 출력
//                System.out.print("*");
//            }
//            System.out.println();//줄을 바꾸기 위한 용도
//        }
//    }
//}
//
