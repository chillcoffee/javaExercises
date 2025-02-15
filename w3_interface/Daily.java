package w3_interface;
import java.util.*;

public class Daily implements AllowanceCalculator{
    Scanner s = new Scanner(System.in);
    private float total = 0;
    private Expense[] expenses;
    private int expense_sz;

    public void getExpenses(){
        System.out.print("Enter how many expenses you spend daily: ");
        expense_sz = Integer.parseInt(s.nextLine());
        expenses = new Expense[expense_sz];
        for(int i=0; i<expense_sz; i++){
            System.out.print("\nEnter expense: ");
            Expense e = new Expense(s.nextLine().trim());
            System.out.print("Enter amount: ");
            e.setAmount(Float.parseFloat(s.nextLine()));
            expenses[i] = e;
        }
    }
    
    public void displayExpense(){
        System.out.println("\n----------------------------------------");
        System.out.println("Here are my "+this.getClass().getSimpleName() +" Expenses: ");
        System.out.println("Expense\t\t\t|Amount");
        for(Expense e: expenses){
            System.out.println(e.getExpense()+"\t\t|"+String.format("%.2f",e.getAmount()));
        }
        System.out.println("----------------------------------------");
        System.out.println("\t\tTOTAL:"+String.format("Php%.2f",total));
    }
    
    @Override
    public void calculateTotal() {
        for(Expense e: expenses){
            total += e.getAmount();
        }
    }
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    
}
