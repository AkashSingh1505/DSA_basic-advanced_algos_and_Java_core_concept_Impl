/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package JAVA;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Exp {
    static boolean isDouble(String arr[],String s,int ix){
        for(int i=0;i<arr.length;i++){
            if(i!=ix && arr[i].equals(s)){
                return true;
            }
        }
        return false;
    }
    static void printUnique(String arr[]){
        for(int i=0;i<arr.length;i++){
            if(!isDouble(arr, arr[i], i)){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[]) {
        // TODO code application logic here
       String arr[]={"cat","ball","cat","ballon","home","ballon"};
       printUnique(arr);
    }
}
