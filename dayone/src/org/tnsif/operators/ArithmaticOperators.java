//program to demostrate the Arithmatic operators
package org.tnsif.operators;
import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		sc.close();

	}

}
