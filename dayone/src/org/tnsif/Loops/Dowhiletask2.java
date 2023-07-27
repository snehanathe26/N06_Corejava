package org.tnsif.Loops;
import java.util.Scanner;

public class Dowhiletask2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number:");
		int num=sc.nextInt();
		int count=0;
		do
		{
			int last_digit=num%10;
			System.out.println(last_digit+" ");
			num/=10;
			count++;
		 
		}while(num>0);
		
		System.out.println("The no of digits in the Given number is:"+" "+count);
		sc.close();

	}

}
