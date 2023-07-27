package org.tnsif.multilevelinheritance;

public class Parent extends GrandParent {
	private String car;
	private String bike;
	public Parent(String car, String bike,String surname,long property,String home) {
		super(surname,property,home);
		this.car = car;
		this.bike = bike;
	}
	
	
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Parent [car=" + car + ", bike=" + bike + ", toString()=" + super.toString() + "]";
	}
	
	

}
