package org.tnsif.SuperKeywordDemo;

class Building
{
	int flat_no;
	int floor=23;
	String name_of_building="Samarth";
	
	
}
class flat extends Building
{
	String name_of_building="Sneha Nathe";
	int floor=48;
	void print()
	{
		/* if parent class and child class variable name are same and 
		 * if you want to access parent class variable inside child class used super.variable name
		 * */
		System.out.println(super.name_of_building);
		System.out.println(name_of_building);
		System.out.println(super.floor);
		System.out.println(floor);
		
	}
}
public class SuperKeywordVariable {

	public static void main(String[] args)
	{
		flat obj= new flat();
		//System.out.println(obj.name_of_building);
		obj.print();
		

	}

}
