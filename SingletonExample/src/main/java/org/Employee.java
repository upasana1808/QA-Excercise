package org;

public class Employee {
	static Employee emp=new Employee();
	private Employee(){}
	//static Employee emp=new Employee();
	
	public static Employee getEmployee()
	{
		return emp;
	}
	
	public void sayHello()
	{
		System.out.println("hello");
	}
	
	public void sayHi()
	{
		System.out.println("HI");
	}	
}
