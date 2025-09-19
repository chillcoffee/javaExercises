package lab3_ans;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        convertStringToADT();
    }

    public static void convertStringToADT() {
        Stack<Character> letters = new Stack<Character>();
        System.out.print("Enter a sentence: ");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().trim();
        //System.out.println("The first letter of the sentence is: \n" + sentence.charAt(0));
        //System.out.println("The last letter of the sentence is: \n" + sentence.charAt(sentence.length() - 1));

        //get the letters in the sentence and push into the stack
        for (int i = 0; i < sentence.length(); i++) {
            letters.push(sentence.charAt(i));
        }
        String[] words = sentence.split(" "); //split the sentence into words and put into String array
        System.out.println("The words are: ");
        for(String word: words){
            System.out.println(word);
        }
        char[] lettersArr = sentence.toCharArray(); //convert the String into a char[] array
        //System.out.println(lettersArr[0]);
    }

    public static void regexdemo() {
        String regex = "[0-9]{3,5}";

        String input = "1245896";
        boolean result = input.matches(regex); //compare if the pattern of the regex is seen in the input String
        System.out.println(result);
    }

    private static void demoException() {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);

        try {
            //codes na basi mag error
            int input = Integer.parseInt(scan.nextLine());

        } catch (InputMismatchException e) {
            //codes to handle the exception
            System.out.println("Please enter number in digits.");
            System.out.println("Try again.");
            demoException();
        }
    }

}
