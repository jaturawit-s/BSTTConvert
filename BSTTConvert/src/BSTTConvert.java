import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BSTTConvert {
	// Connect to your database.
    public static void main(String[] args) {
    
    	System.out.print("Starting ...");
    	
    	try {
			Scanner in0 = new Scanner(new FileReader("BSTTFiles/DM_BI_DLYSales_GT_New.csv"));
			Scanner in1 = new Scanner(new FileReader("BSTTFiles/DM_BI_Stock_GT.csv"));
			Scanner in2 = new Scanner(new FileReader("BSTTFiles/DM_M01_CUST.csv"));
			Scanner in3 = new Scanner(new FileReader("BSTTFiles/DM_PENINV_GT.csv"));
			Scanner in4 = new Scanner(new FileReader("BSTTFiles/"));
			
			System.out.println();
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
