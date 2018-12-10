package day5;

import java.util.ArrayList;
import java.util.Collections;

public class Smain  {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("Meghna", 21, "167"));
		al.add(new Student("Chandana", 23, "157"));
		al.add(new Student("sadhana", 19, "302"));
		System.out.println("student ages");
		for (Student s : al) {
			System.out.print(s.age+" ");
		}
		Collections.sort(al);
		System.out.println("\nsorted list of student ages");
		for (Student s : al) {
			System.out.print(s.age+" ");
		}
	}

}
