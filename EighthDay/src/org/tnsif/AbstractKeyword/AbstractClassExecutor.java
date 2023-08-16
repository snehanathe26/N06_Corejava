package org.tnsif.AbstractKeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		//we can't create the object for abstract class
		//this is the child class
		CheeseSandwich obj=new CheeseSandwich();
		obj.prepare();
		obj.show();
	}
}
