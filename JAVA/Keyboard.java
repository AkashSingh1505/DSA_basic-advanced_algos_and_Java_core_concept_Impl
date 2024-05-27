
package JAVA;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class Keyboard extends JFrame {
    
    Keyboard(){
        addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e){
                System.out.println(e.getLocationOnScreen());
            }
            public void mouseDragged(MouseEvent n){
                System.out.println(n.getLocationOnScreen());
            }
        });
        setTitle("Notification");
        setSize(700,700);
        setVisible(true);
        setDefaultCloseOperation(3); 
    }
    public static void main(String[] args) {
        Keyboard k= new Keyboard();
    }
}
