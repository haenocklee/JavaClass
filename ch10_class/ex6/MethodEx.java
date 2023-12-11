package ch10_class.ex6;

public class MethodEx {

    //매개변수x,리턴x //리턴이 없을때void가 붙는다
    public void method1(){
        System.out.println("MethodEx.method1");
    }

    //매개변수o, 리턴x
    public void method2(String param1){
        System.out.println("param1 = " + param1);
        String str2 = "집에가고 싶다";
        System.out.println(param1 + str2);
    }

    //매개변수X, 리턴O //리턴시 타입을 적어넣아야한다
    public String method3(){
        System.out.println("MethodEx.method3");
//        return "부르셧나요?";밑에와 같은 값
        String returnValue = "부르셧나요?";
        return returnValue;
    }

    //리턴 int
    public int method4(){
        int num1 = 10;
        int num2 =20;
        return  num1+num2;
    }

    //매개변수O,리턴O
    public String method5(String param1, int param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        String result = "전단받은 값은 " + param1 + "과" + param2;
        return  result;
    }

    public int method6(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
