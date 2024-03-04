package BasicProjects;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class AddingContents {
  public static void main(String[] args) throws IOException {
    
      FileWriter myWriter = new FileWriter("demo.txt");
      
      myWriter.write("Hello my name is Puja Kadam.");
      
      myWriter.close();
      
      System.out.println("Successfully wrote to the file.");
   
  }
}