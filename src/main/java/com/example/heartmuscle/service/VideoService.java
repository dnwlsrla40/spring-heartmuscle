package com.example.heartmuscle.service;

import com.example.heartmuscle.domain.Category;
import com.example.heartmuscle.domain.Video;
import com.example.heartmuscle.repository.CategoryRepository;
import com.example.heartmuscle.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VideoService {

    private final VideoRepository videoRepository;
    private final CategoryRepository categoryRepository;

    public List<Video> getCategoryVideos(String category) {
        Category findCategory = categoryRepository.findByCategory(category);
        System.out.println("findCategory : " + findCategory.toString());
        List<Video> allByCategory = videoRepository.findAllByCategory(findCategory);
        for (Video video : allByCategory) {
            System.out.println("findVideo : " + video.toString());
        }
        return allByCategory;
    }
}
