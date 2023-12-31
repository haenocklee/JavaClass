package ch11_array.ex9.repository;

import ch11_array.ex9.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();//멤버정보 저장용 리스트

    //이메일 확인용 메서드
    public MemberDTO checkEmail(String memberEmail) {
        MemberDTO result = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                result = memberDTOList.get(i);
            }
        }
        return result;
    }

    //비밀번호 확인용 메서드
    public MemberDTO checkPass(String memberPassword) {
        MemberDTO result = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                result = memberDTOList.get(i);
            }
        }
        return result;
    }

    public MemberDTO saveMember(String memberEmail, String memberPassword, String memberName, String memberMobile) {
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        memberDTOList.add(memberDTO);
        return memberDTO;
    }

    public void memberList() {
        if (memberDTOList.size() > 0) {
            for (int i = 0; i < memberDTOList.size(); i++) {
                System.out.println(memberDTOList.get(i));
            }
        }else{
            System.out.println("가입된 회원이 없습니다.");
        }
    }

    public MemberDTO memberUpate(String loginE, String memberMobile) {
        MemberDTO result = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginE.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.get(i).setMemberMobile(memberMobile);
                result = memberDTOList.get(i);
            }
        }
        return result;
    }

    public boolean memberdelete(String loginE) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginE.equals(memberDTOList.get(i).getMemberEmail())) {
                memberDTOList.remove(i);
                result = true;
            }
        }
        return result;
    }
}
