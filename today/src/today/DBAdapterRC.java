/* 
 * To change this template, choose Tools | Templates 
 * and open the template in the editor. 
 */  
package today;  
  
import java.awt.Image;  
import java.awt.Toolkit;  
import java.awt.image.BufferedImage;  
import java.io.DataInputStream;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;  
import java.sql.Blob;  
import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;  
import java.sql.ResultSet;  
import java.sql.SQLException;
import java.sql.Statement;  
import javax.swing.ImageIcon;  
import javax.swing.JOptionPane;  
/** 
 * 
 * @author Kanishka 
 *  
 * CREATE TABLE 'imagetable'( 
  name TEXT, 
  image BLOB 
  ); 
 */  
public class DBAdapterRC {  
    public static DBConnectionMgrRC DBCM;  
      
    public DBAdapterRC(){  
        DBCM=new DBConnectionMgrRC();  
    }  
      
        /**private method to get byte array from bytestream 
     * * 
     *  
     */  

      
    public static void addImageToDB(String name,String imageName) throws FileNotFoundException, IOException, SQLException{  
        File pdfFile = new File("temp/recomandation"+imageName+".docx");
byte[] pdfData = new byte[(int) pdfFile.length()];
DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
dis.readFully(pdfData);  // read from file into byte[] array
dis.close();

String myConnectionString ="jdbc:sqlite:rcs.db";
Connection dbConnection = DriverManager.getConnection(myConnectionString);
try{
JDBC.inserttoRCs("rcs.db","rc",name);
}catch(Exception e){
    
}
PreparedStatement ps = dbConnection.prepareStatement("UPDATE rc SET RC=(?) WHERE MID='"+name+"'");
ps.setBytes(1, pdfData);  // byte[] array
ps.executeUpdate();
    }  
      
   
      
}  