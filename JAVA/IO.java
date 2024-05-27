package JAVA;

import java.io.*;
//import java.io.FileWriter;

public class IO {
    public static void main(String[] args)throws Exception {
       
        FileReader in1 = new FileReader("F:\\dspro\\JavaLibrary1\\src\\JAVA\\IO.java");
        FileInputStream in = new FileInputStream("F:\\dspro\\JavaLibrary1\\src\\JAVA\\IO.java");
        FileOutputStream out = new FileOutputStream("F:\\dspro\\JavaLibrary1\\src\\JAVA\\copydata.txt");
        FileWriter out1 = new FileWriter("F:\\dspro\\JavaLibrary1\\src\\JAVA\\copy.txt");
        byte arr[]=new byte[18];
        char arr1[]=new char[18];
        
        int c =in.read(arr);
        int a = in1.read(arr1);
//        System.out.println((char)c);
//        out.write(arr);
//        out1.write(arr1);
//        out1.flush();
    for(byte n : arr){
        System.out.print((char)n);
    }
        
        
    }
    
}

