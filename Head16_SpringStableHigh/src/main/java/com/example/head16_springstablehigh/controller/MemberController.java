package com.example.head16_springstablehigh.controller;

import com.example.head16_springstablehigh.entity.Member;
import com.example.head16_springstablehigh.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

  private final MemberRepository memberRepository;

  @PostMapping
  public Member create(@RequestParam String name) {
    return memberRepository.save(
        Member.builder()
            .name(name)
            .build()
    );
  }

  @GetMapping("/count")
  public long count() {
    return memberRepository.count();
  }
}
