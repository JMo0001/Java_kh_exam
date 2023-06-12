package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Texta {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream
					("d:/workspace/github/Java_kh_exam/06_ObjectOrientedProgramming/a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
