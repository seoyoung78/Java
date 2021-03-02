package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:\\����\\Class\\Java\\src\\ch18\\exam01\\data.txt";
		try {
			InputStream is = new FileInputStream(filePath);
			/*���1
			while (true) {
				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.println(data);
			}*/
			
			//���2
			int data = -1;
			while ((data = is.read()) != -1) {
				System.out.print((char)data);
			}
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
