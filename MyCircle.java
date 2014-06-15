public class MyCircle {
	private double r = 1.0;
	
	public MyCircle() {
		r = 1.0;
	}
	
	public MyCircle(double radius) {
		r = radius;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}
	
	public static void main(String[] args) {
		MyCircle c = new MyCircle();
		System.out.println("Radius is " + c.r);
	}
}


