package exam.java.example.exam.java;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "QuestionAlreadyExistException")
public class QuestionAlreadyExistException extends RuntimeException{
    public QuestionAlreadyExistException(String note) {
        super("QuestionAlreadyExistException = " + note);
    }
}
