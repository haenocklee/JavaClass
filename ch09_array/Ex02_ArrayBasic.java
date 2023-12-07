package ch09_array;

import java.sql.SQLOutput;

public class Ex02_ArrayBasic {
    public static void main(String[] args) {
        int[] numbers1 = {10,20,30,40,50};

        //배열대이터 출력
        System.out.println("number[0]=" + numbers1[0]);
        System.out.println("number[1]=" + numbers1[1]);
        System.out.println("number[2]=" + numbers1[2]);
        System.out.println("number[3]=" + numbers1[3]);

        //for문을 이용해서 배열 데이터 출력
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("number1 = " + numbers1[i]);
        }

        //number1에 저장된 모든 데이터 총합, 평균 계산
        int num1= 0;
        for (int i = 0; i < numbers1.length; i++) {
            num1 = num1 + numbers1[i];
        }
        System.out.println("num1= " + num1);
        System.out.println("avg= " + (double)num1 / numbers1.length);
    }
}
