package com.Kinben.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;


enum Education {
    MCA,
    B_TECH,
    BSC_CS,
    M_TECH
}

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	
    @Pattern(regexp = "\\d{10}", message = "Contact number should be a 10-digit numeric value.")
	//@Pa
	private String contactNumber;
	
   @Email(message = "Email address should be in proper email format.")
	private String email;
	
	private String address;
	
    @Enumerated(EnumType.STRING)
    private Education education;
	
    private int experience;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	

	public Employee(long id, String name, String contactNumber, String email, String address, Education education,
			int experience) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.education = education;
		this.experience = experience;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", email=" + email
				+ ", address=" + address + ", education=" + education + ", experience=" + experience + "]";
	}
    
    
	
	

}
