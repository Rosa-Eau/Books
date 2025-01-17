package com.sparta.book.service;

import com.sparta.book.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByPhoneNumber(String phoneNumber);
}