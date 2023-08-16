package org.tnsif.PolymorphismConcepts;

class Parent
{
	String cm_name;
	static String corruption(String cm_name,int salary)
	{
		System.out.println("this is parent class method");
		return cm_name+" "+salary;
	}
	
}
class Child extends Parent
{ 
	static String corruption(String cm_name,int salary)
	{   System.out.println("this is the child class method");
		return cm_name+" "+salary;
	}	
	
	
}
public class methodOverrridingExecutor {

	public static void main(String[] args) {
          Parent obj=new Parent();
         System.out.println(Child.corruption("devendra",450000));
	}

}
