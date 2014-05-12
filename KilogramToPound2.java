
public class KilogramToPound2 {
	public static void main(String[] args) {
		
		// Print titles
		System.out.println("Killogram         Pound          Killogram                Pound");
		
		// Loop 1 3 5 ... 199 kilograms
		for (int i = 1, j = 20; 1 <= 199 && j <=515; i += 2, j +=5) {
			System.out.printf("%-3d", i);
			System.out.printf("%20.2f", i * 2.2);
			System.out.print("                 ");
			System.out.printf("%-3d", j);
			System.out.printf("%20.2f", j / 2.2);
			System.out.println("");
		}
	}

}
