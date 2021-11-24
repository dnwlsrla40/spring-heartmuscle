package com.example.heartmuscle.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
