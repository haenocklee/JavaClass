package ch06_for;

public class Ex08_NestedFor {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 구구단 출력
         */
        int num = 0;

        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                num = i * j;
                System.out.print(i + "x" + j + "=" + num);
                System.out.print("\t"); // 공백을 만들어 주는 기능
            }
            System.out.println();
//          System.out.println("\n"); 줄띄우기로 사용할수 있는 프린트 옵션
        }
        System.out.println("구구단 실행 완료");
    }
}
