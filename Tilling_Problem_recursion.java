/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//.....Tiller Problem
//....Given a "2 X n" board(floor) and tiles of size is "2x1" count number of ways to tiles 
//the given board using "2x1" tiles.(a tile can either be placed horizontally or vertically)
package Oops_concept;

public class Tilling_Problem_recursion {
    public static int tilling(int n)
    {
        //base case
        if(n==0 || n==1)
        {
            return 1;
        }
        //work
        //vertically
        int fnm=tilling(n-1);
        //horizontally
        int fnm1=tilling(n-2);
        int result=fnm+fnm1;
        return result;
                                                                                                                                        
        
    }
    public static void main(String[]args)
    {
        System.out.println(tilling(4));
    }
}
