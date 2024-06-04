/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//.....Print all binary string of size N without consecutive ones............
package Oops_concept;

public class Binary_String_Problem_recursion {
    //0101010 0110000not
    public static void binaryString(int n,int lastspace,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        binaryString(n-1,0,str+"0");
        if(lastspace==0)
        {
            binaryString(n-1,1,str+"1");
        }
    }
    public static void main(String[]args)
    {
       
       binaryString(3,0,"");
    }
}
