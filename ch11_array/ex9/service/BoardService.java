package ch11_array.ex9.service;

import ch11_array.ex9.dto.MemberDTO;
import ch11_array.ex9.repository.BoardRepository;
import ch11_array.ex9.repository.MemberRepository;

import java.util.Scanner;

public class BoardService {
    Scanner scanner = new Scanner(System.in);
    BoardRepository boardRepository = new BoardRepository();
    MemberRepository memberRepository = new MemberRepository();
    public void saveMember() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        MemberDTO clearEmail = memberRepository.checkEmail(memberEmail);
        if(clearEmail != null){
            System.out.println("이미 등록된이메일 입니다.");
            System.out.println("다시입력해주세요.");
            saveMember();
        }
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO savedMember = memberRepository.saveMember(memberEmail,memberPassword,memberName,memberMobile);
        if (savedMember != null){
            System.out.println("회원가입완료");
            System.out.println("savedMember = " + savedMember);
        }
    }

    public void login() {
    }
}
