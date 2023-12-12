package ch00_Mainclass.ex3;

public class Method {
    //매개변수x,리턴x //리턴이 없을때void가 붙는다.
    public void method1(){
        System.out.println("Method.method1");
    }
    //매개변수o, 리턴x
    public void method2(String param1){
        System.out.println("Method.method2");
        System.out.println("param1 = " + param1);
    }
    //매개변수X, 리턴O //리턴시 타입을 적어넣아야한다.
    public String method3(){
        System.out.println("Method.method3");
//        return "매서드3번 가져오기"; //직접적으로 String문으로 입력
        String returnVlaue = "매서드3번";//변수를 지정
        return returnVlaue;//지정한 변수를 리턴 값을로 지정
    }

    //리턴 int
    public int method4(){
        System.out.println("Method.method4");
        int num1 = 10;
        int num2 = 20;
        return num1 * num2;
    }
    //매개변수O,리턴O
    public String method5(String param1){
        System.out.println("Method.method5");
        String sum1 = "좋은 ";
        String sum2 = "날입니다";
        return param1 + sum1 + sum2;
    }
}
