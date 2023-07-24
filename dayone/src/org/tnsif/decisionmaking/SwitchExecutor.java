//Program to demonstrate on the Switch cases
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int songno=sc.nextInt();
	switch(songno)
	{
	case 1:
		System.out.println("Waka Waka");
		break;
	case 2:
		System.out.println("taki taki");
		break;
	case 3: 
		System.out.println("jai shree ram");
		break;
	default:
		System.out.println("No songs");

		
	}

	}

}
