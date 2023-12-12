package ch00_Mainclass.ex3;

public class MethodMain {
    public static void main(String[] args) {
        Method method = new Method();

        //method1 호출
        method.method1();
        System.out.println();
        //method2 호출
        method.method2("매서드 2번 입력하고 상태확인");
        System.out.println();
        //method3 호출
        String sum = method.method3();
        System.out.println("sum = " + sum);
        System.out.println();
        //method4 호출
        int num3 = method.method4();
        System.out.println("num3 = " + num3);
        System.out.println();
        //method5 호출
        String sum0 = method.method5("오늘은 화요일 ");
        System.out.println("sum0 = " + sum0);
    }
}
