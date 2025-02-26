
package lab3_inheritance;

public class QuizCalculator {
    public static void main(String[] args) {
        System.out.println("Quiz 1 - OOP");
        ShortQuiz oop = new ShortQuiz(10);
        oop.setScore(oop.askUserScore());
        float q1_eq = oop.calcEquivalent();
        System.out.println("Equivalent: "+q1_eq);
        
        System.out.println("\nQuiz 2 - Methods");
        LongQuiz methods = new LongQuiz(20);
        methods.setScore(methods.askUserScore());
        methods.addEssayScore(5);
        float q2_eq = methods.calcEquivalent();
        System.out.println("Equivalent: "+q2_eq);
                
        float total_eq = (q1_eq + q2_eq) / 200 * 0.20f * 100;
        System.out.println("Total Points for Quiz: "+total_eq);
        System.out.println("\nOutput for Additional Points");
        ShortQuiz[] quizzes = new ShortQuiz[2];
        quizzes[0] = (ShortQuiz) oop;
        quizzes[1] = methods;
        int i = 1;
        for(ShortQuiz q: quizzes){
            System.out.println("Q"+i++ +": "+q.getScore()+" / "+q.getItems()+" = "+q.calcEquivalent());          
        }
        
        System.out.println("//MANIPULATE ARRAY TO GET SUMMATION OF EQUIVALENTS");
    }
    
}
