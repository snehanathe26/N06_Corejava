//Program to demonstrate on bunjee jumping using nested if

package org.tnsif.decisionmaking;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int age= s.nextInt();
		int weight= s.nextInt();
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for the bunjee jumping");
		
				if(weight>110)
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println("the person is not eligible for the bunjee jumping");
			}
		}
		

	}

}
