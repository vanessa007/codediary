
public class TestCircle2D {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D();
		System.out.println(c1.contains(0.2, 0.2));
		
		Circle2D c2 = new Circle2D(2.0, 2.0, 5.5);
		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
		System.out.println(c2.contains(3, 3));
		System.out.println(c2.contains(new Circle2D(3, 5, 2.3)));
		System.out.println(c2.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
