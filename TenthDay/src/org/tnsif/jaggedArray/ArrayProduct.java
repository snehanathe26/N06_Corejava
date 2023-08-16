package org.tnsif.jaggedArray;

public class ArrayProduct {

	public static void main(String[] args) {
    int arr[]= {1,2,3,4};
    int product=1;
    for(int i=0;i<arr.length;i++)
    {
    	product*=arr[i];
    }
    System.out.println(product);
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=product/arr[i];
    }
    System.out.println("");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(arr[i]+" ");
    }
	}

}
