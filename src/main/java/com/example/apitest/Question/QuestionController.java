package com.example.apitest.Question;


import com.example.apitest.Answer.Answer;
import com.example.apitest.Answer.AnswerService;
import com.example.apitest.TotalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {


    QuestionService questionService = new QuestionService();
    TotalService totalService = new TotalService();

    AnswerService answerService = new AnswerService();


    @GetMapping //전체 질문 반환
    public ResponseEntity getQuestions() {
        List<Question> questions = questionService.findQuestions();

        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @GetMapping("/{question-id}") //선택한 질문 조회 아이디 값 같은지 확인 해야함 question-id 값을 유저가 보유하는지 확인, + 답변 및 댓글 정보 같이 반환
    public ResponseEntity getQuestion(@PathVariable("question-id")long questionId){
//  Question response = questionService.findQuestion();
//  return new ResponseEntity<>(response, HttpStatus.OK);

        List<Object> totals = totalService.findTotal(); //createAt 시간 + 작성자 userName

        return new ResponseEntity<>(totals, HttpStatus.OK);
    }


    @PostMapping("/write") //글 작성 페이지에서 글 작성
    public ResponseEntity postQuestion(@RequestBody Question question){
Question response = questionService.createQuestion(question);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PatchMapping("/edit/{question-id}") //글 수정 아이디 값 같은지 확인 해야함 question-id 값을 유저가 보유하는지 확인
    public ResponseEntity patchQuestion(@RequestBody Question question){
        Question response = questionService.createQuestion(question);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{question-id}")  //질문 삭제 아이디 값 같은지 확인 해야함 question-id 값을 유저가 보유하는지 확인

    public String deleteQuestion(){
     return "질문 삭제 미구현";
    }

//    @PostMapping("/{question-id}/{answer-id}}")   //답변 작성
//    public ResponseEntity createAnswer(@RequestBody Answer answer){
//
//        Answer response = answerService.createAnswer(answer);
//        return new ResponseEntity<>(response,HttpStatus.CREATED);
//    }

    @PostMapping("/{question-id}/comment")   //댓글 작성
    public ResponseEntity createComment(@RequestBody Answer answer){

        Answer response = answerService.createAnswer(answer);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PatchMapping("/{question-id}/comment/{comment-id}")  //댓글 수정
public ResponseEntity editComment(@RequestBody Answer answer){
        Answer response = answerService.createAnswer(answer);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{question-id}/comment/{comment-id}")  //댓글 삭제
public void deleteComment(){

    }
}
