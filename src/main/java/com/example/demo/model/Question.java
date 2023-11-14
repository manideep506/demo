package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle;
    @Column(name = "\"option 1\"")
    private String option1;
    @Column(name = "\"option 2\"")
    private String option2;
    @Column(name = "\"option 3\"")
    private String option3;
    @Column(name = "\"option 4\"")
    private String option4;
    private String answer;
    private String difficultyLevel;
    private String category;
}




