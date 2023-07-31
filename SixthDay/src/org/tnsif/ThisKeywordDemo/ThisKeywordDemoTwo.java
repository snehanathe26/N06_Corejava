package org.tnsif.ThisKeywordDemo;

class Bank
{
	long account_no;
	
	Bank(long account_no)
	{
		this.account_no=account_no;
		//System.out.println(account_no);
	}
	
	void display()
	{
		System.out.println(account_no);
	}
}
public class ThisKeywordDemoTwo {

	public static void main(String[] args) {
		Bank obj=new Bank(53443434L);
		obj.display();

	}

}
