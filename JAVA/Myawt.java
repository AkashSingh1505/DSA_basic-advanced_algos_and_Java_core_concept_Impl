//dialog box bnana hai
package JAVA;

import java.awt.*;
import java.awt.event.*;

public class Myawt  { 
    Myawt(){
        Frame f = new Frame();
        Dialog b = new Dialog(f,"I Am Pop up",true);
       Button n = new Button("click");
        b.setSize(300, 300);
        b.add(n);

       b.setVisible(true);
//        setTitle("text");
        
      
       
    }
    public static void main(String[] args) {
        Myawt o = new Myawt();
    }
}

