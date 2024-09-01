package PF02DataTypesAndVariables;

import java.util.Scanner;

public class M05DecryptingMessages {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String message = "";
        for (int i = 0; i < n; i++) {

            char character = scanner.nextLine().charAt(0);
            char processedCharacter = (char) (character + key);
            message += processedCharacter;
        }
        System.out.println(message);
    }
}

// You will receive a key (integer) and n characters afterward. Add the key to each character and append them to the message. In the end, print the message, which you decrypted.
//Input
//•	On the first line, you will receive the key.
//•	On the second line, you will receive n – the number of lines that will follow.
//•	On the next n lines – you will receive lower and uppercase characters from the Latin alphabet.
//Output
//Print the decrypted message.
//Constraints
//•	The key will be in the interval [0…20].
//•	n will be in the interval [1…20].
//•	The characters will always be upper or lower-case letters from the English alphabet.
//•	You will receive one letter per line.
