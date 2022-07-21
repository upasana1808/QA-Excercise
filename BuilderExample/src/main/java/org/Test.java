package org;

public class Test {
	public static void main(String[] args) {
		Product obj1=new ProductBuilder()
				.name("TV")
				.buildProduct();
		Product obj2=new ProductBuilder()
				.name("TV")
				.buildProduct();
		Product obj3=new ProductBuilder()
				.name("TV")
				.buildProduct();

	}
}
