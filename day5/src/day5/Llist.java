 package day5;

import java.util.LinkedList;

public class Llist {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(12);
		ll.add(34.62);
		ll.add("Marker");
		ll.add("Eraser");
		ll.add("Marker");

		System.out.println(ll);
		ll.remove("Eraser");
		System.out.println(ll);
		ll.addAll(ll);
		System.out.println(ll);
		System.out.println(ll.contains("Eraser"));
		System.out.println(ll.contains("pencil"));
		ll.removeAll(ll);
		System.out.println(ll);
	}

}
