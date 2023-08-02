package org.tnsif.SuperKeywordDemo;

class MET
{
	String owner_name="chhagan Bhujbal";
	void display()
	{
		System.out.println("Owner name:"+owner_name);
	}
	
}
class BKC extends MET
{
	String owner_name="Shaifali bhujbal";
	void display()
	{
		super.display();
		System.out.println("Owner name:"+owner_name);
	}
}
public class SuperKeywordMethod {

	public static void main(String[] args) 
	{
     BKC obj=new BKC();
     obj.display();
	}
	/* if parent class and child class method name are same and we want to access that method
	 * of parent class 
	 * then super.method name
	 * */

}
