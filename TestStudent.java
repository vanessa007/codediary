
class Student {
	
	String name;
	int age;
	boolean isScienceMajor;
	char gender;
	
	public Student() {
	}
	
	public Student(String name, int age, boolean isScienceMajor, char gender) {
		this.name = name;
		this.age = age;
		this.isScienceMajor = isScienceMajor;
		this.gender = gender;
	}
	
	public boolean changeMajor() {
		if (isScienceMajor) {
			isScienceMajor = false;
		} else {
			isScienceMajor = true;
		}
		return isScienceMajor;
	}

}

public  class TestStudent {
	public static void main(String[] args) {
		
		// Create a student object called joe without parameter
		Student joe = new Student();
		
		System.out.println("Name? " + joe.name);
		System.out.println("Age? " + joe.age);
		System.out.println("Is science major? " + joe.isScienceMajor);
		System.out.println("Gender? " + joe.gender);
		
		System.out.println();
		
		// Create a student object called vanessa, and initialize it with some input
		Student vanessa = new Student("Vanessa", 18, true, 'f');
		
		System.out.println("Name? " + vanessa.name);
		System.out.println("Age? " + vanessa.age);
		System.out.println("Is science major? " + vanessa.isScienceMajor);
		System.out.println("Gender? " + vanessa.gender);
		
		System.out.println();
		
		vanessa.changeMajor();
		System.out.println("Is science major? " + vanessa.isScienceMajor);
		
	}
	
}