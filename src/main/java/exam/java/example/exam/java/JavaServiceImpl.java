package exam.java.example.exam.java;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class JavaServiceImpl implements JavaService {

    private final List<Question> allQuestions = new ArrayList<>();
    {
        allQuestions.add(new Question("Question1", "Answer1"));
        allQuestions.add(new Question("Question2", "Answer2"));
        allQuestions.add(new Question("Question3", "Answer3"));
        allQuestions.add(new Question("Question4", "Answer4"));
        allQuestions.add(new Question("Question5", "Answer5"));
        allQuestions.add(new Question("Question6", "Answer6"));
        allQuestions.add(new Question("Question7", "Answer7"));
        allQuestions.add(new Question("Question8", "Answer8"));
        allQuestions.add(new Question("Question9", "Answer9"));
        allQuestions.add(new Question("Question10", "Answer10"));
        allQuestions.add(new Question("Question11", "Answer11"));
        allQuestions.add(new Question("Question12", "Answer12"));
        allQuestions.add(new Question("Question13", "Answer13"));
        allQuestions.add(new Question("Question14", "Answer14"));
        allQuestions.add(new Question("Question15", "Answer15"));
        allQuestions.add(new Question("Question16", "Answer16"));
        allQuestions.add(new Question("Question17", "Answer17"));
        allQuestions.add(new Question("Question18", "Answer18"));
        allQuestions.add(new Question("Question19", "Answer19"));
        allQuestions.add(new Question("Question20", "Answer20"));
    }

    @Override
    public Question addQuestion(String question, String answer) {
        Question temp = new Question(question, answer);
        if (allQuestions.contains(temp)) {throw new QuestionAlreadyExistException("QuestionAlreadyExistException"); }
        else { allQuestions.add(temp); }
        return temp;
    }

    @Override
    public Question removeQuestion(String question, String answer) {
        Question temp = new Question(question, answer);
        if (allQuestions.contains(temp)) { allQuestions.remove(temp); }
        else {throw new BadRequestException("There are no the same question in allQuestion"); }
        return temp;
    }

    @Override
    public List<Question> allQuestion() {
        return Collections.unmodifiableList(allQuestions);
    }
}
