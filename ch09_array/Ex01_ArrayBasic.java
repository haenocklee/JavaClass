package ch09_array;

public class Ex01_ArrayBasic {
    public static void main(String[] args) {

        //크기가 5인 정수 배열 작성
        int[] number1 = new int[5];
        System.out.println("number1[0]=" + number1[0]);
        number1[0] =100;
        System.out.println("number1[0]=" + number1[0]);
        //배열의 크기 확인용 출력
        System.out.println(number1.length);
        //크기는5지만 0 ~ 4번까지 있다. 자주 실수하는 부분 ... 0,1,2,3,4(5개)
        //밑에깥이5를 쓰면 [error]뜬다
        System.out.println("number1[5]=" + number1[5]);

        // 크가거 3인 문자 배열작성
        String[] string1 = new String[3];

        // 크기가 10인 실수 배열 작성
        double[] doubles = new double[10];

        //배열값을 정하지 않은후 크키가 8인 정수 배열 작성
        int[] number2 = null;
        int size = 8;
        number2 = new int [size];

        //값이 미리 정해진 배열
        int[] number3 = {10, 20, 30, 40};
        String[] string2 = {"가", "나", "다"};
    }
}
