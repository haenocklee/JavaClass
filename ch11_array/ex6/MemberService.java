package ch11_array.ex6;

import ch11_array.ex05.BookDTO;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    private static String loginEmail = null;
//회원가입
//    public void save() {
//        System.out.print("이메일: ");
//        String memberEmail = scanner.next();
//        System.out.print("비밀번호: ");
//        String memberPassword = scanner.next();
//        System.out.print("이름: ");
//        String memberName = scanner.next();
//        System.out.print("전화번호: ");
//        String memberMobile = scanner.next();
//        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
//        boolean result = memberRepository.save(memberDTO);
//        if (result) {
//            System.out.println("회원가입 성공");
//        } else {
//            System.out.println("회원가입 실패");
//        }
//    }
    public void join() {
        //회원가입 이메일(memberEmail), 비밀번호(memberPassword), 이름(memberName), 전화번호(memberMobile) 입력
        //중복체크결과를 담을 변수
        boolean checkResult = false;
        String memberEmail = null;
        do{
            System.out.print("이메일 : ");
            memberEmail = scanner.next();
            checkResult = memberRepository.emailCheck(memberEmail);
            if(checkResult){
                System.out.println("사용 가능한 이메일 입니다");
            }else{
                System.out.println("이미 사용중인 이메일 입니다.");
            }
        } while (!checkResult);

        System.out.print("비밀번호 : ");
        String memberPassword = scanner.next();
        System.out.print("이름 : ");
        String memberName = scanner.next();
        System.out.print("전화번호 : ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail,memberPassword,memberName,memberMobile);
        boolean result = memberRepository.join(memberDTO);
        if(result == true) {
            System.out.println("등록성공");
        }else{
            System.out.println("등록실패");
        }

    }

    // 로그인
//    public void login() {
//        System.out.print("이메일: ");
//        String memberEmail = scanner.next();
//        System.out.print("비밀번호: ");
//        String memberPassword = scanner.next();
//        MemberDTO loginResult = memberRepository.login(memberEmail, memberPassword);
//        if (loginResult != null) {
//            System.out.println("로그인 성공");
//            System.out.println(memberEmail + "님 환영합니다!");
//            loginEmail = memberEmail;
//        } else {
//            System.out.println("이메일 또는 비밀번호가 틀립니다!");
//        }
//    }
    public void login() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호 : ");
        String memberPassword = scanner.next();
        boolean result = memberRepository.login(memberEmail, memberPassword);
        if(result == true){
            loginEmail = memberEmail;
            System.out.println("로그인 성공");
            System.out.println("이메일: " + loginEmail);
        }else{
            System.out.println("로그인 실패");
        }
    }

//    public void findAll() {
//        List<MemberDTO> memberDTOList = memberRepository.findAll();
//        for (MemberDTO memberDTO: memberDTOList) {
//            System.out.println("memberDTO = " + memberDTO);
//        }
//    }
    public void findAll() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }

//    public void update() {
//        if (loginEmail != null) {
//            System.out.print("수정할 전화번호: ");
//            String mobile = scanner.next();
//            boolean result = memberRepository.update(loginEmail, mobile);
//            if (result) {
//                System.out.println("회원정보가 수정되었습니다.");
//            } else {
//                System.out.println("수정 실패!");
//            }
//        } else {
//            System.out.println("로그인 해주세요!");
//        }
//    }
    public void fix() {
        if(loginEmail != null){
            System.out.print("변경할 전화번호 입력: ");
            String memberMobile = scanner.next();
            memberRepository.fix(loginEmail,memberMobile);
        }else{
            System.out.println("로그인을 하세요");
        }
    }

//    public void delete() {
//        if (loginEmail != null) {
//            System.out.println("진짜 탈퇴하실 건가요?");
//            System.out.print("비밀번호: ");
//            String memberPassword = scanner.next();
//            MemberDTO memberDTO = memberRepository.login(loginEmail, memberPassword);
//            if (memberDTO != null) {
//                boolean result = memberRepository.delete(loginEmail);
//                if (result) {
//                    System.out.println("회원탈퇴가 정상적으로 처리되었습니다! 그동안 감사했습니다!");
//                } else {
//                    System.out.println("탈퇴가 처리되지 않았습니다! 다시 시도해 주시기 바랍니다!");
//                }
//            } else {
//                System.out.println("비밀번호가 일치하지 않습니다! 메인메뉴로 돌아갑니다!");
//            }
//        } else {
//            System.out.println("로그인 해주세요!");
//        }
//    }
    public void cancel() {
        if(loginEmail != null){
            System.out.print("비밀번호를 입력: ");
            String memberPassword = scanner.next();
            boolean result = memberRepository.cencel(loginEmail,memberPassword);
            if(result){
                loginEmail = null;
            }
        }else{
            System.out.println("로그인을 하세요");
        }
    }

    public void logout() {
        loginEmail = null;
        System.out.println("로그아웃 되었습니다.");
    }
}

