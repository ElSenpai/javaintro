package gameProject;

import java.time.LocalDate;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String tcNo;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, LocalDate birthDate, String tcNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.tcNo = tcNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	
	
	

}
