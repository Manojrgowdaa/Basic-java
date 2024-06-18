import java.util.Random;

public class case3 {

    // Method to generate and return a random number between 0 and 99
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100); // Generates a random integer between 0 (inclusive) and 100 (exclusive)
    }

    // Main method to demonstrate the usage of getRandomNumber method
    public static void main(String[] args) {
        // Generate and print a random number
        int randomNumber = getRandomNumber();
        System.out.println("Random Number: " + randomNumber);
    }
}
// Functions with No Parameters and Return Value
//These functions do not take any parameters but return a value based on their internal logic.