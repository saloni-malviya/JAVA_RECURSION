/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//..........Print numbers from 1 to n(increasing order)............
package Oops_concept;

public class Print_incresenum_recursion {
    public static void printnum(int n)
    {
        if(n==1)
        {
            System.out.println(n+" ");
            return;
        }
        printnum(n-1);
        System.out.println(n+" ");
    }
            
    public static void main(String[]args)
    {
        int n=10;
        printnum(n);
    }
    
}
