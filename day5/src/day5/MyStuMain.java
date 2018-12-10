package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyStuMain  {

	public static void main(String[] args) {
		ArrayList<MyStudent> al = new ArrayList<MyStudent>();
		al.add(new MyStudent("Meghna", 21, "167"));
		al.add(new MyStudent("Chandana", 23, "157"));
		al.add(new MyStudent("sadhana", 19, "302"));
		/*System.out.println("student ages");
		for (Student s : al) {
			System.out.print(s.age+" ");
		}*/
		System.out.println("\n list of student name");
		for (MyStudent s : al) {
			System.out.print(s.sname+" ");
		}
		Collections.sort(al,new NameComparator());
		
		Iterator<MyStudent> iterator = al.iterator();
		System.out.println("\nSorted names");
		while(iterator.hasNext())
		{
			MyStudent stu =  iterator.next();
			
			System.out.print(" "+stu.sname);
		}
	}

}
