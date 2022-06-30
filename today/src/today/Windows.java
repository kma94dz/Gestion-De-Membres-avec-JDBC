package today;


import java.io.File;

//Windows solution to view a PDF file
public class Windows {

	public static void open(String pdfFile,String folder,String type) {

	  try {
                String DIR = System.getProperty("user.dir");
                DIR=DIR+"\\extractions\\"+folder+"\\"+pdfFile+"."+type;
                String filetopen=DIR.replace("\\", "/");
		if ((new File(filetopen)).exists()) {

			Process p = Runtime
			   .getRuntime()
			   .exec("explorer.exe \"file:"+filetopen);
			p.waitFor();
				
		} else {

			System.out.println("File is not exists");
System.out.println(filetopen);
		}

		System.out.println("Done");

  	  } catch (Exception ex) {
		ex.printStackTrace();
	  }

	}
}