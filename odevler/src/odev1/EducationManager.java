package odev1;



public class EducationManager {
	public void add(Education edu,User user) {
		System.out.println("Sayýn : "+user.fullName + " "+ edu.name+ " Kayýt olundu "  );
		
	}
	
	public void remove(Education edu,User user) {
		System.out.println("Kurs a Kaydýnýz silindi");
	}
}
