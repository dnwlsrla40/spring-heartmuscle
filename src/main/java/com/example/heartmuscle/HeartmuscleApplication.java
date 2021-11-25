package com.example.heartmuscle;

import com.example.heartmuscle.domain.Category;
import com.example.heartmuscle.domain.Video;
import com.example.heartmuscle.repository.CategoryRepository;
import com.example.heartmuscle.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HeartmuscleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeartmuscleApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(VideoRepository videoRepository, CategoryRepository categoryRepository){
        return args -> {
            Category category = categoryRepository.save(Category.builder()
                    .category("home-training")
                    .lv("3")
                    .build());

            videoRepository.save(Video.builder()
                    .title("NO 층간소음 올인원 운동 - 40분 유산소운동 홈트 - 관절에 무리없이 체지방 태우기")
                    .url("https://www.youtube.com/embed/myNjmnvl6x0")
                    .thumbnail("https://i.ytimg.com/vi/myNjmnvI6x0/hqdefault.jpg")
                    .category(category)
                    .build());
        };
    }
}
