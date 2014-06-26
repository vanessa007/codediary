import java.util.*;

public class DisplayPrimeFactors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = input.nextInt();
		ArrayList<Integer> prime = new ArrayList<Integer>();

		int factor = 2;
		
		while (factor <= num) {
			if (num % factor == 0) {
				num = num / factor;
				prime.add(factor);
			} else {
				factor++;
			}
		}
		
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 0; i < prime.size(); i++) {
			stack.push(prime.get(i));
		}
		
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	
	
}
