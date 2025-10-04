import java.util.List;
import java.util.Scanner;

public class Quiz {
    public void playQuiz(List<Questions> questionsList, Scanner sc){
        int score = 0;
        boolean wantToPlay = true;
        int i=0;
        int choice=1;
        do {
            if(i>questionsList.size()-10){
                System.out.println("Sorry Please Restart the Quiz");
                break;
            }
            score=0;
            int end=i+10;
            for(; i<end; i++){

                Questions q = questionsList.get(i);
                System.out.println("---------------------------");
                System.out.println(q.getQuestion());
                System.out.println("The options are :");
                for(int j=0; j<q.getOptions().size(); j++)
                    System.out.println(q.getOptions().get(j));
                System.out.println("Enter your answer : ");
                String ans = sc.nextLine();
                System.out.println("---------------------------");
                if(ans.equalsIgnoreCase(q.getAnswer())){
                    score++;
                }
            }
            System.out.println("Your Score was : "+score);

            System.out.println("Do you want to play again?\n Press 1 for another round or any other key to exit");
           try {
                 choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
               throw new RuntimeException(e);
           }
            if(choice != 1){
                wantToPlay = false;
            }
        }while(wantToPlay);
        sc.close();
    }
}
