package com.example.heartmuscle.repository;

import com.example.heartmuscle.domain.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {
}
