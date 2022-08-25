package com.example.apitest.Question;


import com.example.apitest.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.StandardEmitterMBean;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

    }
    //작성 시간 createAt

