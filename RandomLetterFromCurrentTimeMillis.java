
public class RandomLetterFromCurrentTimeMillis {
	public static void main(String[] args) {
		long randomLong = System.currentTimeMillis();
		System.out.println(randomLong);
		char randomChar = (char)(randomLong %26 + 'A');
		System.out.println(randomChar);
	}

}