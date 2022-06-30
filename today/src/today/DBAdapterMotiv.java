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
public class DBAdapterMotiv {  
    public static DBConnectionMgrCv DBCM;  
      
    public DBAdapterMotiv(){  
        DBCM=new DBConnectionMgrCv();  
    }  
      
        /**private method to get byte array from bytestream 
     * * 
     *  
     */  

      
    public static void addImageToDB(String name,String imageName) throws FileNotFoundException, IOException, SQLException{  
        File pdfFile = new File(imageName+"");
byte[] pdfData = new byte[(int) pdfFile.length()];
DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
dis.readFully(pdfData);  // read from file into byte[] array
dis.close();

String myConnectionString ="jdbc:sqlite:mos.db";
Connection dbConnection = DriverManager.getConnection(myConnectionString);
try{
JDBC.inserttoCVs("mos.db","mo",name);
}catch(Exception e){
    
}
PreparedStatement ps = dbConnection.prepareStatement("UPDATE mo SET MO=(?) WHERE MID='"+name+"'");
ps.setBytes(1, pdfData);  // byte[] array
ps.executeUpdate();
    }  
      
   
      
}  