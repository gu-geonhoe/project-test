package com.example.apitest.Question;


import com.example.apitest.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.StandardEmitterMBean;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private long questionId;
    private String title;
    private String content;
    private String userName;
    private Tag tag;
    private String createAt;



    }
    //작성 시간 createAt

