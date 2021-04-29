package odev3;

public class Main {

	public static void main(String[] args) {
		
		Student senpai=new Student();
		senpai.setId(1);
		senpai.setFirstName("Ahmet");
		senpai.setLastName("Uçar");
		senpai.setEmail("Senpai@gmail.com");
		senpai.setCoursesAttended("Java");
		
		
        Instructor engin=new Instructor();
        engin.setId(1);
        engin.setFirstName("Engin");
        engin.setLastName("Demiroğ");
        engin.setEmail("Engin@kodlama.io");
        String[] courses= {"Java","C#"};
        engin.setCourses(courses);
        
        InstructorManager um=new InstructorManager();
        um.add(engin);
        StudentManager sm=new StudentManager();
        sm.add(senpai);
        
        System.out.println(senpai.getCoursesAttended());
        
	}

}
