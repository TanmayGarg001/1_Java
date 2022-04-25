package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    ArrayList<Song> songs;
    private String albumName;
    private String albumArtist;

    public Album(String albumName, String albumArtist) {
        this.albumName = albumName;
        this.albumArtist = albumArtist;

        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    //    public Song findSong(String title) {
//        for (int i = 0; i < songs.size(); i++) {
//            if (songs.get(i).getTitle().equals(title)) {
//                return songs.get(i);
//            }
//        }
//        return null;
//    }
    //ALTERNATIVE TO DO THE SAME THING AS ABOVE ITS JUST IN SHORTER VERSION AND EASIER TO READ.

    public Song findSong(String title) {
        for (Song song : songs) {//for each loop
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    //Now we will add two ways for the user to add a song in his/her playlist

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int realIndex = trackNumber - 1;
        if (realIndex >= 0 && realIndex <= this.songs.size()) {
            playList.add(this.songs.get(realIndex));
            return true;
        } else {
            System.out.println("This album does not have a track " + trackNumber);
            return false;
        }
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song tempSong = findSong(title);
        if (tempSong != null) {
            playList.add(tempSong);
            return true;
        }
        System.out.println(title + " does not exist in the album.");
        return false;
    }

}
