package today;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Word {

	public static void process() throws Exception {
            

                String Macron = System.getProperty("user.dir");
		Path path = Paths.get(Macron + "/models/ENGAGEMENT.docx");
		byte[] byteData = Files.readAllBytes(path);

		// read as XWPFDocument from byte[]
		XWPFDocument doc = new XWPFDocument(new ByteArrayInputStream(byteData));

		int numberToPrint = 0;

		// you can edit paragraphs
		for (XWPFParagraph para : doc.getParagraphs()) {
			List<XWPFRun> runs = para.getRuns();

			numberToPrint++;
			for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("TFJ")){
                                System.out.println(text);
                                run.setText("ToDay", 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            }                        
                        
			for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("XCV")){
                                System.out.println(text);
                                run.setText(AddWindow.jTextField1.getText(), 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            }
                        
                        
                        
                        for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("WXQ")){
                                System.out.println(text);
                                run.setText(AddWindow.jTextField2.getText(), 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            }
                          
                            for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("YUI")){
                                System.out.println(text);
                                run.setText(AddWindow.jTextField3.getText(), 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            }       
                                                            
		}

		// save it
		FileOutputStream fos = new FileOutputStream(new File(Macron + "/temp/"+AddWindow.jTextField5.getText()+".docx"));
		doc.write(fos);
	}
        
        
        
        
        public static void processRecom() throws Exception {
            

                String Macron = System.getProperty("user.dir");
		Path path = Paths.get(Macron + "/models/RECOMANDATION.docx");
		byte[] byteData = Files.readAllBytes(path);

		// read as XWPFDocument from byte[]
		XWPFDocument doc = new XWPFDocument(new ByteArrayInputStream(byteData));

		int numberToPrint = 0;

		// you can edit paragraphs
		for (XWPFParagraph para : doc.getParagraphs()) {
			List<XWPFRun> runs = para.getRuns();

			numberToPrint++;
			for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("TFJ")){
                                System.out.println(text);
                                run.setText("ToDay", 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            }      
                        
                        Date date = new Date();
                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
System.out.println(formatter.format(date));
                        for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("EFV")){
                                System.out.println(text);
                                run.setText(formatter.format(date), 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            } 
                        
                        
                        
			for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("XCV")){
                                System.out.println(text);
                                run.setText(AddWindow.jTextField1.getText(), 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            }
                        
                        
                        
                        for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("WXQ")){
                                System.out.println(text);
                                run.setText(AddWindow.jTextField2.getText(), 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            }
                          
                            for (XWPFRun run : runs) {
                                
				// read text
				String text = run.getText(0);

				// edit text and update it
                                try{
                                if (text.contains("YUI")){
                                System.out.println(text);
                                run.setText(AddWindow.jTextField3.getText(), 0);
                                }else{
                                    run.setText(text, 0);
                                }
                                }catch(Exception e){
                                    
                                }
                            }       
                                                            
		}

		// save it
		FileOutputStream fos = new FileOutputStream(new File(Macron + "/temp/recomandation"+AddWindow.jTextField5.getText()+".docx"));
		doc.write(fos);
	}
}