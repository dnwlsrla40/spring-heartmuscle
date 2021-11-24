package com.example.heartmuscle.repository;

import com.example.heartmuscle.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
