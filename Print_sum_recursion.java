/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...............Print sum of n natural numbers................
package Oops_concept;

public class Print_sum_recursion {
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int nm1=sum(n-1);
        int result=n+nm1;
        return result;
    }
    public static void main(String[]args)
    {
        int n=5;
        System.out.println("The sum of n natural numbers is:"+sum(n));
    }
}
