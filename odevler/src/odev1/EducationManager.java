package odev1;



public class EducationManager {
	public void add(Education edu,User user) {
		System.out.println("Say�n : "+user.fullName + " "+ edu.name+ " Kay�t olundu "  );
		
	}
	
	public void remove(Education edu,User user) {
		System.out.println("Kurs a Kayd�n�z silindi");
	}
}
