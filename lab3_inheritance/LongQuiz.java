
package lab3_inheritance;

public class LongQuiz extends ShortQuiz{

    public LongQuiz(int items) {
        super(items);
        
    }
    
    public void addEssayScore(int essayPoints){
        super.setScore(super.getScore() +essayPoints);
        super.setItems(super.getItems() + essayPoints);
    }

}
