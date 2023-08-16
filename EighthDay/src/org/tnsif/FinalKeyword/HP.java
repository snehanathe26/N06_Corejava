package org.tnsif.FinalKeyword;
//if we declare a class as a  final then can't inherit it
public class HP extends Laptop{
	final String processor="Intel I7";
    /*Note: we can't override the final method
     * void display()
	{
		System.out.println("Processor Value:"+" "+proccessor);
	}
	*/
    void display(String processor)
    {
    	System.out.println(processor);
    }

	

}
