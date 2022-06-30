/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package today;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amir
 */
public class counter {
            public static int d=3;
        public static int h=1;
        public static int m=1;
        public static int s=5;
    public static void timer(){

        
        new Thread( new Runnable() {
        public void run()  {

        
        while(true){
            try  { Thread.sleep( 10000 ); }
            catch (InterruptedException ie)  {}

            try {
                  s=s-1;
                  if(s<0){
                      s=5;
                      m=m-1;
                  }
                  
                  if(m<0){
                      m=5;
                      h=h-1;
                  }
                  
                  if(h<0){
                      h=2;
                      d=d-1;
                  }
                  
                  if(d<0){                     
                      activation.decision=1;
                      h=0;
                      m=0;
                      s=0;
                      d=0;
                      break;
                  }
                 // System.out.println(d+" "+h+" "+m+" "+s);
            } catch (Exception ex) {
                Logger.getLogger(counter.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        }
    } ).start();
    }
    
}
