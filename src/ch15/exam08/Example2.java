package ch15.exam08;

import java.util.Comparator;
import java.util.TreeSet;

import ch15.exam07.Person;

public class Example2 {

	public static void main(String[] args) {

		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (o1.price < o2.price) {
					return -1;
				} else if (o1.price == o2.price) {
					return 0;
				} else {
					return 1;
				}
			}
		});
		
		set.add(new Product("TV", 10000));
		set.add(new Product("Audio", 5000));
		set.add(new Product("Car", 12000));
		
		for (Product p : set) {
			System.out.println(p.name + ", " + p.price);
		}

	}

}
