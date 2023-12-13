package ch10_class.ex7;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 출력함
         */
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean run = true;


        while (run) {
            System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 | 아무버튼이나 누를시 종료");
            System.out.print("매뉴선택(번호로입력하세요.): ");
            int cal = scanner.nextInt();
            if (cal == 1) {
                System.out.print("더할숫자를 입력하세요1:");
                int sum1 = scanner.nextInt();
                System.out.print("더할숫자를 입력하세요2:");
                int sum2 = scanner.nextInt();
                calculator.sum(sum1, sum2);

            } else if (cal == 2) {
                System.out.print("뺄숫자를 입력하세요1:");
                int sub1 = scanner.nextInt();
                System.out.print("뺄숫자를 입력하세요2:");
                int sub2 = scanner.nextInt();
                calculator.sub(sub1, sub2);

            } else if (cal == 3) {
                System.out.print("곱할숫자를 입력하세요1:");
                int mul1 = scanner.nextInt();
                System.out.print("곱할숫자를 입력하세요2:");
                int mul2 = scanner.nextInt();
                int mul = calculator.mul(mul1, mul2);
                System.out.println("값: " + mul);

            } else if (cal == 4) {
                int div = calculator.div();
                System.out.println("값: " + div);

            } else {
                System.out.println("종료 합니다.");
                break;
            }
        }
    }
}
