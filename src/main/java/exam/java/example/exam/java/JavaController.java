package exam.java.example.exam.java;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaController {
    private final JavaService javaServ;
    public JavaController(JavaService javaServ) { this.javaServ = javaServ; }

    @GetMapping("/java/add")
    public Question addQuestion(@RequestParam("question") String question,
                                @RequestParam("answer") String answer) {
        return javaServ.addQuestion(question, answer);
    }
    @GetMapping("/java/remove")
    public void removeQuestion(@RequestParam("question") String question,
                               @RequestParam("answer") String answer) {
        javaServ.removeQuestion(question, answer);
    }

    @GetMapping("/java")
    public Collection allQuestions() {
        return javaServ.allQuestion();
    }
}
