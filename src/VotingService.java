import java.util.*;
public class VotingService {
    List<Question> qList = new LinkedList<Question>();
    Map<String, Boolean> studentAnswers = new HashMap<String, Boolean>();
    public void createQuestion(int questionType){
        if(questionType == 0){
            qList.add(new SingleQuestion());
        }
        else if (questionType == 1) {
            qList.add(new MultipleQuestion());
        }
    }
    public void studentAnswer(){

    }
}
