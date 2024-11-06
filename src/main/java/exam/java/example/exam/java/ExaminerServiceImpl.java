package exam.java.example.exam.java;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final JavaServiceImpl serv;
    public ExaminerServiceImpl(JavaServiceImpl serv) { this.serv = serv; }
    private final Set<Question> examQuestion = new HashSet<>();

    @Override
    public Set<Question> getQuestion(int amount) {
        examQuestion.clear();
        List<Question> allQestion = serv.allQuestion();//new ArrayList<>();
        if (amount < 1 || amount > serv.allQuestion().size()) {
            throw new InvalidNumberException("IllegalNumbException");
        }
        int i = 0;
        while (i < amount) {
            examQuestion.add(allQestion.get(random(allQestion.size())));
            i = examQuestion.size();
        }
        return Collections.unmodifiableSet(examQuestion);
    }
    public int random(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
