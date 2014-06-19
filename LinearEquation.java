
public class LinearEquation {
	
	// Data field
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	// Constructor with arguments for a, b, c, d, e, f
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	// Getters for a, b, c, d, e, f
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	
	// isSolvable method
	public boolean isSolvable() {
		return ((a * d - b * c) != 0);
	}
	
	// Getters for solution X and Y
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	public double getY() {
		return (a * f - e *c) / (a * d - b * c);
	}

}

