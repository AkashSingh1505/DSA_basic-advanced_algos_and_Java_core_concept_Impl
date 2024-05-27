package JAVA;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyMenu {
    static class MyFrame extends Frame{
        MyFrame(){
            MenuBar bar= new MenuBar();
            Menu m1 =new Menu("File");
            Menu m2 = new Menu("Edit");
            Menu m3 =new Menu("View");
            Menu m4 = new Menu("Navigate");
                     Menu m5 =new Menu("New Project");
            Menu m6 = new Menu("Save");
                     Menu m7 =new Menu("New File");
            Menu m8 = new Menu("Save as");
                     Menu m9 =new Menu("Recent File");
            Menu m10 = new Menu("Delete");
                     Menu m11 =new Menu("Open File");
            Menu m12 = new Menu("Move");
                     Menu m13 =new Menu("Open folder");
            Menu m14 = new Menu("run");
            m1.add(m5);
            m1.add(m7);
            m1.add(m9);
           
             bar.add(m1);
              bar.add(m2);
               bar.add(m3);
                bar.add(m4);
                 bar.add(m6);
                  bar.add(m8);
                   bar.add(m10);
                    bar.add(m11);
                     bar.add(m12);
                      bar.add(m13);
                       bar.add(m14);
            MenuItem i =new MenuItem("only");
                        MenuItem a =new MenuItem("on54646ly");
            MenuItem b =new MenuItem("onlsdcsdfy");

            m1.add(i);
                        m1.add(a);
                                    m1.add(b);
            setMenuBar(bar);
            setVisible(true);
            setLayout(null);
            setSize(300,300);
         addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent e){
                 System.exit(0);
             }
         });


        }
    }
    public static void main(String[] args) {
        MyFrame obj=new MyFrame();
    }
}
