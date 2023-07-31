package org.tnsif.ThisKeywordDemo;

class Team
{
	int size;

	 Team() 
	 {
		 this(7);
		System.out.println("the default constructor of Team");
	 }

	public Team(int size) {
		
		System.out.println("this is the parameterized constructor");

	}
	 
	
}
public class ThisKeywordDemoThree {

	public static void main(String[] args)
	{
   Team t=new Team();
	}

}
