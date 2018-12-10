package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductMain {

	public static void main(String[] args) throws IOException {
		try {
			Product p = new Product(1001, "Complan", 157);
			FileOutputStream fos = new FileOutputStream("Product");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			// System.out.println();
			fos.close();
			oos.close();
		}
		catch (Exception e) 
		{
			System.out.println("Exception");
		}

	
	try 
		(
		FileInputStream fis = new FileInputStream("Product");
		ObjectInputStream ois = new ObjectInputStream(fis);)
		{
		
		//ois.readObject();
		Product p = new Product(1001, "Complan", 157);
		Product p1 = (Product) ois.readObject();
		System.out.println(p1);
		fis.close();
		ois.close();
	} 
	catch (Exception e) {
		System.out.println("Exception");
	}

}

}
