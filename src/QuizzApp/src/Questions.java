import java.util.List;

public class Questions {
    private String question;
    private List<String> options;
    private String answer;

    public Questions(String question, List<String> options, String answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getQuestion() {
        return question;
    }
}
