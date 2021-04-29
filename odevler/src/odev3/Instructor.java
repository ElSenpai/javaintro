package odev3;

public class Instructor extends User {

	private String[] courses;
	
	public Instructor() {
		
	}

	public Instructor(String[] courses) {
		super();
		this.courses = courses;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	
}
