package com.example.heartmuscle.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String category;

    private String lv;

    private String part;

    @Builder
    public Category(String category, String lv, String part) {
        this.category = category;
        this.lv = lv;
        this.part = part;
    }
}
