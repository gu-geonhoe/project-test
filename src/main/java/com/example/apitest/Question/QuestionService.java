package com.example.apitest.Question;

import com.example.apitest.Tag;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class QuestionService {

    Tag tag = new Tag(1L,"JAVA","자바");
    public Question createQuestion(Question question){
        Question createQuestion = question;
        return createQuestion;
    }

    public Question findQuestion(){
       return new Question(1l,"1번글","1번내용","작성자",tag, LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
    }

    public List<Question> findQuestions(){
return List.of(
        new Question(1L,"1번 글 제목","내용 1 번 입니다","홍길동",tag, LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(2L,"2번 글 제목","내용 2 번 입니다","김코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(3L,"3번 글 제목","내용 3 번 입니다","박코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(4L,"4번 글 제목","내용 4 번 입니다","이코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(5L,"5번 글 제목","내용 5 번 입니다","구코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(6L,"6번 글 제목","내용 6 번 입니다","최코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(7L,"7번 글 제목","내용 7 번 입니다","장코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(8L,"8번 글 제목","내용 8 번 입니다","고코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(9L,"9번 글 제목","내용 9 번 입니다","강코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE)),
        new Question(10L,"10번 글 제목","내용 10 번 입니다","길코딩",tag,LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE))

);
    }
}
