package lab2_ans;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            int input = getInput();          
            String result = binary(input);
            System.out.println(input+" is equivalent to "+result+" in binary");
        }
    }

    public static int getInput() {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        if (input.matches("\\d+")) {
            return Integer.parseInt(input);
        } else {
            return getInput();
        }
    }

    public static String binary(int num) {

        if (num == 1) {
            return String.valueOf(num);
        } else {
            int remainder = num % 2;
            num = num / 2;
            return binary(num) + remainder;
        }
    }
}
