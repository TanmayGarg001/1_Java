package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private ArrayList<Song> songs;
    private String name;
    private String artist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int realIndex = trackNumber - 1;
        if (realIndex >= 0 && realIndex <= songs.size()) {
            playList.add(songs.get(realIndex));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song tempSong = findSong(title);
        if (tempSong != null) {
            playList.add(tempSong);
            return true;
        }
        return false;
    }


}
