/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Akash singh
 */
public class Copy {
    public static void main(String[] args)throws Exception {
        FileInputStream in = new FileInputStream("E:\\java.PNG");
        FileOutputStream out = new FileOutputStream("E:\\copy.PNG");
        int c;
        while((c=in.read())!=-1){
            out.write(c);
        }
    }
}
