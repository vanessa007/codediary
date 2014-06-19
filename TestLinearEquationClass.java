
public class TestLinearEquationClass {
	public static void main(String[] args) {
		
		LinearEquation myEquation1 = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
		
		if (myEquation1.isSolvable()) {
			double x = myEquation1.getX();
			double y = myEquation1.getY();
			System.out.println("The solution is x = " + x + " and y = " + y + ".");
		} else {
			System.out.println("The equation has no solution");
		}
		
		LinearEquation myEquation2 = new LinearEquation(2.0, 10.0, -1.0, -5.0, -6.0, -5.0);
		
		if (myEquation2.isSolvable()) {
			double x = myEquation2.getX();
			double y = myEquation2.getY();
			System.out.println("The solution is x = " + x + " and y = " + y);
		} else {
			System.out.println("The equation has no solution.");
		}
		
	}
	

}
