package org.tnsif.multilevelinheritance;

public class GrandParent 
{
	private String surname;
	private long property;
	private String home;
	
	
	

	public GrandParent(String surname, long property, String home) {
		super();
		this.surname = surname;
		this.property = property;
		this.home = home;
	 }
	

	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public long getProperty() {
		return property;
	}


	public void setProperty(long property) {
		this.property = property;
	}


	public String getHome() {
		return home;
	}


	public void setHome(String home) {
		this.home = home;
	}


	@Override
	public String toString() {
		return "GrandParent [surname=" + surname + ", property=" + property + ", home=" + home + "]";
	}
	
	

}
