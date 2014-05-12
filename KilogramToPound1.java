
public class KilogramToPound1 {
	public static void main(String[] args) {
		// Print titles
		System.out.println("Killogram         Pound");
		
		// Loop 1 kilogram to 199 kilograms
		for (int i = 1; i <= 199; i++) {
			System.out.printf("%-3d", i);
			System.out.printf("%20.1f", (i * 2.2));
			System.out.println();
		}
	
	}

}
