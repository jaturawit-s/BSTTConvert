import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;


public class BSTTConvert {
	
    public static void main(String[] args)  {
    
    	System.out.println("Starting ...");
    	
    	try {
			
    		String file0 = "DM_BI_DLYSales_GT.csv";
    		String file1 = "DM_BI_Stock_GT.csv";
    		String file2 = "DM_PENINV_GT.csv";
    		String file3 = "DM_M01_CUST.csv";
    		

			
			
    		Reader fr0 = new InputStreamReader(new FileInputStream("BSTTFiles/" + file0), "UTF8");
			Reader fr1 = new InputStreamReader(new FileInputStream("BSTTFiles/" + file1), "UTF8");
			Reader fr2 = new InputStreamReader(new FileInputStream("BSTTFiles/" + file2), "UTF8");
			Reader fr3 = new InputStreamReader(new FileInputStream("BSTTFiles/" + file3), "UTF8");
				   
			BufferedReader in0 = new BufferedReader(fr0);
			BufferedReader in1 = new BufferedReader(fr1);
			BufferedReader in2 = new BufferedReader(fr2);        
			BufferedReader in3 = new BufferedReader(fr3);
			
					
			Writer fw0 = new OutputStreamWriter(new FileOutputStream("BSTTFiles/Convert/" + file0), "UTF8");
			Writer fw1 = new OutputStreamWriter(new FileOutputStream("BSTTFiles/Convert/" + file1), "UTF8");
			Writer fw2 = new OutputStreamWriter(new FileOutputStream("BSTTFiles/Convert/" + file2), "UTF8");
			Writer fw3 = new OutputStreamWriter(new FileOutputStream("BSTTFiles/Convert/" + file3), "TIS620");
			
			BufferedWriter out0 = new BufferedWriter(fw0);
			BufferedWriter out1 = new BufferedWriter(fw1);
			BufferedWriter out2 = new BufferedWriter(fw2);
			BufferedWriter out3 = new BufferedWriter(fw3);
			
			char cbuf[] = new char[2048];
			int len;
			
			while ((len = in0.read(cbuf, 0, cbuf.length)) != -1) {
			    out0.write(cbuf, 0, len);
			}
			
			in0.close();
			out0.close();
			
			while ((len = in1.read(cbuf, 0, cbuf.length)) != -1) {
			    out1.write(cbuf, 0, len);
			}
			
			in1.close();
			out1.close();
			
			while ((len = in2.read(cbuf, 0, cbuf.length)) != -1) {
			    out2.write(cbuf, 0, len);
			}
			
			in2.close();
			out2.close();
			
			while ((len = in3.read(cbuf, 0, cbuf.length)) != -1) {
			    out3.write(cbuf, 0, len);
			    
			    
			    
			}
			
			in3.close();
			out3.close();
			
			
			
			
			
			
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
