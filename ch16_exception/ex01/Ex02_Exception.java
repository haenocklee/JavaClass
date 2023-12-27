package ch16_exception.ex01;

public class Ex02_Exception {
    public static void main(String[] args) {
        //아래 코드 실행시 발생하는 예외를 확인하고 예외 발생시 0으로 나눌수 없습니다! 가 출력되도롣 만들기
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e ){
            System.out.println("0으로 나눌수 없습니다!");
            e.printStackTrace();
        }
        System.out.println("프로그램 끝");
    }
}
