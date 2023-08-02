package org.tnsif.StaticKeywordDemo;

class Employee
{
	private int empID;
	private String name;
	private String companyName="TNSIF";
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", companyName=" + companyName + "]";
	}
	void display()
	{
		System.out.println("EmpId:"+" "+this.getEmpID()+" "+"name:"+" "+this.name+" "+"CompanyName:" +" "+this.companyName);
	}
}
public class StaticVarible {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.setEmpID(2);
		e.setName("Shivani Mam");
		e.setCompanyName("Tnsi");
		e.display();
		Employee e1=new Employee();
		e1.setEmpID(2);
		e1.setName("Shivani Mam");
		e1.setCompanyName("Tnsi");
		e1.display();
		e.toString();
	}
	

}
