package org.tnsif.StaticKeywordDemo;

public class StaticBlockExecutor {
	static int a;
	int b;
	//we can initialize only static variable inside the static block
	//static block is used to initialize the static variable
	static
	{
		 a=10;
		 //b=38;
		 System.out.println(a);
		
	}
	static void print()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		//print();
		//main function is static hence it calls the static blocks 
		//method and variables by default
		
		

	}

}
