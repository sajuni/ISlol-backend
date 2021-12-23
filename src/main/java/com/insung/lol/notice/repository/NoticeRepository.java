package com.insung.lol.notice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insung.lol.notice.domain.Notice;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long>{

	Page<Notice> findAll(Pageable pageable);
	
}
