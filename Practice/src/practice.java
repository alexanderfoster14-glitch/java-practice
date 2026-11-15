
public class practice {
	public static void countdown(int number) {
		for (int i = 1; i <= number;) {
			System.out.println(number);
			number--;
		}
		return;
	}
	
	public static void main(String[] args) {
		countdown(2147483647);
	}
}