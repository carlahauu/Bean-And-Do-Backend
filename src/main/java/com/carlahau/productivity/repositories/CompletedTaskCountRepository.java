package com.carlahau.productivity.repositories;

import com.carlahau.productivity.domain.entities.CompletedTaskCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompletedTaskCountRepository extends JpaRepository<CompletedTaskCount, Integer> {}
