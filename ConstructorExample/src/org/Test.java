package org;

//import java.lang.*;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person("Alex",30,"UK");
		System.out.println(p1.name+"-"+p1.age+"-"+p1.address);
		Person p2=new Person("Upasana",32,"India");
		System.out.println(p2.name+"-"+p2.age+"-"+p2.address);
		Person p=new Person();
		System.out.println(p.name+"-"+p.age+"-"+p.address);
		Person p3=new Person("Ben",23);
		p3.address="USA";
		System.out.println(p3.name+"-"+p3.age+"-"+p3.address);
	}

}
