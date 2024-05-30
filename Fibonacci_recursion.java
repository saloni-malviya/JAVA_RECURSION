/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...............Program to print fibonacci series using recursion............
package Oops_concept;

public class Fibonacci_recursion {
    public static int fib(int n){
        if(n==0 || n==1)
        {
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int result=fnm1+fnm2;
        return result;
    }
    public static void main(String[]args)
    {
        int n=0;
        System.out.println(fib(n));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }
}
