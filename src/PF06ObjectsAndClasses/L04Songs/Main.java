package PF06ObjectsAndClasses.L04Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] songsInfo = scanner.nextLine().split("_");

            String typeList = songsInfo[0];
            String name = songsInfo[1];
            String time = songsInfo[2];

            Song currentSong = new Song();

            currentSong.setTypeList(typeList);
            currentSong.setName(name);
            currentSong.setTime(time);

            songs.add(currentSong);


        }

        String typeListShow = scanner.nextLine();

        if (typeListShow.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        }
        else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeListShow)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}