package main.file.handling.pgms;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {

  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("G:\\text-file.txt", true);
    fw.write("This is text file \n"); // write string types
    fw.write("The file has been writter using FileWriter object");
    fw.write("\n");
    fw.write(100); // write int data type
    fw.write("\n");
    char[] c = {'a', 'b', 'c'};
    fw.write(c); // writing array of char values
    fw.write("\n");
    fw.flush();
    fw.close();
    System.out.println("File writer is completed writing in the specified file");
  }
}
