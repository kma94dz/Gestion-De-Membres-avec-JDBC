package today;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class imageResise
{
    
  static JFrame f = new JFrame();
  

  
  
  public static void doTheJob(String IMAGE,String NEWIMAGE,int w,int h)
    throws IOException
  {
    System.out.println("Working Directory = " + 
      System.getProperty("user.dir"));
    String Macron = System.getProperty("user.dir");
    File origFile = new File(IMAGE);
    ImageIcon icon = new ImageIcon(origFile.getPath());
    
    BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), 
      icon.getIconHeight(), 1);
    
    Graphics graphics = bufferedImage.getGraphics();
    graphics.drawImage(icon.getImage(),0, 0,w,h,null);
    
    Color color = Color.white;
    graphics.setColor(Color.WHITE);   
    
    graphics.dispose();
    File newFile = new File(Macron + "/"+NEWIMAGE+".JPG");
    try
    {
      ImageIO.write(bufferedImage, "jpg", newFile);
    }
    catch (IOException e)
    {
      JOptionPane.showMessageDialog(f, "erreur ");
      
      e.printStackTrace();
    }
    System.out.println(newFile.getPath() + " created successfully!");
    System.out.println("Working Directory = " + 
      System.getProperty("user.dir"));
  }
}
