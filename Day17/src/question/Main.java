package question;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		   PlayList playList = new PlayList();
		
		   try (Scanner scanner = new Scanner(System.in)) {
			int count = 1;

	        while(count <= 4) {
	            System.out.println("Enter details of Song " + count + ":");

	            System.out.print("Movie name: ");
	            String movie = scanner.next();

	            System.out.print("Song name: ");
	            String song = scanner.next();

	            playList.addSong(new Song(movie, song));

	            //Asking the user to re-enter details of the song if the song was already in the playlist
	            if(playList.songs.size() != count) {
	                System.out.println("Please re-enter details of Song " + count + "\n");
	                continue;
	            }

	            System.out.println();
	            count++;
	        }
		}

	        for(Song song: playList.songs) {
            song.play();
        }
	}
	
}
