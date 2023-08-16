//Program to demonstrate on the jagged array
package org.tnsif.jaggedArray;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		arr[0]=new int[2];//we are storing two members int the outer array[0]
		arr[1]=new int[1];
		arr[2]=new int[3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Lets print the jagged array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		

	}

}
