package ch00_Mainclass.ex1;

import java.util.Arrays;

public class ex01_carMain {
    public static void main(String[] args) {
        //기본생성자로 car1객체 생성, 필드 새팅 값을 정해주기
        ex01_car car1 = new ex01_car();
        car1.carNumber = "34허3456";
        car1.carOwnersName = "허허허";
        car1.carOwnersNumber = "010-0987-0987";


        //매개변수가 있는 생성자로 car2객체 생성, 필드 새팅 값을 정행주기
        ex01_car car2 = new ex01_car("13바1234","이이이","010-1234-1234");

    }
}
