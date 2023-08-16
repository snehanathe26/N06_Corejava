package org.tnsif.SingleDimensionalArray;

public class ArraysOFObject {

	public static void main(String[] args) {
		Employees arr[]=new Employees[3];
		arr[0]=new Employees(101,"Sneha",59000.0);
		arr[1]=new Employees(102,"Neha",56000.0);
		arr[2]=new Employees(103,"Trupti",55000.0);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}

	}

}
