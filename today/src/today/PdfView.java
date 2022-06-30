package today;



import com.adobe.acrobat.Viewer;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amir
 */
public class PdfView extends JPanel {
    private Viewer viewer;
    public PdfView(String nomfichier) throws Exception{
        this.setLayout(new BorderLayout());
        viewer = new Viewer();
        FileInputStream fi = new FileInputStream(nomfichier); 
        viewer.setDocumentInputStream(fi);
        this.add(viewer,BorderLayout.CENTER);
        viewer.activate();
        
    }
    public static void dispPDF() throws Exception {
        PdfView lecteur= new PdfView(dISPWindow.jTextField5.getText()+".pdf");
        JFrame f =new JFrame(dISPWindow.jTextField5.getText());
        f.setSize(1200, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.getContentPane().add(lecteur);
        
    }
}
