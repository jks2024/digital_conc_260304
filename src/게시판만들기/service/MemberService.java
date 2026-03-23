package 게시판만들기.service;

import 게시판만들기.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberService {
    private final List<Member> members;
    public MemberService() {
        members = new ArrayList<>();
    }

    // 회원 가입
    public Member join(String name, String email, String pwd) {
        for (Member member : members) {
            if (member.getEmail().equals(email)) {
                System.out.println("이미 사용 중인 이메일 입니다.");
                return null;
            }
        }

        Member member = new Member(name, email, pwd);
        members.add(member);
        System.out.println("회원가입 완료: " + member);
        return member;
    }
    // 로그인

}
