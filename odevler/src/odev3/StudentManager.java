package odev3;

public class StudentManager extends UserManager {
	
    public void add(Student stu) {
		System.out.println("��renci eklendi");
	}
    public void update(Student stu) {
		System.out.println("��renci g�ncellendi");
	}
    public void delete(Student stu) {
	  System.out.println("��renci silindi");
    }

}
