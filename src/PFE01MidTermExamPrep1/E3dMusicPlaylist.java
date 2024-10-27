package PFE01MidTermExamPrep1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E3dMusicPlaylist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine();
            String[] tokens = command.split(" * ");

            switch (tokens[0]) {
                case "Add Song" -> {
                    String song = tokens[1];
                    if (!list.contains(song)) {
                        list.add(song);
                        System.out.println(song + " successfully added");
                    }
                }
                case "Delete Song" -> {
                    int numberOfSongs = Integer.parseInt(tokens[1]);
                    for (int j = 0; j < numberOfSongs - 1; j++) {
                        System.out.println(list.getFirst() + ",  ");
                        list.removeFirst();
                    }
                    System.out.println(list.getFirst() + " deleted");
                    list.removeFirst();
                }
                case "Shuffle Songs" -> {
                    int songIndex1 = Integer.parseInt(tokens[1]);
                    int songIndex2 = Integer.parseInt(tokens[2]);
                    if (songIndex1 >= 0 && songIndex2 >= 0 && songIndex1 < list.size() && songIndex2 < list.size()) {
                        String newFirstSong = list.get(songIndex2);
                        String newSecondSong = list.get(songIndex1);
                        list.set(songIndex1, newSecondSong);
                        list.set(songIndex2, newFirstSong);
                        System.out.println(newFirstSong + " is swapped with " + newSecondSong);
                    }
                }
                case "Insert" -> {
                    String song = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < list.size()) {
                        if (!list.contains(song)) {
                            list.add(index, song);
                            System.out.println(song + " successfully inserted");
                        }
                        else {
                            System.out.println("Song already in the playlist");
                        }
                    }
                    else{
                        System.out.println("Index out of range");
                    }
                }
                case "Sort" -> {
                    Collections.sort(list);
                    Collections.reverse(list);
                }
                case "Play" -> {
                    System.out.println("Songs to play:");
                    for (String song : list) {
                        System.out.println(song);
                    }
                }
            }
        }
    }
}