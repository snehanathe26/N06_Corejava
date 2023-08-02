package org.tnsif.SuperKeywordDemo;
class Google
{
	Google(String ceo)
	{
		System.out.println("Parameterized constructor of Parent class"+" " + ceo);
	}
	
}
class youtube extends Google
{
	String useid;

	public youtube(String ceo, String useid) {
		super(ceo);
		this.useid = useid;
		System.out.println(useid);
		System.out.println("this is the parameterized constructor of child class");
	}
	
}
public class SuperKeywordConstructorDemo {

	public static void main(String[] args) {
		youtube obj=new youtube("Sundar Pichai","abc@gmail.com");

	}

}
