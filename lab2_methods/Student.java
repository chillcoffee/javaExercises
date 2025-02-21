
package lab2_methods;
import java.util.Scanner;

public class Student {
    private float wallet,discount;
    Scanner scan = new Scanner(System.in);

    public Student(float wallet, float discount) {
        this.wallet = wallet;
        this.discount = discount;
    }

    public float getWallet() {
        return wallet;
    }

    public void setWallet(float wallet) {
        this.wallet = wallet;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
    public void getDetails(){
        System.out.println("\nMoney in Wallet: "+String.format("%.2f",wallet));
    }
    
    public void askBaon(){
        System.out.print("Ma, pahingi baon: ");
        this.setWallet(Float.parseFloat(scan.nextLine()));
    }
    
    public void pay(float fare){
        this.wallet -= fare;
    }
    
}
