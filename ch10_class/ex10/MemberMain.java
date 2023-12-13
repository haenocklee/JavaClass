package ch10_class.ex10;

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
        while (run) {
            System.out.println("매뉴");
            System.out.println("1.회원가입");
            System.out.println("2.로그인");
            System.out.println("3.종료");
            System.out.print("매뉴 실행: ");
            int select1 = scanner.nextInt();
            if (select1 == 1) {
                member =new Member();
                System.out.print("회원가입_이메일 입력: ");
                member.setMemberEmail(scanner.next());
                System.out.print("회원가입_비밀번호 입력: ");
                member.setMemberPassword(scanner.next());
                System.out.print("회원가입_성명 입력: ");
                member.setMemberName(scanner.next());
                System.out.print("회원가입_전화번호 입력: ");
                member.setMemberMobile(scanner.next());
                System.out.println("-회원가입 완료-");

//                member = new Member();
//                System.out.print("이메일: ");
//                String memberEmail = scanner.next();
//                System.out.print("비밀번호: ");
//                String memberPassword = scanner.next();
//                System.out.print("이름: ");
//                String memberName = scanner.next();
//                System.out.print("전화번호: ");
//                String memberMobile = scanner.next();
//                member.setMemberEmail(memberEmail);
//                member.setMemberPassword(memberPassword);
//                member.setMemberName(memberName);
//                member.setMemberMobile(memberMobile);

            } else if (select1 == 2) {
                System.out.println("-로그인-");
                System.out.print("이메일 정보를 입력하세요: ");
                String sum1 = scanner.next();
                System.out.print("비밀번호 정보를 입력하세요: ");
                String sum2 = scanner.next();
                boolean loginResult = member.memberLogin(sum1, sum2);
                if (loginResult == true) {
                    System.out.println("-로그인 완료-");
                } else {
                    System.out.println("-로그인 실패-");
                }

//                System.out.print("이메일: ");
//                String memberEmail = scanner.next();
//                System.out.print("비밀번호: ");
//                String memberPassword = scanner.next();
//                boolean loginResult = member.memberLogin(memberEmail, memberPassword);
//                if (loginResult) {
//                    System.out.println("로그인 성공");
//                } else {
//                    System.out.println("로그인 실패");
//                }

            } else if (select1 == 3) {
                System.out.println("종료");
                run = false;
            }
        }
    }
}
