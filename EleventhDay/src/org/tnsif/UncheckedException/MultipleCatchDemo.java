package org.tnsif.UncheckedException;

public class MultipleCatchDemo {
	static void print(int arr[]) {
		try
		{
		System.out.println(arr[3]);
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled"+e);
		}
		

		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int arr[]= {12,3,14};
		print(arr);

	}

}
