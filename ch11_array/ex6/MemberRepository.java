package ch11_array.ex6;

import ch11_array.ex05.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {

    private static List<MemberDTO> memberDTOList = new ArrayList<>();
//회원가입
//public boolean save(MemberDTO memberDTO) {
//    return memberDTOList.add(memberDTO);
//}
    public boolean join(MemberDTO memberDTO) {
        boolean result = memberDTOList.add(memberDTO);
        return result;
    }
//로그인
//public MemberDTO login(String memberEmail, String memberPassword) {
//    MemberDTO memberDTO = null;
//    for (int i = 0; i < memberDTOList.size(); i++) {
//        if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
//            memberDTO = memberDTOList.get(i);
//        }
//    }
//    return memberDTO;
//}
    public boolean login(String memberEmail, String memberPassword) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                result = true;
            }
        }
        return result;
    }

//목록조회
//public List<MemberDTO> findAll() {
//    return memberDTOList;
//}
    public List<MemberDTO> findAll() {
        return memberDTOList;
    }

    //전화번호 수정
//    public boolean update(String loginEmail, String mobile) {
//        boolean result = false;
//        for (int i = 0; i < memberDTOList.size(); i++) {
//            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
//                memberDTOList.get(i).setMemberMobile(mobile);
//                result = true;
//            }
//        }
//        return result;
//    }
    public void fix(String loginEmail, String memberMobile) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(memberMobile);
                System.out.println("전화번호 변경완료");
            }
        }
    }
//탈퇴

//    public boolean delete(String loginEmail) {
//        boolean result = false;
//        for (int i = 0; i < memberDTOList.size(); i++) {
//            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
//                memberDTOList.remove(i);
//                result = true;
//            }
//        }
//        return result;
//    }
    public boolean cencel(String loginEmail, String memberPassword) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTOList.remove(i);
                System.out.println("회원탈퇴를 완료햇습니다.");
                result = true;
            }else{
                System.out.println("비밀번호를 잘못입력했습니다.");
            }
        }
        return result;
    }

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberEmail.equals(memberDTOList.get(i).getMemberEmail())){
                result = false;
            }
        }
        return result;
    }
}

