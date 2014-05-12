// Print ! to ~ according to ASCII code
public class PrintASCII {
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 33; i <= 126; i++) {
			char c = (char) i;
			System.out.print(c + " ");
			count++;
			if (count % 10 == 0) {
				System.out.println("");
			}
		}

	}
}
