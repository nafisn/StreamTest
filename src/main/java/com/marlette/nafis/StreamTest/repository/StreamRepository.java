package com.marlette.nafis.StreamTest.repository;

import com.marlette.nafis.StreamTest.model.StreamEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends JpaRepository <StreamEvent, Long> {
}
