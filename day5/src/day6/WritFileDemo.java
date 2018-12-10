package day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritFileDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("C:\\Users\\chandane\\JAVA\\day5\\Hello.txt");
		String s = new String("Hello Meghna");
		// s.getBytes();
		byte array[] = s.getBytes();// byte array
		fos.write(array);
		fos.close();

		FileInputStream fis = new FileInputStream("C:\\Users\\chandane\\JAVA\\day5\\Hello.txt");
		int c = 0;
		while ((c = fis.read()) != -1) {
			System.out.print((char) c);
		}

		fis.close();
	}

}
