package ububtu.amazonec2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ububtu.amazonec2.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
