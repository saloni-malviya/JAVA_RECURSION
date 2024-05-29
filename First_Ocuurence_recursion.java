/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Write a function to find first occurance of an element in an array[i.e. found a key of an array]
package Oops_concept;

public class First_Ocuurence_recursion {
   public static int fnum(int arr[],int key,int i)
   {
       if(i==arr.length-1)
       {
           return -1;
       }
       if(arr[i]==key)
       {
           return i;
       }
       int result=fnum(arr,key,i+1);
       return result;
       
   }
    public static void main(String[]args)
  {
      int arr[]={2,3,6,4,3,8,7};
      int i=0;
      int key=3;
      System.out.println(fnum(arr,key,i));
  }
}
