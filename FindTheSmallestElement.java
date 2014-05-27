
public class FindTheSmallestElement {
	public static void main(String[] args) {
		
		int[] myArray = {5, 10, 20, 14, 7, 6, 30, 1, 12, 39};
		System.out.println("The index of the smallest element is: " + smallestElement(myArray));
	}
	
	public static int smallestElement(int[] list) {
		
		int index = 0;
		boolean[] isSmallest = new boolean[list.length];
		
		for (int i = 0; i < isSmallest.length; i++) {
			isSmallest[i] = true;
		}
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] > list[j]) {
					isSmallest[i] = false;
				}
			}
		}
		
		for (int i = 0; i < isSmallest.length; i++) {
			if (isSmallest[i]) {
				index = i;
			}
		}
		
		return index;
	}

}
