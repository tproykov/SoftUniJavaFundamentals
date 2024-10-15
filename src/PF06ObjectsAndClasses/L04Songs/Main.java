package PF06ObjectsAndClasses.L04Songs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String songInfo = scanner.nextLine();

            String[] songsInfoParts = songInfo.split("_");

            String typeList = songsInfoParts[0];
            String name = songsInfoParts[1];
            String time = songsInfoParts[2];

            Song currentSong = new Song();

            currentSong.setTypeList(typeList);
            currentSong.setName(name);
            currentSong.setTime(time);


        }
    }
}