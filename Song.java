package com.company;

import java.util.Objects;

public class Song implements Comparable<Song>{

    private String movieName;
    private String songName;
    @Override
    public int compareTo(Song o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(movieName, song.movieName) && Objects.equals(songName, song.songName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, songName);
    }

    public Song(String movieName, String songName) {
        this.movieName = movieName;
        this.songName = songName;
    }
    public void play(){
        System.out.println(songName + " of "+movieName+" is playing...!");
    }
}
