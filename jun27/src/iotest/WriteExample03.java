package iotest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample03 {
	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("c:\\temp\\write.txt");
		char[] arr = {'a','b','c','d'};
		
		writer.write(arr);
		writer.write("A");
		writer.write("P");
		writer.write("L");
		writer.write("L");
		writer.write("Elooo\n");
		writer.write('a');
		
		writer.flush();
		writer.close();
		
	}
}
