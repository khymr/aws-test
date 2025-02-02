package ububtu.amazonec2.dao;

import ububtu.amazonec2.domain.Member;

import java.util.List;

public interface MemberDao {
    List<Member> getAllMembers();
}