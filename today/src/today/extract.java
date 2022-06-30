package today;

// Java Program to convert 
// byte array to file 
import java.io.File; 
import java.io.FileOutputStream; 
import java.io.OutputStream; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
  
public class extract { 

    
    public static void Bytes(String name,String bdd,String table,String column,String dir,String type) {
    //System.out.println("Creating a backup of all " + list.size() + " Documents!");
    try {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:"+bdd+".db");
        Statement stmt = con.createStatement();


            ResultSet rs = stmt.executeQuery("SELECT "+column+" FROM "+table+" WHERE MID='" + name+"'");
            if (rs.next()) {
                File file2 = new File("extractions/"+dir+"/"+name + "."+type);
                FileOutputStream fos = new FileOutputStream(file2);
                fos.write(rs.getBytes(column));
                fos.close();
            }else{
               System.out.println("Something Went Wrong! Please check stacktrace");  
            }
        
        //return true;
    } catch (Exception e) {
        System.out.println("Something Went Wrong! Please check stacktrace");
        e.printStackTrace();
    }
    //return false;
}
    
} 