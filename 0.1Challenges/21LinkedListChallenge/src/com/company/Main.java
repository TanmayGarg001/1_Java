package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static final ArrayList<Album> albumArrayList = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Album album = new Album("Sick2019", "Sick-Kick");
        album.addSong("Bermuda", 4.19);
        album.addSong("Room112", 3.25);
        album.addSong("Casanova", 3.54);
        album.addSong("Purple-Grass", 3.11);
        album.addSong("Bad-Girl", 4.51);
        albumArrayList.add(album);

        Album album1 = new Album("Aero-Chord-TOP", "AeroChord");
        album1.addSong("Surface", 4.55);
        album1.addSong("4U", 3.25);
        album1.addSong("Shadows", 5.15);
        album1.addSong("Drop-It", 2.59);
        album1.addSong("Take me home", 3.47);
        albumArrayList.add(album1);

        LinkedList<Song> playList = new LinkedList<>();
        albumArrayList.get(0).addToPlaylist("Room112", playList);
        albumArrayList.get(0).addToPlayList(3, playList);
        albumArrayList.get(0).addToPlaylist("Often", playList);
        albumArrayList.get(0).addToPlayList(1, playList);
        albumArrayList.get(1).addToPlaylist("Drop-it", playList);
        albumArrayList.get(1).addToPlayList(5, playList);
        albumArrayList.get(1).addToPlayList(1, playList);

        play(playList);

    }

    public static void play(LinkedList<Song> playList) {
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("Playlist has no songs !");
        } else {
            System.out.println("Now playing : " + listIterator.next().toString());
        }
        printMenu();

        while (!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    quit = true;
                    System.out.println("Exiting Application . . .");
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing : " + listIterator.next().toString());
                    } else {
                        System.out.println("End of the playlist reached!");
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing : " + listIterator.previous().toString());
                    } else {
                        System.out.println("Starting of the playlist reached!");
                    }
                    break;
                case 3:
                    printPlaylist(playList);
                    break;
                case 4:
                    printMenu();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("=================================");
        System.out.println("Enter 0: To exit application.");
        System.out.println("Enter 1: To play next song.");
        System.out.println("Enter 2: To play previous song.");
        System.out.println("Enter 3: To see the playlist.");
        System.out.println("Enter 4: To see the instructions.");
        System.out.println("=================================");

    }

    public static void printPlaylist(LinkedList<Song> playList) {
        for (int i = 0; i < playList.size(); i++) {
            System.out.println("#" + i + " = " + playList.get(i).toString());
        }
    }
}

