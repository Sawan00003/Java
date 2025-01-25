


class Question{

    int id;
    String question;
    String opt1;
    String opt2;
    String opt3;
    String opt4;
    String answer;
    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    
  
}

class QuestionService{

    Question[] questions = new Question[5];
    public QuestionService()
    {
        questions[0] = new Question(1,"Size of int","2","6","3","4","2");

    }

    public void displayQuestions()

    {
        System.out.println(questions[0].question);
    }


}


public class Demo1 {

    public static void main(String[] args) {
        
        QuestionService servi = new QuestionService();
        servi.displayQuestions();
    }

    
    
}
