package ch14_inheritance.ex01;

public class ChildClass extends ParentClass{
    public ChildClass(){
        System.out.println("자식 기본생성자");
    }

    //메서드 재정의
    @Override
    public void hello(){//슈퍼클래스(부모)의 메서드 규칙을 따라간다
        System.out.println("ChildClass.hello");
    }
}
