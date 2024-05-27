
package JAVA;
import java.awt.BorderLayout;
import javax.swing.*;

public class BorderL extends JFrame {
    JButton b1,b2,b3,b4,b5;
    BorderL(){
        b1 = new JButton("East");
        b2 = new JButton("west");
        b3 = new JButton("north");
        b4 = new JButton("south");
        b5 = new JButton("center");
        
        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);

        add(b3,BorderLayout.NORTH);

        add(b4,BorderLayout.SOUTH);

        add(b5,BorderLayout.CENTER);

                                             
        setTitle("Notification");
        setSize(700,700);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        BorderL obj = new BorderL();
    }
}
