/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//........Print Optimized x^n( x to the power n) using recursion................
//........TIME COMPLEXITY = O(LOG N)
package Oops_concept;

public class PrintOptimized_x_pow_n_recursion {
    public static int power(int x,int n)
    {
        //base case
        if(n==0)
        {
            return 1;
        }
        int mn=power(x,n/2);
        int result=mn*mn;
        
        if(n%2 !=0)
         {
             result=x*result;
         }
        return result;
    }
    
    public static void main(String[]args)
    {
        int x=2;
        int n=10;
        System.out.println(power(x,n));
    }
    
}
