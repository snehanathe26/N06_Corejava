package org.tnsif.InterfacesDemo;

public interface Sony 
{
	int noOfchannel=6;
//	by default all the variables inside the interface all variables are public static final
	void display();
//	by default all the methods inside the interface all methods are abstract
	//java 8 provides static and default method inside and interface
	static void accept()
	{
		System.out.println("This is the static method");
	}
	default void show()
	{
		System.out.println("This is the default method");
	}
}
	


