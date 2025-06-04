package algorithms;

import java.util.*;

/**
 * Enhanced Towers of Hanoi with ASCII graphics.
 * Prints the rods and disks after each move.
 */
public class TowersOfHanoiAscii {

    // Store the rods as stacks (disks as integers; 1 = smallest)
    private List<Stack<Integer>> rods;
    private int numDisks;
    private static final int NUM_RODS = 3;

    /**
     * Initialize the rods and disks.
     * @param numDisks Number of disks in the puzzle
     */
    public TowersOfHanoiAscii(int numDisks) {
        this.numDisks = numDisks;
        rods = new ArrayList<>(NUM_RODS);
        for (int i = 0; i < NUM_RODS; i++)
            rods.add(new Stack<>());

        // Place disks on first rod (largest on bottom)
        for (int i = numDisks; i >= 1; i--)
            rods.get(0).push(i);
    }

    /**
     * Prints the current state of all rods and disks in ASCII art.
     */
    public void printState() {
        String[] labels = {"A", "B", "C"};
        int rodWidth = numDisks * 2 + 1;

        // Prepare arrays for each level of disks
        StringBuilder[] levels = new StringBuilder[numDisks];
        for (int i = 0; i < numDisks; i++) levels[i] = new StringBuilder();

        // Build each level from bottom up for all rods
        for (int h = numDisks - 1; h >= 0; h--) {
            for (int rod = 0; rod < NUM_RODS; rod++) {
                Stack<Integer> stack = rods.get(rod);
                int diskSize = (stack.size() > h) ? stack.get(h) : 0;

                // Draw disk or rod
                String disk;
                if (diskSize == 0) {
                    int pad = numDisks;
                    disk = " ".repeat(pad) + "|" + " ".repeat(pad);
                } else {
                    int pad = numDisks - diskSize;
                    disk = " ".repeat(pad)
                         + "=".repeat(diskSize)
                         + String.valueOf(diskSize)
                         + "=".repeat(diskSize)
                         + " ".repeat(pad);
                }
                levels[h].append(disk).append("   "); // Space between rods
            }
        }

        // Print all levels
        for (StringBuilder level : levels) System.out.println(level);

        // Print rod base and labels
        String base = "-".repeat(rodWidth);
        for (int rod = 0; rod < NUM_RODS; rod++)
            System.out.print(base + "   ");
        System.out.println();
        for (int rod = 0; rod < NUM_RODS; rod++) {
            int pad = (rodWidth - 1) / 2;
            System.out.print(" ".repeat(pad) + labels[rod] + " ".repeat(pad) + "   ");
        }
        System.out.println("\n");
    }

    /**
     * Solves the Towers of Hanoi recursively, visualizing each move.
     */
    public void solve(int n, int from, int to, int aux) {
        if (n == 1) {
            moveDisk(from, to);
            return;
        }
        solve(n - 1, from, aux, to);
        moveDisk(from, to);
        solve(n - 1, aux, to, from);
    }

    /**
     * Moves the top disk from one rod to another, printing the state.
     */
    private void moveDisk(int from, int to) {
        int disk = rods.get(from).pop();
        rods.get(to).push(disk);
        System.out.printf("Move disk %d from %c to %c%n", disk, (char)('A'+from), (char)('A'+to));
        printState();
        try { Thread.sleep(500); } catch (InterruptedException ignored) {} // Slow down moves
    }

    /**
     * Main method to run the game.
     */
    public static void main(String[] args) {
        int n = 4;
        if (args.length > 0) {
            try { n = Integer.parseInt(args[0]); }
            catch (NumberFormatException ignored) {}
        }
        TowersOfHanoiAscii game = new TowersOfHanoiAscii(n);
        System.out.println("Initial State:");
        game.printState();
        game.solve(n, 0, 2, 1);
        System.out.println("Solved!");
    }
}
