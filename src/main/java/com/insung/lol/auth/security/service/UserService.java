package com.insung.lol.auth.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.insung.lol.member.domain.Member;
import com.insung.lol.member.repository.MemberRepository;

@Service
public class UserService {

	@Autowired
	MemberRepository memberRepository;

	public Member getUserInfo(String memberId) throws UsernameNotFoundException {
		Member member = memberRepository.findById(memberId)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with userId: " + memberId));

		return member;
	}
}
