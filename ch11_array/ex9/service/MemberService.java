package ch11_array.ex9.service;

import ch11_array.ex9.common.CommonVariables;
import ch11_array.ex9.dto.MemberDTO;
import ch11_array.ex9.repository.BoardRepository;
import ch11_array.ex9.repository.MemberRepository;

import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();

    //회원가입
    public void saveMember() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        MemberDTO clearEmail = memberRepository.checkEmail(memberEmail);
        if (clearEmail != null) {
            System.out.println("이미 등록된이메일 입니다.");
            System.out.println("다시입력해주세요.");
            saveMember();
        }else{
            System.out.print("비밀번호: ");
            String memberPassword = scanner.next();
            System.out.print("이름: ");
            String memberName = scanner.next();
            System.out.print("전화번호: ");
            String memberMobile = scanner.next();
            MemberDTO savedMember = memberRepository.saveMember(memberEmail, memberPassword, memberName, memberMobile);
            if (savedMember != null) {
                System.out.println("회원가입완료");
                System.out.println("savedMember = " + savedMember);
            }
        }
    }

    //로그인
    public void login() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        MemberDTO clearEmail = memberRepository.checkEmail(memberEmail);
        if (clearEmail != null) {
            System.out.print("비밀번호: ");
            String memberPassword = scanner.next();
            MemberDTO clearPass = memberRepository.checkPass(memberPassword);
            if (clearPass != null) {
                CommonVariables.loginEmail=memberEmail;
                System.out.println("로그인 성공!");
                System.out.println(memberEmail + " 님 환영합니다");
            } else {
                System.out.println("입력된 정보가 틀립니다.");
            }
        } else {
            System.out.println("없는 이메일 입니다");
        }
    }

    //회원목록
    public void memberList() {
        memberRepository.memberList();
    }

    //회원수정
    public void memberUpate() {
        if (CommonVariables.loginEmail != null) {
            String loginE = CommonVariables.loginEmail;
            System.out.print("수정할 전화번호를 입력해주세요: ");
            String memberMobile = scanner.next();
            MemberDTO result = memberRepository.memberUpate(loginE, memberMobile);
            System.out.println("회원정보가 수정되었습니다.");
            System.out.println("result = " + result);
        } else {
            System.out.println("로그인을 하셔야합니다");
        }
    }

    //회원탈퇴
    public void memberdelete() {
        String loginEmail = CommonVariables.loginEmail;
        System.out.println(loginEmail + "님 계정을 삭제하시겠습니까?");
        if (CommonVariables.loginEmail != null) {
            System.out.print("삭제를 원하시면 비밀번호를 입력하세요: ");
            String pass = scanner.next();
            MemberDTO memberDTO = memberRepository.checkPass(pass);
            if(memberDTO != null){
                boolean result = memberRepository.memberdelete(loginEmail);
                if(result) {
                    System.out.println("회원정보가 삭제되었습니다");
                    CommonVariables.loginEmail = null;
                    System.out.println("로그인정보: "+CommonVariables.loginEmail);
                }else{
                    System.out.println("입력된 정보가 틀립니다.");
                }
            }
        } else {
            System.out.println("로그인을 하셔야합니다");
            login();
        }
    }

    //로그아웃
    public void logout() {
        CommonVariables.loginEmail = null;
        System.out.println("로그아웃 완료");
    }
}

