package odev3;

public class StudentManager extends UserManager {
	
    public void add(Student stu) {
		System.out.println("öðrenci eklendi");
	}
    public void update(Student stu) {
		System.out.println("öðrenci güncellendi");
	}
    public void delete(Student stu) {
	  System.out.println("öðrenci silindi");
    }

}
