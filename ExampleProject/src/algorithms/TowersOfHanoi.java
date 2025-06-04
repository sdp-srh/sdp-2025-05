package algorithms;

/**
 * Towers of Hanoi solver in Java.
 * Demonstrates recursive problem-solving.
 */
public class TowersOfHanoi {

    /**
     * Solves the Towers of Hanoi puzzle and prints the moves.
     *
     * @param n      Number of disks to move.
     * @param from   The starting rod.
     * @param to     The target rod.
     * @param aux    The auxiliary rod.
     */
    public static void solve(int n, char from, char to, char aux) {
        // Base case: only one disk, just move it
        if (n == 1) {
            System.out.printf("Move disk 1 from %c to %c%n", from, to);
            return;
        }
        // Move n-1 disks from source to auxiliary, using target as buffer
        solve(n - 1, from, aux, to);
        // Move the largest disk to target
        System.out.printf("Move disk %d from %c to %c%n", n, from, to);
        // Move the n-1 disks from auxiliary to target, using source as buffer
        solve(n - 1, aux, to, from);
    }

    /**
     * Entry point for the Towers of Hanoi program.
     * Accepts a number of disks as argument or uses default.
     */
    public static void main(String[] args) {
        int numberOfDisks = 3; // Default value
        // If the user provided an argument, parse it
        if (args.length > 0) {
            try {
                numberOfDisks = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Using default (3 disks).");
            }
        }
        System.out.printf("Solving Towers of Hanoi for %d disks:%n%n", numberOfDisks);
        // A, B, C represent the three rods
        solve(numberOfDisks, 'A', 'C', 'B');
    }
}
