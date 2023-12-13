package ch00_Mainclass.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        /**
         * 메뉴
         * 1. 회원가입(기본생성자이용)
         *      회원가입 정보는 스캐너로 받음.
         * 2. 로그인
         * 3. 종료
         */
        Scanner scanner = new Scanner(System.in);
        Member member = null;
        boolean run = true;
        while(run){
            System.out.println("[매뉴]");
            System.out.println("[ 1.회원가입 | 2.로그인 | 3. 종료 ]");
            System.out.print("선택> ");
            int select = scanner.nextInt();

            if (select == 1) {
                member = new Member();
                System.out.println("[회원가입]");
                System.out.print("이메일: ");
                String memberEmail = scanner.next();
                System.out.print("비밀번호: ");
                String memberPassword = scanner.next();
                System.out.print("이름: ");
                String mamemberName = scanner.next();
                System.out.print("전화번호: ");
                String memberMobile = scanner.next();
                member.setMemberEmail(memberEmail);
                member.setMemberPassword(memberPassword);
                member.setMemberName(mamemberName);
                member.setMemberMobile(memberMobile);
            } else if (select == 2) {
                System.out.println("[로그인]");
                System.out.print("이메일: ");
                String loginMemberEmail = scanner.next();
                System.out.print("비밀번호: ");
                String loginMemberPassword = scanner.next();
                boolean loginResult = member.memberLogin(loginMemberEmail,loginMemberPassword);
                if(loginResult == true){
                    System.out.println("로그인 완료");
                }else{
                    System.out.println("로그인 실패");
                }

            } else if (select == 3) {
                System.out.println("[종료]");
                run = false;
            }
        }
    }
}
