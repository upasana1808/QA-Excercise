package org;

import java.util.Scanner;

public class Sample {
	//Class level/Instance/global scope
	Scanner scn=new Scanner(System.in);
	String name;
	String address;
	
	public void method1() {
		int age;
		System.out.println("enter first name");
		String fName=scn.next();
		name="Upasana";
	}	
	public void method2() {
		System.out.println("enter address");
		address=scn.next();
		//age=23;
	}	

	public static void main(String[] args) {
		
	}

}
