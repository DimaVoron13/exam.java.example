package exam.java.example.exam.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        Question expected = temp;
        Question actual = javaServ.addQuestion(temp.getQuestion(), temp.getAnswer());
        assertEquals(expected, actual);
        assertThrows(QuestionAlreadyExistException.class,
                () -> javaServ.addQuestion("Question1", "Answer1"),
                "QuestionAlreadyExistException");
    }
    @Test
    public void removeQuestion() {
        Question expected = temp;
        javaServ.addQuestion(temp.getQuestion(), temp.getAnswer());
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
