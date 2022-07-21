package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(1001, "TV", 1500, 1, "Apple", 0);
		Product p2 = new Product(1002, "Mobile", 800, 3, "Samsung", 0);
		Product p3 = new Product(1003, "Tripod", 150, 2, "Mi", 20);
		Product p4 = new Product(1004, "CCTV", 200, 10, "Digitech", 10);
		Product p5 = new Product(1005, "Mouse", 50, 5, "Logitech", 5);
		Product p6 = new Product(1006, "Bluetooth", 100, 3, "Boat", 5);
		Product p7 = new Product(1007, "Phone", 1000, 3, "Apple", 0);
		Product p8 = new Product(1008, "iPod", 100, 3, "Apple", 5);
		Product p9 = new Product(1009, "Tripod", 120, 2, "Mi", 6);
		ArrayList<Product> prodList = new ArrayList();
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		prodList.add(p6);
		prodList.add(p7);
		prodList.add(p8);
		prodList.add(p9);
		List<String> prodFD = prodList.stream().filter(p -> p.deliveryCharges > 0).map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println(prodFD);

		Set<String> prodFDset = prodList.stream().filter(p -> p.deliveryCharges > 0).map(p -> p.name)
				.collect(Collectors.toSet());
		System.out.println(prodFDset);

		Map<Integer, String> prodMap = prodList.stream().collect(Collectors.toMap(p -> p.prodId, p -> p.name));
		System.out.println(prodMap);

		for (Product prod : prodList) {
			if (prod.brand == "Apple") {
				if (prod.deliveryCharges > 0) {
					System.out.println(prod);
				}
			}
		}
		
		System.out.println(prodList.stream().count());

		List<String> names = Arrays.asList("Bob", "Trevor", "Steve", "Gary");
		List<String> result = names.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
		
		Product prodMax=prodList.stream().max((x,y)->x.price>y.price ? 1 :-1).get();
		System.out.println(prodMax);
		
		Product prodMin=prodList.stream().max((x,y)->x.price < y.price ? 1 :-1).get();
		System.out.println(prodMin);
		 // condition1 ? return this : return this
		

		// products with free delivery

	}

}
