package BasicProjects;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) throws FileNotFoundException {
    
      File demo = new File("demo.txt");
      
      Scanner myReader = new Scanner(demo);
      
      while (myReader.hasNextLine())
      {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
   
  }
}
