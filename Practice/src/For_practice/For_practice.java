//Practice with For Loops
package For_practice;

public class For_practice {
	public static void main(String[] args) {
		int i = 0;
		int j = 10;
		
		System.out.println("Before loop, variables are: ");
		System.out.println("i is: " + i);
		System.out.println("j is: " + j);
		System.out.println("\n");
		
		for (i = 3; i < 5; ++i) {
			System.out.println("Variable inside loop");
			System.out.println("i is: " + i);
			System.out.println("j is: " + j);
			System.out.println("\n");
		}
		
		System.out.println("Variables after loop");
		System.out.println("i is: " + i);
		System.out.println("j is: " + j);
		System.out.println("\n");
		
	}
}