package exam.java.example.exam.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    Set<Question> questionForTest = Set.of(new Question("Question1", "Answer1"));

    @Mock
    private ExaminerService examServ;

    @InjectMocks
    private JavaServiceImpl javaServ;

    @Test
    public void getQuestion() {
        when(examServ.getQuestion(1)).thenReturn(questionForTest);
        Set<Question> expected = Set.of(new Question("Question1", "Answer1"));
        Set<Question> actual = examServ.getQuestion(1);
        assertEquals(actual, expected);
        verify(examServ, times(1)).getQuestion(1);
    }
}
