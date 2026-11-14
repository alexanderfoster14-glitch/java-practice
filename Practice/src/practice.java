import java.util.Random;

public class practice {
	public static int rollDie(int attempts) {
		Random rand = new Random();
		int roll = rand.nextInt(6) + 1;
		System.out.println("You rolled: " + roll);
		
		// Base case 1: Rolled a 6
		if (roll == 6) {
			System.out.println("You win!");
			return roll;
	    }
		
		// Base case 2: Reached maximum attempts
		if (attempts >= 10) {
			System.out.println("Maximum attempts reached!");
			return roll;
		}
		
		// Recursive case
		return rollDie(attempts + 1);
	}
	
	public static void main(String[] args) {
		rollDie(1);
	}
}