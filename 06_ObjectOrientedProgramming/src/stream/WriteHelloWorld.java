package stream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteHelloWorld {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("a.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeUTF("Hello World");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
