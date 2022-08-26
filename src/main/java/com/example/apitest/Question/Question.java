package com.example.apitest.Question;


import com.example.apitest.Tag.Tag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

