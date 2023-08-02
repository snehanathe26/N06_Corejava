package org.tnsif.StaticKeywordDemo;
/*
 * If any method outside the main function and if you want to
 * access that method inside the main function make it as static 
 * we cant use non-static variable inside static method*/
public class StaticClassExecutor {
	
	static void displayScore(int score)
	{
		System.out.println("Score is: "+score);
	}
 
	public static void main(String[] args) 
	{
		displayScore(45);
		

	}

}
