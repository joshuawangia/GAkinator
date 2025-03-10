import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        Guess testGuess = new Guess();
        QNA myQna = new QNA();

        while (testGuess.getLength() != 1) {
            int nextQuestion = testGuess.getNextQuestion();
            System.out.println(myQna.askQuestion(nextQuestion));

            // String answers
            if (nextQuestion < 5 && nextQuestion % 3 != 0) {
                testGuess.removeTeachers(myQna.Sanswer(nextQuestion, myScanner.nextLine()));
            } 
            // Boolean Answers
            else {
                testGuess.removeTeachers(myQna.Banswer(nextQuestion, Boolean.parseBoolean(myScanner.nextLine())));
            }
        }

        myScanner.close();
        System.out.println(testGuess.guessTeacher());
    }
}
