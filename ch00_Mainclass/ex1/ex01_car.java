package ch00_Mainclass.ex1;

public class ex01_car {
    //차량번호(carNumber), 차량소유주(carOwnersName), 자량소유주번호(carOwersNumber)
    //필드 생성
    String carNumber;
    String carOwnersName;
    String carOwnersNumber;

    //기본 생성자
    public ex01_car(){
        System.out.println("기본생성자");
    }

    public ex01_car(String carNumber,String carOwnersName,String carOwnersNumber){
        System.out.println("carNumber = " + carNumber + ", carOwnersName = " + carOwnersName + ", carOwnersNumber = " + carOwnersNumber);
        this.carNumber = carNumber;
        this.carOwnersName = carOwnersName;
        this.carOwnersNumber = carOwnersNumber;

    }
}
