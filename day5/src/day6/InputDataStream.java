package day6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputDataStream {

	public static void main(String[] args) throws IOException {
		File f = new File("Demo.txt");
		FileOutputStream fos = new FileOutputStream(f);

		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeInt(12);
		dos.write(Byte.MAX_VALUE);
		dos.writeBoolean(true);
		dos.writeDouble(38.69);
		dos.writeLong(242503);

		FileInputStream fis = new FileInputStream(f);

		DataInputStream dis = new DataInputStream(fis);

		System.out.println(dis.readInt());
		System.out.println(dis.readByte());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		System.out.println(dis.readLong());

		dos.close();
		dis.close();
	}

}
