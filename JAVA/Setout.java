
package JAVA;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Setout {
    public static void main(String[] args)throws Exception {
        FileOutputStream o = new FileOutputStream("F:\\dspro\\JavaLibrary1\\src\\JAVA\\copy.txt");
        FileInputStream in = new FileInputStream("F:\\dspro\\JavaLibrary1\\src\\JAVA\\IO.java");
        PrintStream p = new PrintStream(o);
        System.setOut(p);
        System.setIn(in);
        System.out.println("this is me");
        Scanner s = new Scanner(System.in);
        System.out.println(s);
    }
}
