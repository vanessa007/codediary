import javax.swing.JOptionPane;
public class SortThreeIntegers {
	public static void main(String[] args) {
		
		// Get three integers from the user
		String num1String = JOptionPane.showInputDialog("Enter the first integer");
		String num2String = JOptionPane.showInputDialog("Enter the second integer");
		String num3String = JOptionPane.showInputDialog("Enter the third integer");
		
		// Parse the strings
		int num1 = Integer.parseInt(num1String);
		int num2 = Integer.parseInt(num2String);
		int num3 = Integer.parseInt(num3String);
		
		// Make sure num1 < num2
		if (num2 < num1) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// Make sure num2 < num3
		if (num3 < num2) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		int s = (num1 > num2)? ((num2 > num3)? num3 : num2) : ((num1 > num3)? num3 : num1);
		int m = (num1 > num2)? ((num2 > num3)? num2 : (num3 > num1)? num1 : num3) : ((num1 > num3)? num1 : (num3 > num2)? num2 : num3);
		int l = (num1 > num2)? ((num1 > num3)? num1 : num3) : ((num2 > num3)? num2 : num3);
		
		// Print result
		System.out.println(s + " < " + m + " < " + l);
	}

}
