
public class PredictTuition {
	public static void main(String[] args) {
		
		final int CURRENT_TUITION = 10000;
		final int TUITION_IN_THE_FUTURE = CURRENT_TUITION * 2;
		
		double tuition = (double) CURRENT_TUITION;
		int year = 1; 
		while (tuition <= TUITION_IN_THE_FUTURE) {
			tuition *= 1.07;
			year++;
		}
		
		System.out.println("Tuition will be doubled in " + year + " years.");
	}

}
