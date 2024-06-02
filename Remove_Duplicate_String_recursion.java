/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//......Program to remove duplicates in a string.............
package Oops_concept;

public class Remove_Duplicate_String_recursion {
   public static void duplicateString(String str,int index,StringBuilder newstr,boolean map[])
   {
       //base case
       if(index==str.length())
       {
           System.out.println(newstr);
           return;
       }
       //work
       char currchar=str.charAt(index);
       if(map[currchar-'a']==true)
       {
           duplicateString(str,index+1,newstr,map);
       }
       else
       {
           map[currchar-'a']=true;
           duplicateString(str,index+1,newstr.append(currchar),map);
       }
       
   }
    public static void main(String[]args)
    {
        String str="salaaonni";
        int index=0;
        StringBuilder newstr=new StringBuilder("");
        boolean map[]=new boolean[26];
        duplicateString(str,index,newstr,map);
    }
}
