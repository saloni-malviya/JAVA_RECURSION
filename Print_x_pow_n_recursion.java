/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...Print x^n(s to the power n) using recursion
package Oops_concept;

public class Print_x_pow_n_recursion {
    public static int power(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        int xm=power(x,n-1);
        int result=x*xm;
        return result;
        
    }
    
    public static void main(String[]args)
    {
        int x=2;
        int n=5;
        System.out.println(power(x,n));
    }
}
