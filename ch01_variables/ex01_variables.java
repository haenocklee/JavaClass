package ch01_variables;

public class ex01_variables {
	public static void main(String[] args) {
		//본인의 이름(name) ,나이(age) ,키(height) ,주소(address) ,전화번호(mobile) 를 입력할 수 있는 변수를 각각 선언해보자.
		String name = "이해녹";
		int age = 28;
		double height = 172.3;
		String address = "문학정보고앞";
		String mobile = "010-2246-7706";
		
		//변수값 출력	
		System.out.println("저의 이름은 " + name +" 입니다.");// String 과 String 사이의 +는 이어 연결 역할, 숫자끼리는 덧샘
		System.out.println(age);
		System.out.println(height);
		System.out.println(address);
		System.out.println(mobile);
	}
}
