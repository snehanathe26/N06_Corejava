//Program to demostate on cascaded if else statements
package org.tnsif.decisionmaking;

import java.util.Scanner;

class CascadedIfElse {

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int age1=sc.nextInt();
	 int age2=sc.nextInt();
	 int age3=sc.nextInt();
	 if(age1>age2 && age1>age3)
	 {
		 System.out.println("Age is greater"+ " " + age1);
	 }
	 else if(age2>age1 && age2>age3)
	 {
		 System.out.println("Age is greater"+  " " +age2);
	 }
	 else
	 {
		 System.out.println("Age is greater"+ " " + age3);
	 }
     sc.close();
	}

}
