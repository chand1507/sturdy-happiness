package day5;

//Array of Objects 
public class ArrayMain {

	public static void main(String[] args) {

		ArrayDemo t[] = new ArrayDemo[3];// Array of type ArrayDemo

		t[0] = new ArrayDemo(166167, "Chandana", 20000);
		t[1] = new ArrayDemo(166160, "Suganya ", 20000);
		t[2] = new ArrayDemo(166143, "Suma     ", 20000);
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i].empId + " " + t[i].empName + " " + t[i].salary);
		}

	}

}
