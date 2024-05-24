/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Print numbers from n to 1(decresing order) using recursion
package Oops_concept;

public class Print_number_recursion {
   public static void printdec(int n)
   {
       if(n==1)
       {
           System.out.println(n+" ");
           return;
       }
      System.out.println(n+" ");
      printdec(n-1);
   }
    public static void main(String[]args)
    {
        int n=10;
        printdec(n);
    }
}

