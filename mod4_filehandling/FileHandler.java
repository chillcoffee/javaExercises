package mod4_filehandling;
import java.io.*;
import java.util.ArrayList;

import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        
        File file = new File("E:\\Ruffa\\Files\\names.txt");
        ArrayList<String> perLine = new ArrayList<>();
        System.out.println(perLine);
        try{
            Scanner file_scanner = new Scanner(file); //reading the file
            while(file_scanner.hasNext()) {
                String data = file_scanner.nextLine();
                perLine.add(data); //add per line to arrayList
                System.out.println(data);
            }
            System.out.println("\n-----------------------------------\n"+perLine);
             int maxscore = 0;
            for(String line: perLine){
                System.out.println(line);
                String[] data = line.split(" ");
                System.out.println("data[0]: "+data[0]);
                System.out.println("data[1]: "+data[1]+"\n");
                int scoredata = Integer.parseInt(data[1]); //convert String array element to integer
                if(scoredata > maxscore){ // checking if highscore
                    maxscore = scoredata;
                }
   
            }
            System.out.println("Highest is: "+maxscore);
            file_scanner.close();
           
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        //gasulat papunta sa file
        //File file = new File("E:\\Ruffa\\Files\\names.txt");
        try{
            FileWriter filewriter = new FileWriter(file);
            filewriter.write("\nRuffa\nResentes\nJuan\nReyes\nDONE WRITING!");
            filewriter.close();
        }catch(IOException e){
            System.out.println("Unable to write.");
        }
    }
}
