package BasicProjects;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class FileCreation {
  public static void main(String[] args) throws IOException {
    
      File file = new File("demo.txt");
      if (file.createNewFile()) {
        System.out.println("File created: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());  
      } else {
        System.out.println("File already exists.");
      }
  }
    
  }

