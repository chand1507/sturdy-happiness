package day5;

import java.util.ArrayList;

public class Alist {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("pen");
		al.add("pencil");
		al.add("Marker");
		al.add("Eraser");
		al.add("Marker");

		System.out.println(al);

		al.remove("Eraser");

		System.out.println(al);

		al.addAll(al);

		System.out.println(al);

		System.out.println(al.contains("Eraser"));
		System.out.println(al.contains("pencil"));
		
		al.removeAll(al);
		System.out.println(al);
		
	}
}
