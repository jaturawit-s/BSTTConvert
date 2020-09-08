import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BSTTConvert {
	// Connect to your database.
    public static void main(String[] args) {
    
    	System.out.print("Starting ...");
    	
    	try {
			Scanner in = new Scanner(new FileReader("filename.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
