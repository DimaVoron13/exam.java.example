package exam.java.example.exam.java;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "BadRequestException")
public class BadRequestException extends RuntimeException {
    public BadRequestException(String note) {
        super("BadRequestException = " + note);
    }
}
