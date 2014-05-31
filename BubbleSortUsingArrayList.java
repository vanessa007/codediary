import java.util.*;
public class BubbleSortUsingArrayList {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		
		while (true) {
			System.out.println("Enter a number: ");
			double item = input.nextDouble();
			if (item == 0) break;
			list.add(item);
		}
		
		bubbleSort(list);
		
	}
	
	public static void bubbleSort(ArrayList<Double> list) {
		
		boolean isChanged = true;
		
		while (isChanged) {
			isChanged = false;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) > list.get(i + 1)) {
					double temp = list.get(i + 1);
					list.set(i + 1, list.get(i));
					list.set(i, temp);
					isChanged = true;
					}
			}
		}
		
		for (double u: list) {
			System.out.println(u);
			}
	}

}
