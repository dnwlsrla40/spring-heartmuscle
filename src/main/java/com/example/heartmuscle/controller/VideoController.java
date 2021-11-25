package com.example.heartmuscle.controller;

import com.example.heartmuscle.domain.Video;
import com.example.heartmuscle.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class VideoController {

    private final VideoService videoService;

    @GetMapping("/video/{category}")
    public List<Video> getCategoryVideos(@PathVariable String category) {
        List<Video> categoryVideos = videoService.getCategoryVideos(category);
        for (Video categoryVideo : categoryVideos) {
            System.out.println("controller findVideos : " + categoryVideo.toString());
        }
        return categoryVideos;
    }

}
