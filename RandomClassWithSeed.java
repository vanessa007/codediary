import java.util.*;

public class RandomClassWithSeed {
	public static void main(String[] args) {
		Random num = new Random(1000);
		
		for (int i = 0; i < 50; i++) {
			System.out.print(num.nextInt(100) + " ");
		}
	}
}
