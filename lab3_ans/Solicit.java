package lab3_ans;

import java.util.LinkedList;
import java.util.Scanner;

public class Solicit {

    LinkedList<String> classmates = new LinkedList<>();
    LinkedList<Float> amount = new LinkedList<>();
    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Solicit solicit = new Solicit();
        System.out.println("Aeamutan para sa bday ni mayor!");
        solicit.askNames();
        solicit.calcTotal();
        solicit.display();
    }

    public void askNames() {
        System.out.println("Sino pa gusto mag-amot? [x kung indi ka]");
        String name = s.nextLine();
        if (name.toLowerCase().charAt(0) != 'x') {
            classmates.add(name);
            askAmount();
        }
    }

    public void askAmount() {
        System.out.print("Amount: Php ");
        float amot = s.nextFloat();
        s.nextLine();
        amount.add(amot);
        askNames();
    }

    public void calcTotal() {
        float total = 0f;
        for (float amot : amount) {
            total += amot;
        }
        System.out.println("May Php " + String.format("%.2f", total) + " pesos kita pambakae it cake! Lesgow!");
    }

    public void display() {
        if (classmates.size() != 0) {
            System.out.println("\nLoyal friends ni Mayor:");
        }
        for (String classmate : classmates) {
            System.out.println(classmate);
        }
    }
}
