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
import static today.MCUI.selectedcard;

public class WatermarkImage
{
    
  static JFrame f = new JFrame();
  

  
  
  public static void doTheJob(String str1,String str2,String str3,String str4)
    throws IOException
  {
    System.out.println("Working Directory = " + 
      System.getProperty("user.dir"));
    String Macron = System.getProperty("user.dir");
    File origFile = new File(Macron + "/models/Capture.JPG");
    ImageIcon icon = new ImageIcon(origFile.getPath());
    
    BufferedImage bufferedImage = new BufferedImage(icon.getIconWidth(), 
      icon.getIconHeight(), 1);
    
    Graphics graphics = bufferedImage.getGraphics();
    graphics.drawImage(icon.getImage(), 0, 0, null);
    
    Color color = Color.white;
    graphics.setColor(Color.BLACK);
    
    graphics.setFont(new Font("Arial Black", 1, 28));
    
    BufferedImage image = ImageIO.read(new File(selectedcard, ""));
    graphics.drawImage(image, 51, 15,200,195,null);
    graphics.drawString(str1, 150, 260);
    graphics.drawString(str2, 190, 340);
    graphics.drawString(str3, 120, 415);
    graphics.drawString(str4, 520, 415);

    String watermark = "";
    
    graphics.drawString(watermark, 0, icon.getIconHeight() / 2);
    graphics.dispose();
    File newFile = new File(Macron + "/temp"+"/mac40.jpg");
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
