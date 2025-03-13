package mod4_filehandling;

import java.nio.file.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;

public class PathDemo2{

    public static void main(String[] args) {
        Path filePath = Paths.get("E:\\Ruffa\\Files\\namess.txt");
        System.out.println("Path is " + filePath.toString());
        try {
            filePath.getFileSystem().provider().checkAccess(filePath);
            if(Files.exists(filePath)){
                System.out.println("File exists");
            }else
                throw new IOException();
            System.out.println("File can be read and executed");
        } catch (IOException e) {
            System.out.println("File cannot be used for this application");
           
        }
    }
}
