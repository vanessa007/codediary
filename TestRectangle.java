class MyRectangle {
	
	double width;
	double height;
	
	MyRectangle() {
		width = 1.0;
		height = 1.0;
	}
	
	MyRectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}

}

public class TestRectangle {
	public static void main(String[] args) {
		
		MyRectangle rectangle1 = new MyRectangle(4.0, 40.0);
		MyRectangle rectangle2 = new MyRectangle(3.5, 35.9);
		
		System.out.println("Rectangle1's width: " + rectangle1.width + " Rectangle1's height: " + rectangle1.height + " Rectangle1's area: "
		                   + rectangle1.getArea() + " Rectangle1's perimiter: " + rectangle1.getPerimeter());
		System.out.println("Rectangle2's width: " + rectangle2.width + " Rectangle2's height: " + rectangle2.height + " Rectangle2's area: " 
		                   + rectangle2.getArea() + " Rectangle2's perimiter: " + rectangle2.getPerimeter());
	}

}