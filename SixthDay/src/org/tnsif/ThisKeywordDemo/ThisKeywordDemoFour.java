package org.tnsif.ThisKeywordDemo;
class Director
{
	String name;
	void print()
	{
		this.name="mahesh bhatt";
		display(name);
	}
	void display(String name)
	{
		System.out.println("Director name is:"+name);
		
	}
}

public class ThisKeywordDemoFour {

	public static void main(String[] args) {
		Director obj=new Director();
		obj.print();
		

	}

}
