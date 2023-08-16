package org.tnsif.PolymorphismConcepts;

class ChiefMinister
{
	String cm_name;
	String corruption(String cm_name,int salary)
	{
		return cm_name+" "+salary;
	}
	
}
class Mla extends ChiefMinister
{ 
	String corruption(int salary, String name, int votes)	{
		return salary+ " "+ name+" " +votes;
		
	}
	
}
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
    Mla obj=new Mla();
    System.out.println(obj.corruption(4567,"sneha",34));
    System.out.println(obj.corruption("Nathe",56));
	}

}
