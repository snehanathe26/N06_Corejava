package org.tnsif.InterfacesDemo;

public class InterfaceExecutor {

	public static void main(String[] args) 
	{
		//we cannot instantiate the interface
		//Sony obj=new Sony();
		SonySab obj=new SonySab();
		obj.display();
        obj.show();
        //to called the static method 
        //interface_name.static_method_name;
        Sony.accept();
        ISRO i=new ISRO();
        i.status();
        Human h=new Human();
        h.showDrink();
		
		

	}

}
