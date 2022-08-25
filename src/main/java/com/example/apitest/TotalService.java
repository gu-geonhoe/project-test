package com.example.apitest;

import com.example.apitest.Question.Question;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TotalService {

    Tag tag = new Tag(1L,"JAVA","자바");
    public List<Object> findTotal(){
        return List.of(
                new Question(1L,"1번 글 제목","내용 1 번 입니다","작성자",tag, LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
                new Answer(1L,"1번 글 답글"),
                new Comment(1L,"1번 글 댓글")
        );
    }
}
