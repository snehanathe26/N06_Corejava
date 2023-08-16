package org.tnsif.SingleDimensionalArray;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysRuntimeInput {

	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the size of the array");
     int size=4;
     int newArr[]=new int[size];
     System.out.println("Enter the enter the array elements");
     for(int i=0;i<newArr.length;i++)
     {
    	 newArr[i]=sc.nextInt();
     }
     System.out.println("Lets display the array elements");
     
     for(int i=0;i<newArr.length;i++)
     {
    	 System.out.print(newArr[i]+" ");
     }
     
     int max_element=Integer.MIN_VALUE;
     for(int i=0;i<newArr.length;i++)
     {
    	 if(max_element<newArr[i])
    	 {
    		 max_element=newArr[i];
    	 }
     }
     System.out.println();
     System.out.println("The largest element from tha array"+max_element);
     Arrays.sort(newArr);
     System.out.println("Lets sort out the elements"+" ");
     for(int i:newArr)
     {
    	 System.out.print(i+ " ");
     }
	}


}
