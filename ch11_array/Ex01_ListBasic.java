package ch11_array;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ListBasic {
    public static void main(String[] args) {
        //정수를 담는 intList 선언
        List<Integer> intList = new ArrayList<>();//스프링 사용시 써야하는 좌변
        ArrayList<Integer> intList2 = new ArrayList<>();//스프링 사용시 불가
//        List<Integer> intList3 = new ArrayList<>(); // X

        //10이라는 데이터 추가
        System.out.println(intList.add(10));//boolean 값이다
        System.out.println("intList.size()= " + intList.size());
        intList.add(10000);
        //1번 인덱스에 999추가
        intList.add(1,999);//1번값을 2번으로 밀어내고 999가 1번인덱스에 들어간다
        System.out.println("intList.size()= " + intList.size());
        //인덱스에 담긴 데이터 출력
        System.out.println("intList.get(0)= " + intList.get(0));
        System.out.println("intList.get(1) = " + intList.get(1));
        System.out.println("intList.get(2) = " + intList.get(2));
        //remove()
        intList.remove(1);//1번방 삭재 2번방에 있던걸 1번방으로 이동
        System.out.println("intList.get(0)= " + intList.get(0));
        System.out.println("intList.get(1) = " + intList.get(1));
        System.out.println("intList.get(2) = " + intList.get(2));

        //String을 담는 StrList 선언
        List<String> strList = new ArrayList<>();
        strList.add("안녕");
        strList.add(1,"hellow");
        System.out.println("strList.get(0) = " + strList.get(0));
        System.out.println("strList.get(1) = " + strList.get(1));
        String str1 = strList.get(1);//값이 스트링이니깐 스트링 변수에 집어 넣을수 있다

        //for문을 이용하여 intList에 담긴 데이터를 모두 출력
        for (int i = 0; i < intList.size() ; i++) {
                System.out.println(intList.get(i));
        }
        //for each
        for(Integer a: intList){
            System.out.println("a= " + a);
        }
        intList.forEach(a -> {
            System.out.println("a=" + a);
        });

        //for문을 이용하여 StrList에 담긴 데이터를 모두 출력
        for (int i = 0; i < strList.size() ; i++) {
            System.out.println(strList.get(i));
        }
        //for each
        for(String bb : strList){
            System.out.println("bb = " + bb);
        }
        strList.forEach(bb ->{
            System.out.println("bb = " + bb);
        });
    }
}
