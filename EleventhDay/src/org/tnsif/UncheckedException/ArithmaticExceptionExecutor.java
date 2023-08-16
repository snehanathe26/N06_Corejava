package org.tnsif.UncheckedException;
import java.util.Scanner;

public class ArithmaticExceptionExecutor {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     //try block contains the exception
     try {
     System.out.println(a/b);
     }
     //catch block used to handle the exception
     catch(Exception e)
     {
    	System.out.println("Exception handled"+e);
     }

	}

}
