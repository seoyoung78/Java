package ch18.exam18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception {

		String filePath = "D:/Team6Projects/Java/src/ch18/exam18/data.db";
		OutputStream os = new FileOutputStream(filePath);
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeInt(3);
		dos.writeDouble(10.5);
		dos.writeBoolean(true);
		dos.writeUTF("ȫ�浿");
		dos.flush();
		
		dos.close();

	}

}
