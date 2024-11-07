package exam.java.example.exam.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examServ;
    public ExamController(ExaminerService examServ) { this.examServ = examServ; }

    @GetMapping("/getQuestion/{amount}")
    public Collection<Question> getQuestion(@PathVariable Integer amount) {
        return examServ.getQuestion(amount);
    }
}
