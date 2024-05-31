/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//........Program to find factorial using recursion......................
package Oops_concept;

public class Factorial_recursion {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fmn=fact(n-1);
        int result=n*fmn;
        return result;
    }
    public static void main(String[]args)
    {
        int n=10;
        System.out.println(fact(n));
        
    }
}
