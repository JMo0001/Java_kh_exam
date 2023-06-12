package stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadHelloWorld {
	public static void main(String[] args) {
		try(FileInputStream fis= new FileInputStream("a.txt");
				DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.readUTF());
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
