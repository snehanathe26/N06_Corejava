package org.tnsif.instanceofDemo;
class RBI
{
	protected String IFSC_CODE;;
	
}
class SBI extends RBI
{
   
   public SBI()
   {
	   super.IFSC_CODE="RBIS0NGPA01";
	   String IFSC_CODE="SBIN0002161";
	   System.out.println(IFSC_CODE);
	   System.out.println(super.IFSC_CODE);
   }
}
//Instance of operator
public class InstanceofDemo {

	public static void main(String[] args) {
	  SBI sb=new SBI();
	  System.out.println(sb instanceof RBI);//shows the boolean result
	  System.out.println(sb instanceof SBI);

	}

}
/*
 * If the parent class and child class with same method name or same variable name
 *  in such case use super.variable name to access variable of the parent class inside the child class
 *  same for the method is applicable*/
