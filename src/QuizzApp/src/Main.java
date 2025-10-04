import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Questions> questions = new ArrayList<>();
        Quiz quiz = new Quiz();
        try {
            File file = new File("QuestionBank.json");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String [] parts = line.split("\\|");
                List<String> options = new ArrayList<>();
                for(int i=1; i< parts.length-1; i++){
                    options.add(parts[i]);
                }
                questions.add(new Questions(parts[0],options,parts[parts.length-1]));
            }
            sc.close();
            Collections.shuffle(questions);
            quiz.playQuiz(questions,sc);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!!");
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
