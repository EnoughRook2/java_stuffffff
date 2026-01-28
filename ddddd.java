import java.util.Random;

/**
 * The Die class simulates a six-sided die.
 */
class Die {
    private int sideUp;

    // Constructor: ensures the die has a value as soon as it's created
    public Die() {
        roll();
    }

    // Method to return the current side facing up
    public int getSideUp() {
        return sideUp;
    }

    // Method to set sideUp to a random value between 1 and 6
    public void roll() {
        Random rand = new Random();
        // nextInt(6) returns 0-5, so we add 1 for a 1-6 range
        this.sideUp = rand.nextInt(6) + 1;
    }
}

/**
 * The DieDemo class acts as the driver to test the Die class logic.
 */
public class ddddd {
    public static void main(String[] args) {
        // Step 1: Instantiate two Die objects
        Die die1 = new Die();
        Die die2 = new Die();

        // Step 2: Roll both dice to change their values
        die1.roll();
        die2.roll();

        // Step 3: Retrieve the values using the getter method
        int result1 = die1.getSideUp();
        int result2 = die2.getSideUp();

        // Step 4: Calculate and display the sum
        int totalSum = result1 + result2;

        System.out.println("--- Rolling the Dice ---");
        System.out.println("Die 1: " + result1);
        System.out.println("Die 2: " + result2);
        System.out.println("The sum of both dice is: " + totalSum);
    }
}