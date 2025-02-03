package ububtu.amazonec2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ububtu.amazonec2.domain.Member;
import ububtu.amazonec2.dto.MemberDto;
import ububtu.amazonec2.repository.MemberRepository;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberRepository memberRepository;
    @PostMapping("/members")
    ResponseEntity<String> signUp(
            @RequestBody MemberDto request
    ) {
        Member saveMember = Member.builder().
                email(request.email())
                .password(request.password())
                .build();
        memberRepository.save(saveMember);
        return ResponseEntity.ok("OK!");
    }



}
