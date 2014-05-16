
public class GenerateTwoDifferentNumbers {
	public static void main(String[] args) {
		
		int firstNum = (int) (Math.random() * 10);
		int secondNum = (int) (Math.random() * 10);
		
		while (secondNum == firstNum) {
			secondNum = (int) (Math.random() * 10);
		}
		
		System.out.print("The number is " + firstNum + secondNum);
	}

}
