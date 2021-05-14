package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Gamer implements IEntity {
	private String TcNo;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public Gamer(String tcNo, String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		TcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getTcNo() {
		return TcNo;
	}

	public void setTcNo(String tcNo) {
		TcNo = tcNo;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
	
	

}
