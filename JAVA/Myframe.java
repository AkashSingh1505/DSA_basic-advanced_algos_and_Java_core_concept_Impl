
package JAVA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTable;


public class Myframe extends JFrame implements ActionListener{
    JButton b;
    Myframe(){
        JTable t = new JTable();
       
        b=new JButton("Click");
        b.addActionListener(this);
        
//        add(b);
//        add(t);
        JList chb = new JList();
        chb.add(b);
        add(chb);
        setVisible(true);
        setSize(300,300);
        setTitle("Swing");
//        JFrame i = new JFrame();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        b.setText("Thanks for clicking me");
    }
    public static void main(String[] args) {
        Myframe ok = new Myframe();
    }
}
    
  