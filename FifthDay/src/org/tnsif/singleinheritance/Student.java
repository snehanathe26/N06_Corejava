package org.tnsif.singleinheritance;

public class Student extends Citizen
{
	private int rollno;
	private String CollegeName;
	
	public Student(String city, int pincode, String area, long adharNo,int rollno,String CollegeName) {
		super(city, pincode, area, adharNo);
		this.rollno=rollno;
		this.CollegeName=CollegeName;
	}
	//getter and setter method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", CollegeName=" + CollegeName + ", toString()=" + super.toString() + "]";
	}
	
	
}

