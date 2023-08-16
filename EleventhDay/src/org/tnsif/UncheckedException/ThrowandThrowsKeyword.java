package org.tnsif.UncheckedException;

public class ThrowandThrowsKeyword {
	static void iseligible (int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("The person is eligible to donate the blood");
		}
		else
		{
			throw new ArithmeticException("Criteria is not satisfied");
		}
	}

	public static void main(String[] args) {
		try
		{
		ThrowandThrowsKeyword.iseligible(12,45);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
