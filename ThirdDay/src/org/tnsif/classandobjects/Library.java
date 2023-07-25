//program to demostrate on default and parameterized constructors
package org.tnsif.classandobjects;

public class Library 
{
	//public data members
	public Long noOFBooks;
	public String AuthorName;
	public String Bookname;
	public float price;
	public Library() 
	{
		System.out.println("This is the default constructor");
		// TODO Auto-generated constructor stub
	}//this 
	public Library(long noOFBooks, String authorName, String bookname, float price) {
		super();
		this.noOFBooks = noOFBooks;
		this.AuthorName = authorName;
		this.Bookname = bookname;
		this.price = price;
	}
	@Override
	//if you don't want to use the any user define method then we can use toString method
	public String toString() {
		return "Library [noOFBooks=" + noOFBooks + ", AuthorName=" + AuthorName + ", Bookname=" + Bookname + ", price="
				+ price + "]";
	}
	
	
	
	

}
