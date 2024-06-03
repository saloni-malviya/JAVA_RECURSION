/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Given n friends, each one can remain single or can be paired up with some other friends. 
//each friend can paired only once. find out the total number of ways in which friend can remain
//single or can be paired up.
package Oops_concept;

public class Friends_Pairing_Problem_recursion {
    public static int friendPair(int n)
    {
        //base case
        if(n==1 || n==2)
        {
            return n;
        }
        //kaam
        //single
        int fnm1=friendPair(n-1);
        //double
        int fnm2=friendPair(n-2);
        int pairways=(n-1)*fnm2;
        int result=fnm1+pairways;
        return result;
    }
    public static void main(String[]args)
    {
        int n=3;
        System.out.println(friendPair(n));
    }
}
