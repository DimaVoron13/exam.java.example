package exam.java.example.exam.java;

import java.util.Collection;

public interface JavaService {
    Question addQuestion(String question, String answer);
    Question removeQuestion(String question, String answer);
    Collection<Question> allQuestion();
}
