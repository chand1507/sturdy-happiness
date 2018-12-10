package day6;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		String s = args[0];

		File file = new File(s);
		file.createNewFile();
		System.out.println("Enter the name" + file.getName());
		System.out.println("Parent" + file.getParent());
		System.out.println("path" + file.getAbsolutePath());
		System.out.println("read" + file.canRead());
		System.out.println("length" + file.length());

	}

}
