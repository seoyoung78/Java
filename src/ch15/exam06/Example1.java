package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();
		
		set.add("박길순");
		set.add("감자바");
		set.add("방돌이");
		set.add("홍길동");
		
		for (String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		NavigableSet<String> nset = set.descendingSet();
		for (String item : nset) {
			System.out.println(item);
		}
		System.out.println();
		
		NavigableSet<String> sset = set.subSet("가", false, "방돌이", true);
		for (String item : sset) {
			System.out.println(item);
		}
		
	}

}
