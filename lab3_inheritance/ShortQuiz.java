
package lab3_inheritance;
import java.util.Scanner;

public class ShortQuiz {
    Scanner scan = new Scanner(System.in);
    private int score, items;

    public ShortQuiz(int items) {        
        this.items = items;
    }
    
    public float calcEquivalent(){
        return (float)score/items * 100;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }
    
    public int askUserScore(){
        System.out.print("Enter your score: ");
        int userScore = Integer.parseInt(scan.nextLine());
        return userScore;
    }
    
}
