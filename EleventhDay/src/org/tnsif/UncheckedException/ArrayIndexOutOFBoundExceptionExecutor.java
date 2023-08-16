package org.tnsif.UncheckedException;

public class ArrayIndexOutOFBoundExceptionExecutor {
	static void display(int arr[])
	{
		try
		{System.out.println(arr[6]);
		//System.exit(0);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Excepthandled"+ e);
			//System.exit(0);
		}
		finally
		{
			System.out.println(13/0);
			System.out.println("Finally block always executed");
		}
	}

	public static void main(String[] args) {
		int arr[]= {11,6,89};
		display(arr);

	}

}
//if try and catch block contains system.exit(0);
//after the exception code line then finally block does not executes
//when the finally block contains the exception then that time finally is not executed
