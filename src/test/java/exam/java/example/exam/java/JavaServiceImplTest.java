package exam.java.example.exam.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class JavaServiceImplTest {
    private JavaServiceImpl javaServ = new JavaServiceImpl();

    Question temp = new Question("Question1", "Answer1");

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void addQuestion() {
        javaServ.addQuestion("QuestionX", "AnswerX");
        Collection<Question> questions =
                javaServ.allQuestion();
        assertEquals(1, questions.size());
    }

    @Test
    public void removeQuestion() {
        Question expected = temp;
        int l1 = javaServ.allQuestion().size();
        Question actual = javaServ.removeQuestion(temp.getQuestion(), temp.getAnswer());
        int l2 = javaServ.allQuestion().size();
        assertEquals(expected, actual);
        assertEquals(l1, l2 + 1);
        assertThrows(BadRequestException.class,
                () -> javaServ.removeQuestion(" - ", " - "),
                "BadRequestException");
    }
}
