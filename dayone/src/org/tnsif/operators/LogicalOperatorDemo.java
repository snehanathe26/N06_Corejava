package org.tnsif.operators;

public class LogicalOperatorDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		System.out.println(31!=7 && 3>=5);// and operator
		System.out.println(31!=7 || 3>=5);//or operator
		System.out.println(!(31!=7 || 3>=5)); //Not operator

	}

}
