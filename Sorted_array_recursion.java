/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//.............Program to check given array is sorted or not
package Oops_concept;

public class Sorted_array_recursion {
    public static boolean sortarray(int arr[],int i)
    {
        if(arr[i]==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return sortarray(arr,i+1);
        
    }
    
    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,5};
        int i=0;
        System.out.println(sortarray(arr,i));
    }
    
}
