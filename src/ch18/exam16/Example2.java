package ch18.exam16;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Example2 {

	public static void main(String[] args) throws Exception {
		
		//���1
		/*String filePath = "D:/Team6Projects/Java/src/ch18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		
		String data = "������ �������̴�.";
		byte[] bytes = data.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		
		data = "������ �����ؿ�.";
		bytes = data.getBytes("UTF-8");
		os.write(bytes);
		os.flush();
		os.close();
		*/
		
		//���2
		String filePath = "D:/Team6Projects/Java/src/ch18/exam16/data.txt";
		OutputStream os = new FileOutputStream(filePath);
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		
		String data = "������ �������̴�.";
		writer.write(data);
		writer.flush();
		data = "������ �����ؿ�.";
		writer.write(data);
		writer.flush();
		
		writer.close();
	}

}
