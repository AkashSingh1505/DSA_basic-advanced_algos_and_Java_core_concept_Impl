
package Recurrsion;

import java.util.Scanner;


public class Factorial {
    public static int fact(int n){
        if(n==1)return n;
        return n*fact(n-1);
    }
    
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int n = input.nextInt();
        System.out.println("fact is : "+fact(n));
    }
}
