
public class Circle2D {
	// The center of the circle
	private double x;
	private double y;
	
	// The radius
	private double radius;
	
	// Constructor without parameters
	public Circle2D() {
		this(0, 0, 1);
	}
	
	// Constructor with x, y and radius
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// Get area method
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	// Get perimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	// Check if the point(X, Y) is within the circle
	public boolean contains(double X, double Y) {
		if (Math.sqrt((x - X) * (x - X) + (y - Y) * (y - Y)) < radius) {
			return true;
		} else {
			return false;
		}
	}
	
	// Check if the new circle is with the circle
	public boolean contains(Circle2D circle) {
		if (Math.sqrt((x - circle.x) * (x - circle.x) + (y - circle.y) * (y - circle.y)) + circle.radius < radius) {
			return true;
		} else {
			return false;
		}
	}
	
	// Check if the new circle overlaps the circle
	public boolean overlaps(Circle2D circle) {
		if (Math.sqrt((x - circle.x) * (x - circle.x) + (y - circle.y) * (y - circle.y)) + circle.radius > radius
				&& Math.sqrt((x - circle.x) * (x - circle.x) + (y - circle.y) * (y - circle.y)) + circle.radius < radius + circle.radius) {
			return true;
		} else {
			return false;
		}
	}

}
