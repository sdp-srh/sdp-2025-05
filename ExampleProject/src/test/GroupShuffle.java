package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GroupShuffle {
    public static void main(String[] args) {
        // Create a list of characters A to D
        List<Character> letters = Arrays.asList('A', 'B', 'C', 'D');
        
        // Shuffle the list
        Collections.shuffle(letters);
        
        // Print the shuffled result
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }
}
