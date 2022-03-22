package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        PlayList playListObj = new PlayList();
        int i=0;
        while(i<4){
            System.out.println("------------------------------");
            System.out.println("Enter Details of song-"+(i+1));
            System.out.println("Enter song name");
            String song = sc.next();
            System.out.println("Enter its movie name:");
            String movie = sc.next();
            Song songObj = new Song(movie,song);
            playListObj.addSong(songObj);
            i++;

        }
        for(Song s:playListObj.songs){
            s.play();
        }


    }
}
