package test;

import java.util.*;

public class ShuffleLettersAD {
    public static void main(String[] args) {
        // Create a list of characters A-D
        List<Character> letters = Arrays.asList('A', 'B', 'C', 'D');

        // Shuffle the letters
        Collections.shuffle(letters);

        // Print the shuffled list
        System.out.println("Shuffled Letters:");
        for (char c : letters) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
