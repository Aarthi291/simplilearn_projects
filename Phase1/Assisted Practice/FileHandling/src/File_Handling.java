import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
     static String s1;
	public static void main(String[] args) throws IOException {
//create the file
				s1 ="Welcome";
				File f1 = new File(s1);
				try {
					f1.createNewFile();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				System.out.println("The file had created..");
//write the file
				FileWriter  f2 = new  FileWriter(s1);
				f2.write("\n Eclipse is a good coding platform");
				f2.close();	
			    System.out.println("\nwrite the data into the file complete..");
//read the file
			      File f3 = new File(s1);
			      Scanner s2 = new Scanner(f3);
			      System.out.println("\nRead the data from the file success...");
			      while(s2.hasNextLine())
			      {
			    	  System.out.println("----" +s2.nextLine()+"----");
			      }
			      System.out.println("\nread the data from the file sucusss ..");
 //append the file 
			      String data ="\n We are learning the core java ";
			       FileWriter  output = new FileWriter(s1,true);
			       output.write(data);
			       System.out.println( "\nappend the data to the existing file is succuess");
			       output.close();
			       
			

		

	}

}
