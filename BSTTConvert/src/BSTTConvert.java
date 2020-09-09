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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BSTTConvert {

	public static final String UTF8_BOM = "\uFEFF";

	public static void main(String[] args) {

		System.out.println("Starting ...");

		try {

			String file0 = "DM_BI_DLYSales_GT";
			String file1 = "DM_BI_Stock_GT";
			String file2 = "DM_PENINV_GT";
			String file3 = "DM_M01_CUST";
			String ext = ".csv";

			Reader fr0 = new InputStreamReader(new FileInputStream("BSTTFiles" + File.separator + file0 + ext), "UTF8");
			Reader fr1 = new InputStreamReader(new FileInputStream("BSTTFiles" + File.separator + file1 + ext), "UTF8");
			Reader fr2 = new InputStreamReader(new FileInputStream("BSTTFiles" + File.separator + file2 + ext), "UTF8");
			Reader fr3 = new InputStreamReader(new FileInputStream("BSTTFiles" + File.separator + file3 + ext), "UTF8");

			BufferedReader in0 = new BufferedReader(fr0);
			BufferedReader in1 = new BufferedReader(fr1);
			BufferedReader in2 = new BufferedReader(fr2);
			BufferedReader in3 = new BufferedReader(fr3);

			Writer fw0 = new OutputStreamWriter(
					new FileOutputStream("BSTTFiles/Convert/" + file0 + "_" + getDateFormat() + ext), "UTF8");
			Writer fw1 = new OutputStreamWriter(
					new FileOutputStream("BSTTFiles/Convert/" + file1 + "_" + getDateFormat() + ext), "UTF8");
			Writer fw2 = new OutputStreamWriter(
					new FileOutputStream("BSTTFiles/Convert/" + file2 + "_" + getDateFormat() + ext), "UTF8");
			Writer fw3 = new OutputStreamWriter(
					new FileOutputStream("BSTTFiles/Convert/" + file3 + "_" + getDateFormat() + ext), "TIS620");

			BufferedWriter out0 = new BufferedWriter(fw0);
			BufferedWriter out1 = new BufferedWriter(fw1);
			BufferedWriter out2 = new BufferedWriter(fw2);
			BufferedWriter out3 = new BufferedWriter(fw3);

			boolean firstLine = true;

			for (String s = ""; (s = in0.readLine()) != null;) {
				if (firstLine) {
					s = removeUTF8BOM(s);
					firstLine = false;
				}

				out0.write(s + "\n");
				out0.flush();

			}

			out0.close();
			in0.close();

			firstLine = true;
			for (String s = ""; (s = in1.readLine()) != null;) {
				if (firstLine) {
					s = removeUTF8BOM(s);
					firstLine = false;
				}

				out1.write(s + "\n");
				out1.flush();

			}

			out1.close();
			in1.close();

			firstLine = true;
			for (String s = ""; (s = in2.readLine()) != null;) {
				if (firstLine) {
					s = removeUTF8BOM(s);
					firstLine = false;
				}

				out2.write(s + "\n");
				out2.flush();

			}

			out2.close();
			in2.close();

			for (String s = ""; (s = in3.readLine()) != null;) {

				out3.write(s + "\n");
				out3.flush();
			}

			out3.close();
			in3.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Done ...");

	}

	private static String removeUTF8BOM(String s) {
		if (s.startsWith(UTF8_BOM)) {
			s = s.substring(1);
		}
		return s;
	}

	private static String getDateFormat() {

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		// System.out.println(dateFormat.format(date));

		return (dateFormat.format(date)).toString();
	}

}
