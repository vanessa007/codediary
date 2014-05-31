
public class ExecutionTime {
	public static void main(String[] args) {
		
		int[] list = new int[100000];
		
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * list.length);
		}
		int key = (int) (Math.random() * list.length);
		
		// Get the execution time of linearSearch method
		long startTime1 = System.currentTimeMillis();
		
		int indexOfKey1 = linearSearch(list, key);
		
		if (indexOfKey1 == -1) {
			System.out.println("It's not in the list!");
		} else {
			System.out.println("The index of " + key + " is " + indexOfKey1);
		}
		
		long endTime1 = System.currentTimeMillis();
		long executionTime1 = endTime1 - startTime1;
		
		System.out.println("The execution time is " + executionTime1/1000.0 + " seconds");
		
		// Sort the list
		sort(list);
		
		// Get the execution time of binarySearch method
		long startTime2 = System.currentTimeMillis();
	
		int indexOfKey2 = linearSearch(list, key);
		
		if (indexOfKey2 == -1) {
			System.out.println("It's not in the list!");
		} else {
			System.out.println("The index of " + key + " is " + indexOfKey2);
		}
		
		long endTime2 = System.currentTimeMillis();
		long executionTime2 = endTime2 - startTime2;
		
		System.out.println("The execution time is " + executionTime2/1000.0 + " seconds");
		
	}
	
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void sort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid]) {
				high = mid - 1;
			} else if (key == list[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		
		return -1;
	}
}
