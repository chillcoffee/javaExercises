package w3_interface;

public class Expense {
    private String expense;
    private float amount;

    public Expense(String expense) {
        this.expense = expense;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
