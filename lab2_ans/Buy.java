
package lab2_ans;

import java.util.Scanner;


public class Buy {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        float total = buy('y',0.0f); 
        System.out.println("\nYour total amount due is: Php"+String.format("%.2f", total));
    }
    
    public static float buy(char end, float subtotal){
        float total = subtotal;
        if(end == 'x'){
            return total;
        }else{
            System.out.print("\nEnter product name: ");
            String product = scan.nextLine();
            System.out.print("Enter "+product+"'s price: ");
            float price = scan.nextFloat(); scan.nextLine();
            System.out.print("Do you want to continue? [x/y]: ");
            end = scan.next().charAt(0); scan.nextLine();
            total += price;
            return buy(end, total);
        }
    }
}
