package ro.crystal.demo.student;

import java.util.List;

import ro.crystal.demo.grade.Grade;

/**
 * <code>POJO</code> describing a student entity from real world. Each
 * <code>student</code> has: name, CNP, age, address and a list of {@link Grade}
 * 
 * @author <a href="mailto:iulia.iscru@crystal-system.ro">Iulia Iscru</a>
 *
 */
public class Student {
	private String firstName;
	private String lastName;
	private String className;
	private String CNP;
	private int age;
	private String address;
	private List<Grade> grades;
	private char gender;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String pFirstName) {
		this.firstName = pFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String pLastName) {
		this.lastName = pLastName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(final String pClassName) {
		this.className = pClassName;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(final String pCNP) {
		this.CNP = pCNP;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int pAge) {
		this.age = pAge;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(final String pAddress) {
		address = pAddress;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(final List<Grade> pGrades) {
		this.grades = pGrades;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", CNP=" + CNP + ", age=" + age
				+ ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object pObj) {
		if (pObj instanceof Student) {
			if (CNP.equals(((Student) pObj).getCNP())) {
				return true;
			}
			return false;
		}
		return false;
	}

	public class Address {
		private String streetName;
		private int streetNumber;
		private String city;

		public Address(final String pStreetName, final int pStreetNumber, final String pCity) {
			this.streetName = pStreetName;
			this.streetNumber = pStreetNumber;
			this.city = pCity;
		}

		public String getStreetName() {
			return streetName;
		}

		public void setStreetName(final String pStreetName) {
			streetName = pStreetName;
		}

		public int getStreetNumber() {
			return streetNumber;
		}

		public void setStreetNumber(final int pStreetNumber) {
			streetNumber = pStreetNumber;
		}

		public String getCity() {
			return city;
		}

		public void setCity(final String pCity) {
			city = pCity;
		}

		@Override
		public String toString() {
			return "Address [streetName=" + streetName + ", streetNumber=" + streetNumber + ", city=" + city + "]";
		}

	}

	public char getGender() {
		return gender;
	}

	public void setGender(final char pGender) {
		gender = pGender;
	}
	
}
