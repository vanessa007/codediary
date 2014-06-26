
public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Literature");
		
		// Add three students to course literature
		course1.addStudent("Emma");
		course1.addStudent("John");
		course1.addStudent("Vanessa");
		
		// Display the students
		for (int i = 0; i < course1.getStudents().length; i++) {
			System.out.println(course1.getStudents()[i]+ " ");
		}
		
		// Drop a student
		course1.dropStudent("Emma");
		
		System.out.println("");
		
		// Display the students
		for (int i = 0; i < course1.getStudents().length; i++) {
			System.out.println(course1.getStudents()[i]+ " ");
			}
	}

}
