
public class CountRandomIntBetweenZeroAndNine {
	public static void main(String[] args) {
		int[] myArray = new int[100];
		
		for (int i = 0; i < 100; i++) {
			myArray[i] = (int) (Math.random() * 10);
		}
		
		// Create an array to record how many times does one integer occur
		int[] count = new int[10];
		
		for (int i = 0; i < 100; i++) {
			count[myArray[i]]++;
		}
		
		System.out.println("Number    Time");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "         " + count[i]);
		}
	}

}
