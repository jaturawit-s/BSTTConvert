import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class BSTTConvert {
	// Connect to your database.
    public static void main(String[] args)  {
    
    	System.out.println("Starting ...");
    	
    	try {
//			Scanner in0 = new Scanner(new FileReader("BSTTFiles/DM_BI_DLYSales_GT.csv"));
//			Scanner in1 = new Scanner(new FileReader("BSTTFiles/DM_BI_Stock_GT.csv"));
//			Scanner in2 = new Scanner(new FileReader("BSTTFiles/DM_M01_CUST.csv"));
//			Scanner in3 = new Scanner(new FileReader("BSTTFiles/DM_PENINV_GT.csv"));
    		String file0 = "DM_BI_DLYSales_GT.csv";
    		String file1 = "DM_BI_Stock_GT.csv";
    		String file2 = "DM_M01_CUST.csv";
    		String file3 = "DM_PENINV_GT.csv";
    		
//			
			
			
			InputStreamReader fr0 = new InputStreamReader(new FileInputStream("BSTTFiles/" + file0), "UTF8");
			InputStreamReader fr1 = new InputStreamReader(new FileInputStream("BSTTFiles/" + file1), "UTF8");
			InputStreamReader fr2 = new InputStreamReader(new FileInputStream("BSTTFiles/" + file2), "UTF8");
			InputStreamReader fr3 = new InputStreamReader(new FileInputStream("BSTTFiles/" + file3), "UTF8");
				   
			BufferedReader in0 = new BufferedReader(fr0);
			BufferedReader in1 = new BufferedReader(fr1);
			BufferedReader in2 = new BufferedReader(fr2);        
			BufferedReader in3 = new BufferedReader(fr3);
			
					
			OutputStreamWriter fw0 = new OutputStreamWriter(new FileOutputStream("BSTTFiles/Convert/" + file0), StandardCharsets.UTF_8);
			OutputStreamWriter fw1 = new OutputStreamWriter(new FileOutputStream("BSTTFiles/Convert/" + file1), StandardCharsets.UTF_8);
			OutputStreamWriter fw2 = new OutputStreamWriter(new FileOutputStream("BSTTFiles/Convert/" + file2), StandardCharsets.UTF_8);
			OutputStreamWriter fw3 = new OutputStreamWriter(new FileOutputStream("BSTTFiles/Convert/" + file3), StandardCharsets.UTF_8);
			
			BufferedWriter out0 = new BufferedWriter(fw0);
			BufferedWriter out1 = new BufferedWriter(fw1);
			BufferedWriter out2 = new BufferedWriter(fw2);
			BufferedWriter out3 = new BufferedWriter(fw3);
			
			String str = "";
			
			while ((str = in0.readLine()) != null) {
	             System.out.println(str);
	        }
			
			in0.close();
			
			str = "";
			
			while ((str = in1.readLine()) != null) {
	             System.out.println(str);
	             out0.write(str);
	        }
			
			in1.close();
			
			str = "";
			
			while ((str = in2.readLine()) != null) {
	             System.out.println(str);
	             out0.write(str);
	        }
			
			in2.close();
			
			str = "";
			
			while ((str = in3.readLine()) != null) {
	             System.out.println(str);
	             out0.write(str);
	        }
			
			in3.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    catch (UnsupportedEncodingException e) 
	    {
	        System.out.println(e.getMessage());
	    } 
	    catch (Exception e)
	    {
	        System.out.println(e.getMessage());
	    }
    	
    	System.out.println("Done ...");
    	
    }

}
