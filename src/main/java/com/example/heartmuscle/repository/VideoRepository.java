package com.example.heartmuscle.repository;

import com.example.heartmuscle.domain.Category;
import com.example.heartmuscle.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {

    List<Video> findAllByCategory(Category category);
}
