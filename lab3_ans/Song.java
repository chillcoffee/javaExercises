package lab3_ans;

import java.util.LinkedList;
import java.util.Scanner;

public class Song {

    LinkedList<String> songs = new LinkedList<String>();
    LinkedList<String> artists = new LinkedList<String>();
    
    public static void main(String[] args) {
        Song sing = new Song();
        sing.enterSong();
        sing.printSongs();
    }

    public void enterSong() {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a song [x to end]: ");
        String song = s.nextLine();        
        if (song.toLowerCase().charAt(0) != 'x') {
            songs.add(song);
            System.out.print("Enter artist: ");
            artists.add(s.nextLine());
            enterSong();        //recursive call
        }
    }
    
    public void printSongs(){
        System.out.println("\nHere are your songs: ");
        for(int i=0; i < songs.size(); i++){
            System.out.println(songs.get(i)+" by "+artists.get(i));
        }
            
    }
}
