package org.tnsif.MultiDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrayUserInput {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Lets print the array elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
//		Arrays.sort(arr);
//		System.out.println("the sorted array elements");
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<2;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			
//		}
	}

}
