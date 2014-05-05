
public class PickACard {
	public static void main(String[] args) {
		int point = (int) (Math.random() * 13) + 1;
		int color = (int) (Math.random() * 4) + 1;
		
		String pointString = Integer.toString(point);
		
		if (point == 1) {
			pointString = "Ace";
		} else if (point == 11) {
			pointString = "Jack";
		} else if (point == 12) {
			pointString = "Queen";
		} else if (point == 13) {
			pointString = "King";
		}
		
		String colorString = "";
		
		if (color == 1) {
			colorString = "Clubs";
		} else if (color == 2) {
			colorString = "Diamonds";
		} else if (color == 3) {
			colorString = "Heart";
		} else if (color == 4) {
			colorString = "Spades";
		}
		
		System.out.println("The card you picked is " + pointString + " of " + colorString);
	}

}
