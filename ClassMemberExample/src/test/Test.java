package test;

import domain.Book;
import domain.Customer;

public class Test {

	public static void main(String[] args) {
		Book bb=new Book();		
		Customer c1=new Customer();//creating a customer object and allocating memory to it
		c1.cId=1001;
		c1.name="David";
		c1.address="UK";
		c1.email="d@gmail.com";
		c1.display();
		Customer c2=new Customer();//creating a customer object and allocating memory to it
		c2.cId=1002;
		c2.name="Ron";
		c2.address="USA";
		c2.email="r@gmail.com";
		c2.display();
		Book b1=new Book();//creating a book object and allocating memory to it
		b1.bId=3001;
		b1.title="tell me your dreams";
		b1.price=12.55f;
		b1.author="Sidney Sheldon";
		b1.show();
		
		
		
		

	}

}
