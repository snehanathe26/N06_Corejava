//program to demonstrate on this keyword 
//this keyword is used to refer current object of the class.
package org.tnsif.ThisKeywordDemo;
class Account
{
	long account_no;
	void setdata(long account_no)
	{
		this.account_no=account_no;
	}
	
	void display()
	{
		System.out.println(account_no);
		
	}

}



public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account obj=new Account();
		//obj.display(45439988994L);
		obj.setdata(677655L);
		obj.display();
		

	}

}
