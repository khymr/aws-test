package ububtu.amazonec2.dao;

import org.springframework.stereotype.Repository;
import ububtu.amazonec2.domain.Member;

import java.util.Arrays;
import java.util.List;

@Repository
public class FakeMemberDao implements MemberDao {
    @Override
    public List<Member> getAllMembers() {
        return Arrays.asList(
                new Member(1L, "User1"),
                new Member(2L, "User2"),
                new Member(3L, "User3")
        );
    }
}
