import java.util.*;

public class SelectionSortUsingArrayList {
	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter a number: ");
			double item = input.nextDouble();
			if (item == 0) break;
			list.add(item);
		}
		
		selectionSort(list);
		
	}

	public static void selectionSort(ArrayList<Double> list) {
		
		for (int i = 0; i < list.size() - 1; i++) {
			double currentMin = list.get(i);
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin > list.get(j)) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i, currentMin);
			}
		}
		
		for (double u: list) {
			System.out.println(u);
		}
		
	}

}