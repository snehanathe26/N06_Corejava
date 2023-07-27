package org.tnsif.multilevelinheritance;

public class Child extends Parent
{
	private String childname;
	 private String education;

	
	public Child(String car, String bike, String surname, long property, String home, String childname, String education) {
		super(car, bike, surname, property, home);
		this.childname = childname;
		this.education = education;
	}

	public String getChildname() {
		return childname;
	}

	public void setChildname(String childname) {
		this.childname = childname;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Child [childname=" + childname + ", education=" + education + ", toString()=" + super.toString() + "]";
	}
	 

}
