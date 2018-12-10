package day5;

public class Student implements Comparable<Student>{
	String sname = new String();
	int age;
	String sid;

	public Student(String sname, int age, String sid) {
		this.sname = sname;
		this.age = age;
		this.sid = sid;

	}

	@Override
	public int compareTo(Student o) {
		if(age==o.age)
		return 0;
		else if(age > o.age)
			return -1;
		else
			return -1;
	}

}
